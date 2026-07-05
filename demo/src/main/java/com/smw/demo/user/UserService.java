package com.smw.demo.user;

import com.smw.demo.common.exception.DuplicateEmailException;
import com.smw.demo.common.exception.UserNotFoundException;
import com.smw.demo.user.dto.UserCreateRequest;
import com.smw.demo.user.dto.UserResponse;
import com.smw.demo.user.dto.UserUpdateRequest;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class UserService {

	private final UserRepository userRepository;

	@Transactional
	public UserResponse create(UserCreateRequest request) {
		if (userRepository.existsByEmail(request.email())) {
			throw new DuplicateEmailException(request.email());
		}
		User user = User.builder()
			.email(request.email())
			.name(request.name())
			.build();
		return UserResponse.from(userRepository.save(user));
	}

	public List<UserResponse> findAll() {
		return userRepository.findAll().stream()
			.map(UserResponse::from)
			.toList();
	}

	public UserResponse findById(Long id) {
		return UserResponse.from(getUser(id));
	}

	@Transactional
	public UserResponse update(Long id, UserUpdateRequest request) {
		User user = getUser(id);
		if (!user.getEmail().equals(request.email())
			&& userRepository.existsByEmail(request.email())) {
			throw new DuplicateEmailException(request.email());
		}
		user.update(request.email(), request.name());
		// @UpdateTimestamp는 flush 시점에 적용되므로 응답에 반영되도록 즉시 flush
		userRepository.flush();
		return UserResponse.from(user);
	}

	@Transactional
	public void delete(Long id) {
		userRepository.delete(getUser(id));
	}

	private User getUser(Long id) {
		return userRepository.findById(id)
			.orElseThrow(() -> new UserNotFoundException(id));
	}
}

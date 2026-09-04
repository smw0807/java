package poly.ex.pay1;

import static poly.ex.pay1.PayStore.findPay;

public class PayService {

    public void processPay(String payOption1, int amount1) {
        System.out.println("결제를 시작합니다: options=" + payOption1 + ", amount=" + amount1);

        Pay pay = findPay(payOption1);
        boolean result = pay.pay(amount1);

        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }


}

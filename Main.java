import com.silphco.PayD;
import com.teamrocket.Xpay;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     Xpay xpay = new Xpayimpi() ;
     xpay.setCreditCardNo("4789565874102365");
     xpay.setCustomerName("Somchai Jaidee");
     xpay.setCardExpMonth("09");
     xpay.setCardExpYear("25");
     xpay.setCardCVVNo((short) 235);
     xpay.setAmount(2565.23);

        PayD payX = new XpayToPayDAdapter(xpay);

    }
}
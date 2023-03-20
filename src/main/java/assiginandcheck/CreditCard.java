package assiginandcheck;

import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreditCard extends CloneNotSupportedException implements Cloneable {
    protected final transient Logger l = Logger.getLogger("GatherInfo");
    private final String username;
    private final String cardExpDate;
    private final String cardNumber;

    protected CreditCard(String name, String num, String expire) {
        username = name;
        cardExpDate = expire;
        cardNumber = num;
    }

    public Object clone() throws CloneNotSupportedException {
        l.info("\n Object has been Cloned Successfully ....\n");
        return super.clone();
    }

    protected int equal(String cardNumber1) {
        return (!Objects.equals(cardNumber, cardNumber1)) ? 1 : 0;
    }

    public void display() {
        l.log(Level.INFO,()->("\n  Card Holder Name  :  " + username + "\n  Card Number       :  " + cardNumber
                + "\n  Card Expire Date :  " + cardExpDate));
    }


}

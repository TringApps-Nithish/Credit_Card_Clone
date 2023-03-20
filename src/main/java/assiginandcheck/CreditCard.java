package assiginandcheck;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CreditCard extends CloneNotSupportedException implements Cloneable {
    protected final transient Logger l = Logger.getLogger("GatherInfo");
    private final String Card_holder_name;
    private final String Card_Exp_Date;
    private final String Card_number;

    protected CreditCard(String name, String num, String expiry) {
        Card_holder_name = name;
        Card_Exp_Date = expiry;
        Card_number = num;
    }

    public Object clone() throws CloneNotSupportedException {
        l.info("\n Object has been Cloned Successfully ....\n");
        return super.clone();
    }

    protected int equal(String card_num1) {
        return (Card_number == card_num1) ? 1 : 0;
    }

    public void display() {
        l.log(Level.INFO,()->("\n  Card Holder Name  :  " + Card_holder_name + "\n  Card Number       :  " + Card_number
                + "\n  Card Expirey Date :  " + Card_Exp_Date));
    }


}

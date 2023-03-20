package assiginandcheck;

import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreditCard extends CloneNotSupportedException implements Cloneable {
    protected final transient Logger l = Logger.getLogger("GatherInfo");
    private final String username;
    private final String CardExpDate;
    private final String CardNumber;

    protected CreditCard(String name, String num, String expiry) {
        username = name;
        CardExpDate = expiry;
        CardNumber = num;
    }

    public Object clone() throws CloneNotSupportedException {
        l.info("\n Object has been Cloned Successfully ....\n");
        return super.clone();
    }

    protected int equal(String CardNumber1) {
        return (!Objects.equals(CardNumber, CardNumber1)) ? 1 : 0;
    }

    public void display() {
        l.log(Level.INFO,()->("\n  Card Holder Name  :  " + username + "\n  Card Number       :  " + CardNumber
                + "\n  Card Expire Date :  " + CardExpDate));
    }


}

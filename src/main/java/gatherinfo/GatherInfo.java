package gatherinfo;

import assiginandcheck.CreditCard;

import java.util.Scanner;
public class GatherInfo extends CreditCard {


    public GatherInfo(String name, String number, String expiryDate) {
        super(name, number, expiryDate);
    }

    public void run() throws CloneNotSupportedException {
        Scanner sc = new Scanner(System.in);
        String name = null;
        String cardNumber = null;
        String expiryDate = null;
        String name1 = null;
        String cardNumber1 = null;
        String expiryDate1 = null;
        try {
            l.info(" ----- Credit Card Using Cloning ----- ");
            l.info(" Enter 1st Card Details: \n Enter Card Holder Name : ");
            name = sc.next();
            l.info(" Enter Card Number : ");
            cardNumber = sc.next();
            l.info(" Enter Expire Date : ");
            expiryDate = sc.next();
            l.info(" Enter 2nd Card Details: \n Enter Card Holder Name : ");
            name1 = sc.next();
            l.info(" Enter Card Number : ");
            cardNumber1 = sc.next();
            l.info(" Enter Expire Date : ");
            expiryDate1 = sc.next();

            if (cardNumber.length() < 8 || cardNumber1.length() < 8) {
                throw new OutRangeException();
            }

        } catch (OutRangeException e) {
            l.info(" EXCEPTION WARNING --> Card Number Must have 8 Digits ..... ");
        } finally {
            GatherInfo obj = new GatherInfo(name, cardNumber, expiryDate);
            GatherInfo obj1 = (GatherInfo) obj.clone();
            GatherInfo obj2 = new GatherInfo(name1, cardNumber1, expiryDate1);
            l.info("\n Members of Cloned Object ->");
            obj1.display();
            l.info("\n Members of Object - 2 ->");
            obj2.display();
            int answer = obj1.check(cardNumber1);
            if (answer == 1)
                l.info("\n Both Credit Card Numbers are Same ");
            else
                l.info("\n Both Credit Card Numbers are Not Same ");
        }
    }
}

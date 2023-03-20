package gatherinfo;

import assiginandcheck.CreditCard;

import java.util.Scanner;
public class GatherInfo extends CreditCard {
    private String name;
    private String card_number;
    private String expiry_date;
    private String name1;
    private String card_number1;
    private String expiry_date1;

    public GatherInfo(String name, String number, String expiry_date) {
        super(name, number, expiry_date);
    }

    public void run() throws CloneNotSupportedException {
        Scanner sc = new Scanner(System.in);
        try {
            l.info(" ----- Credit Card Using Cloning ----- ");
            l.info(" Enter 1st Card Details: \n Enter Card Holder Name : ");
            name = sc.next();
            l.info(" Enter Card Number : ");
            card_number = sc.next();
            l.info(" Enter Expire Date : ");
            expiry_date = sc.next();
            l.info(" Enter 2nd Card Details: \n Enter Card Holder Name : ");
            name1 = sc.next();
            l.info(" Enter Card Number : ");
            card_number1 = sc.next();
            l.info(" Enter Expire Date : ");
            expiry_date1 = sc.next();

            if (card_number.length() < 8 || card_number1.length() < 8) {
                throw new OutRangeException();
            }

        } catch (OutRangeException e) {
            l.info(" EXCEPTION WARNING --> Card Number Must have 8 Digits ..... ");
        } finally {
            GatherInfo obj = new GatherInfo(name, card_number, expiry_date);
            GatherInfo obj1 = (GatherInfo) obj.clone();
            GatherInfo obj2 = new GatherInfo(name1, card_number1, expiry_date1);
            l.info("\n Members of Cloned Object ->");
            obj1.display();
            l.info("\n Members of Object - 2 ->");
            obj2.display();
            int answer = obj1.equal(card_number1);
            if (answer == 1)
                l.info("\n Both Credit Card Numbers are Same ");
            else
                l.info("\n Both Credit Card Numbers are Not Same ");
        }
    }
}

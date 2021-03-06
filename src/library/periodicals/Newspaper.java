package library.periodicals;

import library.libraryitems.Periodical;
import library.enums.SubscriptionPeriods;

public class Newspaper extends Periodical {

    private boolean blackAndWhite;
    private int numOfColumns;

    public Newspaper(String name, int checkoutDurationInDays, boolean stocked, boolean educationalContent,
                      SubscriptionPeriods subscriptionClass, boolean blackAndWhite, int numOfColumns) {
        super(name, checkoutDurationInDays, stocked, educationalContent, subscriptionClass);
        setBlackAndWhite(blackAndWhite);
        setNumOfColumns(numOfColumns);
    }

    public boolean isBlackAndWhite() {
        return blackAndWhite;
    }

    public void setBlackAndWhite(boolean blackAndWhite) {
        this.blackAndWhite = blackAndWhite;
    }

    public int getNumOfColumns() {
        return numOfColumns;
    }

    public void setNumOfColumns(int numOfColumns) {
        this.numOfColumns = numOfColumns;
    }

    public void isItBlackAndWhite() {
        System.out.println(blackAndWhite ? "This newspaper is printed in black and white." :
                "This newspaper is printed in color.");
    }

}
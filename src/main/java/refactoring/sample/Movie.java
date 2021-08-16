package refactoring.sample;

import refactoring.sample.price.ChildrenPrice;
import refactoring.sample.price.NewReleasePrice;
import refactoring.sample.price.Price;
import refactoring.sample.price.RegularPrice;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    private Price price;

    public Movie(
            String title,
            int priceCode
    ) {
        this.title = title;
        setPriceCode(priceCode);
    }

    public int getPriceCode() {
        return this.price.getPriceCode();
    }

    public void setPriceCode(int arg) {
        switch (arg) {
            case REGULAR:
                this.price = new RegularPrice();
                break;
            case CHILDRENS:
                this.price = new ChildrenPrice();
                break;
            case NEW_RELEASE:
                this.price = new NewReleasePrice();
                break;
        }
    }

    public String getTitle() {
        return this.title;
    }

    public double getCharge(int daysRented) {
        return this.price.getCharge(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented) {
        return this.price.getFrequentRenterPoints(daysRented);
    }
}

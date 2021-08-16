package refactoring.sample.price;

import refactoring.sample.Movie;

public class NewReleasePrice extends Price {
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    public double getCharge(int dayRented) {
        return dayRented * 3;
    }
}

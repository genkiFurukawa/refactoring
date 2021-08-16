package refactoring.sample.price;

import refactoring.sample.Movie;

public class RegularPrice extends Price {
    public int getPriceCode() {
        return Movie.REGULAR;
    }
}

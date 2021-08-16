package refactoring.sample.price;

import refactoring.sample.Movie;

public class NewReleasePrice extends Price {
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }
}

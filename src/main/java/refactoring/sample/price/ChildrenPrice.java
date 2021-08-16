package refactoring.sample.price;

import refactoring.sample.Movie;

public class ChildrenPrice extends Price {
    public int getPriceCode() {
        return Movie.CHILDRENS;
    }
}
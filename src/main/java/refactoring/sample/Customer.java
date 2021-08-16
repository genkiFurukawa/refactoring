package refactoring.sample;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(
            String name
    ) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        this.rentals.add(rental);
    }

    public String getName() {
        return this.name;
    }

    public String statement() {
        String result = "Rental Record for " + getName() + "¥n";

        // 1行ごとに金額を計算
        for (Rental rental : this.rentals) {
            // この貸し出しに関する数値の表示
            result += "¥t" + rental.getMovie().getTitle() + "¥t" + rental.getCharge() + "¥n";
        }
        // フッタ部分の追加
        result += "Amount owed is " + getTotalCharge() + "¥n";
        result += "You earned " + getFrequentRenterPoints() + " frequnt renter points";

        return result;
    }

    private int getFrequentRenterPoints() {
        int result = 0;
        for (Rental rental : this.rentals) {
            // レンタルポイントを加算
            result += rental.getFrequentRenterPoints();
        }
        return result;
    }

    private double getTotalCharge() {
        double result = 0;
        for (Rental rental : this.rentals) {
            result += rental.getCharge();
        }
        return result;
    }
}

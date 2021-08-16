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
        double totalAmount = 0;
        int frequntRenterPoints = 0;

        String result = "Rental Record for " + getName() + "¥n";

        // 1行ごとに金額を計算
        for (Rental rental : this.rentals) {
            // レンタルポイントを加算
            frequntRenterPoints++;

            // 新作を2日以上借りた場合はボーナスポイント
            if (rental.getMovie().getPriceCode() == Movie.NEW_RELEASE && rental.getDaysRented() > 1) {
                frequntRenterPoints++;
            }

            // この貸し出しに関する数値の表示
            result += "¥t" + rental.getMovie().getTitle() + "¥t" + rental.getCharge() + "¥n";
            totalAmount += rental.getCharge();
        }
        // フッタ部分の追加
        result += "Amount owed is " + totalAmount + "¥n";
        result += "You earned " + frequntRenterPoints + " frequnt renter points";

        return result;
    }
}

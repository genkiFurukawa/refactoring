package refactoring.sample;

public class App {
    public static void main(String args[]){
        System.out.println(">> App.main()");
        Customer customer = new Customer("test");

        Movie movie = new Movie("Movie.CHILDRENS", Movie.CHILDRENS);
        Rental rental = new Rental(movie, 7);
        customer.addRental(rental);

        movie = new Movie("Movie.NEW_RELEASE", Movie.NEW_RELEASE);
        rental = new Rental(movie, 1);
        customer.addRental(rental);

        movie = new Movie("Movie.REGULAR", Movie.REGULAR);
        rental = new Rental(movie, 1);
        customer.addRental(rental);

        String result = customer.htmlStatement();
        System.out.println(result);
        System.out.println("<< App.main()");
    }
}

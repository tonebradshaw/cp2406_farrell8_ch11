/**
 * Created by tony on 7/09/2016.
 */
public class UseBook {

    public static void main(String[] args) {

        Fiction fiction = new Fiction("The Book of the Dead");
        NonFiction nonFiction = new NonFiction("Gladly");

        System.out.println("The book's title is \"" + fiction.getTitle() + "\" and the price is $" + fiction.getPrice());
        System.out.println("The book's title is \"" + nonFiction.getTitle() + "\" and the price is $" + nonFiction.getPrice());
    }
}

/**
 * Created by tony on 7/09/2016.
 */
public class BookArray{

    static Book [] bookArray = new Book [10];

    public static void main(String[] args) {

        Fiction one = new Fiction("One");
        bookArray[0] = one;
        NonFiction two = new NonFiction("Two");
        bookArray[1] = two;
        Fiction three = new Fiction("Three");
        bookArray[2] = three;
        NonFiction four = new NonFiction("Four");
        bookArray[3] = four;
        Fiction five = new Fiction("Five");
        bookArray[4] = five;
        NonFiction six = new NonFiction("Six");
        bookArray[5] = six;
        Fiction seven = new Fiction("Seven");
        bookArray[6] = seven;
        NonFiction eight = new NonFiction("Eight");
        bookArray[7] = eight;
        Fiction nine = new Fiction("Nine");
        bookArray[8] = nine;
        NonFiction ten = new NonFiction("Ten");
        bookArray[9] = ten;

        for(int i = 0; i< bookArray.length; ++i){

            System.out.println("The title is \"" + bookArray[i].getTitle() + "\" and the price is $" + bookArray[i].getPrice());
        }
    }


}

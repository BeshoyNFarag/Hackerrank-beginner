import java.io.*;
import java.util.*;
import java.util.Scanner;

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}
class MyBook extends Book{
    public void setTitle(String s){
        System.out.println("The title is: " + s);
    }

}

public class AbstractClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyBook myBook = new MyBook();

        String title = scanner.nextLine();
        myBook.setTitle(title);


    }
}
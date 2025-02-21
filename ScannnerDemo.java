//import the class Scanner from util package.
import java.util.Scanner;
class ScannerDemo{
    public static void main(String args[]){
        //Create the object of Scanner class using System.in
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String : ");
        String s =sc.nextLine();//nextLine is used to read the line.
        System.out.println("You entered a string : "+s);
    }
}
package day001averagecalculator;
import java.util.Scanner;


public class Day001AverageCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
//        System.out.println("Enter Math marks: ");
//        int maths = input.nextInt();
//        
//        System.out.println("Enter Science marks: ");
//        int science = input.nextInt();
//        
//        System.out.println("Enter English marks: ");
//        int english = input.nextInt();
//        
//        int allSubjectsMarks = maths + science + english;
//        
//        double average = allSubjectsMarks / 3.0;
//        System.out.println("Average :" + average); 

        System.out.println("Enter Your Tatal amount: ");
        double totalAmount = input.nextInt();
        
        System.out.println("Enter you paid: ");
        double cashPaid = input.nextInt();
        
        double balance = cashPaid - totalAmount;
        
        System.out.println("Balance :" + balance);

    }
    
}

package simplecalculator;

import java.util.Scanner;

public class Calculator{

    public static void main(String[] args) {

       


        Scanner input = new Scanner(System.in);
        double userInput1;
        int userChoice;

        System.out.print("Please Enter The First Number: ");
        userInput1 = input.nextDouble();
        System.out.print("Please Enter The Second Number: ");
        double userInput2 = input.nextDouble();
        System.out.println("Please Select Operation to Perform:");
        System.out.println("1-Addition");
        System.out.println("2-Subtraction");
        System.out.println("3-Division");
        System.out.println("4-Multiplication");
        userChoice = input.nextInt();
       
        switch (userChoice){
        case 1:
            addition ad=new addition();
            ad.opp(userInput1,userInput2);
            
            break;
        case 2:
        	   subtraction sub=new subtraction();
        	   sub.opp(userInput1,userInput2);
               break;
           case 3:
               division div=new division();
               div.opp(userInput1,userInput2);
               break;
           case 4:
               multiplication mul=new multiplication();
               mul.opp(userInput1,userInput2);
               break;
           }


       }

   }

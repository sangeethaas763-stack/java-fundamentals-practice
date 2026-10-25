
1. Java var and data types:
public class JavaPractice {
    public static void main(String[] args) {

        String StudentName = "Sangee";
        int age = 24;
        double mark = 99.0;
        boolean passed = true;

        System.out.println("Student Name: " + StudentName);
        System.out.println("Age: " + age);
        System.out.println("Mark: " + mark);
        System.out.println("Passed: " + passed);
    }
}



   
Operators and variable manipulation

public class JavaFundamentalsPractice {
    public static void main(String[] args) {

        double balance = 5000;
        double deposit = 2000;

        balance = balance + deposit;

        System.out.println("deposit: Rs. " + deposit);
        System.out.println("Updated balance: Rs. " + balance);
    }
}




if-else conditions

public class JavaFundamentalsPractice {
    public static void main(String[] args) {

        double balance = 1000;
        double withdrawal = 1500;

        if (withdrawal > 0 && withdrawal <= balance) {
            balance = balance - withdrawal;
            System.out.println("Withdrawal successful");
            System.out.println("Remaining balance: Rs. " + balance);
        } else {
            System.out.println("Invalid amount or insufficient balance");
        }
    }
}


Loops:

     public class JavaFundamentalsPractice {
   public static void main(String[] args) {

       for (int i=1; i<=5; i++){
           System.out.println("Transaction number: " + i);
        }
     }                 
}




Scanner

import java.util.Scanner;

public class JavaFundamentalsPractice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter deposit amount: ");
        double deposit = sc.nextDouble();

        double balance = 5000;
        balance = balance + deposit;

        System.out.println("Welcome, " + name);
        System.out.println("Updated balance: Rs. " + balance);

        sc.close();
    }
}

Methods


public class JavaFundamentalsPractice {

    static double calculateBill(double price, int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {

        double total = calculateBill(500, 3);

        System.out.println("Total bill: Rs. " + total);
    }
}





Simple ATM Project:


import java.util.Scanner;

public class SimpleATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double balance = 5000;
        int choice = 0;

        while (choice != 4) {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Balance: " + balance);

            } else if (choice == 2) {
                System.out.print("Enter deposit amount: ");
                double amount = sc.nextDouble();

                if (amount > 0) {
                    balance += amount;
                    System.out.println("Deposit successful");
                } else {
                    System.out.println("Invalid amount");
                }

            } else if (choice == 3) {
                System.out.print("Enter withdrawal amount: ");
                double amount = sc.nextDouble();

                if (amount > 0 && amount <= balance) {
                    balance -= amount;
                    System.out.println("Withdrawal successful");
                } else {
                    System.out.println("Invalid amount or insufficient balance");
                }

            } else if (choice == 4) {
                System.out.println("Thank you!");

            } else {
                System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}

















      

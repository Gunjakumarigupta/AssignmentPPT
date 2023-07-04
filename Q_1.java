package PPTAssignment3CoreJava;

import java.util.Scanner;

public class Q_1 {
    public static void main(String[] args) {
        bank b = new bank();
        b.accountNumber();
        b.introduction();
    }
}
    class bank {
        public void accountNumber() {
            System.out.println("******************************");
            System.out.println("      WELCOME TO ABC BANK     ");
            System.out.println("******************************");
            System.out.println("------------------------------------------------");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your account number(that is mention below) to know the details :-");
            String[] arr;
            arr = new String[5];
            arr[0] = "1.     34892-24297";
            arr[1] = "2.     87997-25552";
            arr[2] = "3.     55452-25545";
            arr[3] = "4.     25149-42562";
            arr[4] = "5.     90876-15562";
            System.out.println("No." + "    " + "Account number");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
        public  void introduction() {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            for (int i = 1; i <= num; i++) {
                if (num == 1) {
                    System.out.println("-------------------------------");
                    System.out.println("Account number : 34892-24297");
                    System.out.println("Name : Shyam kumar");
                    System.out.println("Father's name : Mr. Narayan");
                    System.out.println("A/C type : SAVINGS BANK ACCOUNT");
                    System.out.println("Address : Delhi");
                    System.out.println("Phone number : 9080275892");
                    System.out.println("Bank balance : Rs 100000");
                    System.out.println("-------------------------------");
                    break;
                }
                if (num == 2) {
                    System.out.println("-------------------------------");
                    System.out.println("Account number : 87997-25552");
                    System.out.println("Name : Geeta kumari");
                    System.out.println("Father's name : Mr. Rajkumar");
                    System.out.println("A/C type : SAVINGS BANK ACCOUNT");
                    System.out.println("Address : Patna");
                    System.out.println("Phone number : 9086637373");
                    System.out.println("Bank balance : Rs 15000");
                    System.out.println("-------------------------------");
                    break;
                }
                if (num == 3) {
                    System.out.println("-------------------------------");
                    System.out.println("Account number : 55452-25545");
                    System.out.println("Name : Maya Gupta");
                    System.out.println("Father's name : Mr. Rahul");
                    System.out.println("A/C type : SAVINGS BANK ACCOUNT");
                    System.out.println("Address : Kolkata");
                    System.out.println("Phone number : 2663637373");
                    System.out.println("Bank balance : Rs 150000");
                    System.out.println("-------------------------------");
                    break;
                }
                if (num == 4) {
                    System.out.println("-------------------------------");
                    System.out.println("Account number :  25149-42562");
                    System.out.println("Name : Shiv singh");
                    System.out.println("Father's name : Mr. Amit");
                    System.out.println("A/C type : SAVINGS BANK ACCOUNT");
                    System.out.println("Address : Dehri");
                    System.out.println("Phone number : 9039767373");
                    System.out.println("Bank balance : Rs 55000");
                    System.out.println("-------------------------------");
                    break;
                }
                if (num == 5) {
                    System.out.println("-------------------------------");
                    System.out.println("Account number : 90876-15562");
                    System.out.println("Name : Priya kumari");
                    System.out.println("Father's name : Mr. Pankaj");
                    System.out.println("A/C type : SAVINGS BANK ACCOUNT");
                    System.out.println("Address : Mumbai");
                    System.out.println("Phone number : 2525029373");
                    System.out.println("Bank balance : Rs 75000");
                    System.out.println("-------------------------------");
                    break;
                }
            }
        }
    }
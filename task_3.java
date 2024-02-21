import java.util.*;

class task_3
{
    public static void main(String args[])
    {
       int balance = 10000;
       int withdrall;
       int deposit;
       Scanner sc= new Scanner(System.in);
       
       while(true)
       {
        System.out.println("*--SBI ATM MACHINE--*");
        System.out.println("enter 1 for cash wathdrall");
        System.out.println("enter 2 for cash deposit");
        System.out.println("enter 3 for cash check balance");
        System.out.println("enter 4 for EXIT");

        int ch = sc.nextInt();
        
        switch(ch)
        {
            case 1:
            System.out.println("Enter Amount for Withdrall");
            withdrall = sc.nextInt();
            if(balance >= withdrall)
            {
                balance = balance - withdrall;
                System.out.println("Amount withdrall successfully");
            }
            else
            {
                System.out.println("Insufficient balance");
            }
            break;

            case 2:
            System.out.println("Enter amount for deposit");
            deposit = sc.nextInt();
            balance = balance + deposit;
            System.out.println("Amount Deposit Successfully");
            break;

            case 3:
            System.out.println("Your balane is ="+ balance);
            System.out.println("");
            break;

            case 4:
            System.exit(0);
        }
       }
    }
}
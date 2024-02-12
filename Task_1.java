import java.util.*;

class Task_1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num;                        //user input
        int count=0;                   //count number of attempts
        Random ra= new Random();      //generate a random number between range
        int random= ra.nextInt(100)+1;
        //some message
        System.out.println("-----Game Start-----");
        System.out.println("*YOU HAVE ONLY 10 CHANCE*");
        System.out.println("Guess Number(1 to 100) (or -1 to end the game)");

        do{
            count++;
            
            while (!sc.hasNextInt())  //check for valid input , integer value
            {
                System.out.println("Invalid Number");
                sc.next();
            }

            num= sc.nextInt();

            if(num== -1)        //if user want to exit hte game
            {
                System.out.println("end program");
                break;
            }
            // conditions to check the number
            if(num == random)
            {
                System.out.println("Wohoooo----Correct Number");
                break;
            }
            else if(num> random)
            {
                System.out.println("Your Number is Greater : try again");
            }
            else
            {
                System.out.println("Your Number is lesser : try again");
            }
            
            if(count == 10)  //if limit reached
            {
                System.out.println("YOU REACHED LIMIT");
                System.out.println("Press 1 for Continue or 0 for exit");
                int n = sc.nextInt();
                if(n == 1)  //for continue the game
                {
                    System.out.println("-Game Start Again-");
                    count=0;
                    continue;
                }
                else     //for exit the game
                {
                    System.out.println("Thankyou For Playing");
                    break;
                }
            }

          }while(true);
          //result
          System.out.println("No. of Attempts = "+ count );
          System.out.println("Your Score is="+ count+"/10");

          sc.close();
    }
    
}

import java.text.DecimalFormat;
import java.util.Scanner;
class Task_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // variables for each subject
        int e,s,p,c,m,h; 
        System.out.println("--Student Marks--");
        //input - student number 
        System.out.println("English");
        e=sc.nextInt();

        System.out.println("Science");
        s=sc.nextInt();

        System.out.println("Physics");
        p=sc.nextInt();

        System.out.println("Chemistry");
        c=sc.nextInt();

        System.out.println("Mathematics");
        m=sc.nextInt();

        System.out.println("Hindi");
        h=sc.nextInt();
        //showing result
        System.out.println("*--Student Result Sheet--*");
        System.out.println("-------------------");

        System.out.println("English   = "+e +"/100");
        System.out.println("Science   = "+s+"/100");
        System.out.println("Physics   = "+p+"/100");
        System.out.println("Chemistry = "+c+"/100");
        System.out.println("Maths     = "+m+"/100");
        System.out.println("Hindi     = "+h+"/100");

        int total=0; //store total obtained marks
        total=e+s+p+c+m+h;
        System.out.println("-----------------");
        System.out.println("Total = "+total+"/600");

        //percent
        double percentage = ((double)total / 600)*100;

        /*formats the percentage value using the DecimalFormat object df, and stores the 
        formatted result in the formattedPercentage variable as a string.*/

        DecimalFormat df = new DecimalFormat("#.##");
        String formattedPercentage = df.format(percentage);

        /*df.format(percentage): This part of the code uses the DecimalFormat object (df) to format the 
        percentage value. The format() method takes a numeric value as input and returns a string 
        representation of that value according to the formatting rules defined by the DecimalFormat object. */

        System.out.println("Student Percent = "+formattedPercentage);

        double percent = Double.parseDouble(formattedPercentage);

        /*converts the formattedPercentage string to a double value, 
        which can then be used for comparison in the if condition. */

        if(percent >= 90)
        {
            System.out.println("Congratulation");
            System.out.println("Grade = A+ (Excelent)");
        }
        else if(percent >=80 && percent<90)
        {
            System.out.println("Grade = A (Very Good)");
        }
        else if(percent >=65 && percent<80)
        {
            System.out.println("Grade = B+ (Good)");
        }
        else if(percent >=50 && percent<65)
        {
            System.out.println("Grade = B (Average)");
        }
        else if(percent >=35 && percent<50)
        {
            System.out.println("Grade = D (Need Practicec)");
        }
        else if(percent >=32 && percent<35)
        {
            System.out.println("Grade = D# (Poor - Pass With Grace)");
        }
        else
        {
            System.out.println("FAIL");
        }

    }
}
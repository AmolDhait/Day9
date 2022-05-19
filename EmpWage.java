import java.util.Scanner;
import java.util.Random;

public class EmpWage {
    int Emp_Rate_Per_Hour = 0;
    int Total_Working_hours = 10;
    int empHrs = 0;
    int totalEmpHrs = 0;
    int totalWorkingDays = 0;
    int totalEmpWage = 0;

    public int EmpPrest() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas Enter Your Company Wages");
        Emp_Rate_Per_Hour=scanner.nextInt();
        while (totalEmpHrs <= Total_Working_hours || totalWorkingDays < totalWorkingDays) {
            totalWorkingDays++;
            //Random random = new Random();
            double random = Math.random();
            //int empCheck = random.Next(0,3);


            switch (((int) (random * 10)) % 3) {
                case 1:
                    System.out.println("\nEmployee is Present ");
                    empHrs = 8;
                    break;

                case 2:

                    System.out.println("\nEmployee is Part Time ");
                    empHrs = 4;
                    break;

                default:

                    System.out.println("\nEmployee is Absent ");
                    empHrs = 0;
                    break;
            }

            totalEmpHrs += empHrs;

            System.out.println("\ntotal day " + totalWorkingDays + " Emp Hrs" + totalEmpHrs);

        }
        return totalEmpHrs;
    }
    public int Wages()
    {
        totalEmpWage = EmpPrest() * Emp_Rate_Per_Hour;
        return totalEmpWage;
    }

    public static void main (String[]args)
    {
        EmpWage ew = new EmpWage();
        //totalEmpWage = totalEmpHrs * Emp_Rate_Per_Hour;
        // System.out.println("\n" + totalEmpWage);
        System.out.println(ew.Wages());
        //System.out.println("Total Wages is : " +ew.EmpPrest());
    }

}

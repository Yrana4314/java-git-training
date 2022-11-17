package assignment1;
import java.util.Scanner;
public class CalculatePercentageOfGrade {
    public static void main(String[] args){
        // Create Scanner object
        final double TOTAL = 500.0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Full Name: ");
        String name = scan.nextLine();

        System.out.println("Enter grade of Math, English, Science, Social, Nepali subjects");
        String strGrades = scan.nextLine(); //gets grade in comma separated string
        //convert to string with only grade(exclude commas)
        String []strGrade = strGrades.split(",");
        // integer array to  store int grades
        int [] numberGrades = new int[strGrade.length];
        //converts string array to numeric array
        convertsToInt(strGrade,numberGrades);
        // total sum of grades
        int totalSum = sumOfGrades(numberGrades);


        //Compute percentage
        double gradePercentage = computeGradesPercentage(totalSum,TOTAL);
        System.out.println("Name: "+ name);
        System.out.println("You've got: "+gradePercentage+"%");



    }
    //methods to converts String array to int array
    public static void convertsToInt(String[] str,int[] numberGrades){
        // loop through the strGrade array and convert to int
        for(var i=0; i<numberGrades.length; i++){
            numberGrades[i] = Integer.parseInt(str[i]);
        }
        //return numberGrades;
    }
    //Method to compute total sum of grades
    public static int sumOfGrades(int[] numberGrades){
        int sum = 0;
        for(var i=0; i<numberGrades.length; i++)
            sum += numberGrades[i];
        return sum;
    }
    //method to compute grade percent
    public static double computeGradesPercentage(int sum, double total){
        //variable to store percentage grade
        double percent = (sum/total)*100;
        return percent;
    }


}

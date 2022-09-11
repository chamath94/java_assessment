import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

/**
 * Write a description of class Student here.
 *
 * @author (Harshana Chamath 24086660)
 * @version (09/09/2022)
 */
public class Student
{
    public static void main(String[] args){
        System.out.println("Enter the unit name: ");
        String unitName = (new Scanner(System.in)).next();
        System.out.println("Enter the student count: ");
        int count = (new Scanner(System.in)).nextInt();
        double[] studentMarks = new double[count];
        int i = 0;
        
         while (i<studentMarks.length){
            System.out.println("Enter the student's mark: ");
            double mark = (new Scanner(System.in)).nextDouble();
            studentMarks[i]=mark;
            if ((mark < 0) || (mark >100)){
               System.out.println("The marks should be between 0 and 100"); 
            }    
            else{
                i +=1;
            }
        
        }   
        System.out.println("The unit name: " + unitName);    
        
        for(int j=0;j<studentMarks.length;j++){
            System.out.print(studentMarks[j]+", ");
        }
        
        //To find the max and min value of student marks
        Arrays.sort(studentMarks);
        System.out.println("");
        System.out.println("The max value of the student marks: "+ studentMarks[studentMarks.length-1]);
        System.out.println("The min value of the student marks: "+ studentMarks[0]);
    
        //To find the mean and standard deviation
        double sum = 0;
        for(double k : studentMarks){
            sum +=k;
        
        }
        double mean = sum/studentMarks.length;
        System.out.println("The mean of the student marks is: "+mean);  
        
        double sum2 = 0;
        for(double k : studentMarks){
            sum2 +=  Math.pow(k-mean,2);
        }
        double standardDeviation = 0;
        standardDeviation = Math.sqrt(sum2/(studentMarks.length-1));
        System.out.println("The standard deviation of the student marks is: " +standardDeviation);
        
    
    }
        
        
    
        
    
}

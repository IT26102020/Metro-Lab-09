import java.util.Scanner;

public class IT26102020Lab9Q4{

 public static double calcFinalMark(double asgMark, double examMark)
 {
	  return (0.3 * asgMark) + (0.7 * examMark);
	 
 }
 
 public static char findGrades (double finalMark)
 {
	 if(finalMark >= 75)
		 {
			return 'A';
		 }
		 else if(finalMark >= 60)
			 {
				 return 'B';
			 }
			 else if ( finalMark >= 50)
				 {
					 return 'C';
				 }
				 else 
					 {
						 return 'F';
					 }
 }
 
 public static void printDetails( String name , double finalMark , char grade) //no value is printed
 {
	 System.out.printf("%-20s%-15.2f%-10c%n", name, finalMark, grade); 
	
 }
 
 public static void main(String[] args){
	
   Scanner input = new Scanner(System.in);
   
   //variables
   String[] names = new String[5];
   double [] finalMarks = new double[5];
   char[] grades = new char[5];
   
   //get user inputs
   for (int i =0 ; i <5 ; i++)
	   {
		   System.out.print("Enter the name of the student "+(i+1)+ " : " );
		   String name = input.next();
		   
		   System.out.print("Enter Assignment Mark (out of 100) for " + name + ": ");
            double asgMark = input.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for " + name + ": ");
            double examMark = input.nextDouble();
             
			 //calculation using methods
            double finalMark = calcFinalMark(asgMark, examMark);
            char grade = findGrades(finalMark);
			
			names[i] = name;
			finalMarks[i] = finalMark;
			grades[i] = grade;
		   
		   System.out.println();
	   }
	   
	   //print results in a table
	   System.out.printf("%-20s%-15s%-10s%n", "Name", "Final Mark", "Grade");
        for (int i = 0; i < 5; i++) 
		{
            printDetails(names[i], finalMarks[i], grades[i]);
        }

        input.close();
 }
}

   
   
   
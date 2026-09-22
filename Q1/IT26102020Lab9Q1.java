import java.util.Scanner;

public class IT26102020Lab9Q1{

 public static void main(String[] args){
	 
	 Scanner input = new Scanner(System.in);
 
 //variables 
 double a, b, c ;
 double discriminant = 0 ;
 
 //get values for a, b and c 
 System.out.println("Enter the value for 'a' : " );
 a = input.nextDouble();
 
 System.out.println("Enter the value for 'b' : " );
 b = input.nextDouble();
 
 System.out.println("Enter the value for 'c' : " );
 c = input.nextDouble();
 
 //calculation 
  discriminant = Math.pow(b,2) - (4 * a * c);
  
  //if statement 
  if ( discriminant > 0)
	  {
		  
		  double root1 = (-b + Math.sqrt(discriminant)) / (2 *a );
          double root2 = (-b - Math.sqrt(discriminant)) / (2 *a ); 
		  System.out.println();
		  System.out.println("Roots are real and different : ");
		  System.out.println("Root 1 : " +root1);
		  System.out.println("Root 2 : " +root2);
	  }
	  
	  else if ( discriminant == 0)
		  {
			  
			  double root =  -b / (2 * a);   
			  System.out.println();
			  System.out.println("Root is real : ");
			  System.out.println("Root  : " +root);
			  
		  }
             else 
				 {
					 System.out.println();
					 System.out.println("Roots are not real ");
				 }
				 input.close();
 }
}

import java.util.Scanner;

public class IT26102020Lab9Q2{
	

public static double circleArea(double radius)
{
	double area = 3.142 * Math.pow( radius , 2);
	return area ;
	
}


 public static void main(String[] args){
	 
	 Scanner input = new Scanner(System.in);
	  
	  // ask the user to input radius 
	  System.out.println( " Enter the radius of the circle : ");
	  double radius = input.nextDouble();
	  
	  //output radius
	  double areaC = circleArea(radius);
	  System.out.println("The area of the circle is : " +areaC);
	  
 }
}

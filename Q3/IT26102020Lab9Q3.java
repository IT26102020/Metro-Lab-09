
public class IT26102020Lab9Q3{
	
	public static double addM(double num_1 , double num_2) 
	{
		return num_1 + num_2 ;
	}
	
	public static double multiplyM(double num_3 , double num_4)
	{
		return num_3 * num_4;
	}
	
	public static double squareM(double num_5 )
	{
		return Math.pow(num_5,2);
	}

   public static void main(String[] args){
	   // calculation 1 
	   double sum_1 = squareM(addM(multiplyM(3,4) , multiplyM(5,7)));
	   System.out.println("Result of ( 3 * 4 + 5 * 7)^2 : " +sum_1);
	   
	   double sum_2 = addM (squareM(addM(4,7)), squareM(addM(8,3)));
	   System.out.println("Result of ( 4 + 7 )^2 + ( 8 + 3 )^2 : " +sum_2);
	   
   }
}

	   
	   
	   


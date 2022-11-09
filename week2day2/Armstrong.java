package week2day2;
public class Armstrong {
	public static void main(String[] args) {
		int input=153;
		int origin,rem,calc=0;
		origin=input;
		
		while(origin>0)
		{
			rem=origin % 10;
			calc=calc+(rem*rem*rem);
			origin=origin/10;
			
			
		}
		if(calc == input)
		
			System.out.println(input+"is an armstrong number");
		
			else
			
			System.out.println(input+" not an armstrong number");
			
			
	
	}
	

}

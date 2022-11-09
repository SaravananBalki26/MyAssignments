package week2day2;

public class Fibonacci {
 public static void main(String[] args)
 {
 int range=8,firstnum=0,secondnum=1,sum;

	for(int i=1;i<=range;i++)
	{	
		System.out.println(firstnum);
	    sum=firstnum+secondnum;
	    firstnum=secondnum;
	    secondnum=sum;
	}
	
	
 }
}

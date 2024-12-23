package Logical;

public class Armstrong {

	public static void main(String[] args) {
		int n=153, sum=0, temp,rem;
		temp=n;
		
		while(n>0) {
			rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		if(temp==sum) 
			System.out.println(armstrong);
			System.out.println(temp + "  is a armstrong number");
		
		else 
			System.out.println(temp+" Not a armstrong number");
		
	}
}

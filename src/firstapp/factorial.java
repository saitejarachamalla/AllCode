package firstapp;

public class factorial {
public static void main(String[] args) {
	int n=4;
	int i;
	int fact=1;
	for(i=1;i<=n;i++)
	{
		fact=fact*i;
	}
	System.out.println("factorial of "+n+"is: "+fact);
}
}

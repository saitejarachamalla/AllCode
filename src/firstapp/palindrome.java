package firstapp;

public class palindrome {
public static void main(String[] args) {
	int k;
	int n=525;
	int sum=0;
	int temp;
	temp=n;
	while(temp>0)
	{
	k=n%10;
	sum=(sum*10)+k;
	n=n/10;
	}
	if(temp==sum)
	 System.out.println("number "+n+" is palindorme ");
	else
		System.out.println("number "+n+" is not palindrome");
}
}

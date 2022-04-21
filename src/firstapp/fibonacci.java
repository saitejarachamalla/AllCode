package firstapp;

public class fibonacci {
public static void main(String[] args) {
	int r=0;
	int s=1;
	int t;
	int i;
	int n=15;
	System.out.println(r+" "+s);
	for(i=2;i<n;i++)
	{
		t=r+s;
		System.out.print(" "+t+" ");
		r=s;
		s=t;
		
	}
}
}

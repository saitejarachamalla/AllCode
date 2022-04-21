package firstapp;

public class square {
public static void main(String[] args) {
	int num=25;
	int i;
	for(i=0;i<=10;i++)
	{
		if(i==num*num)
		{
			System.out.println(num+"is a perfect square");
		}
	}
	System.out.println(num+"is not a perfect sqaure");
}
}

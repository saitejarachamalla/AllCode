package firstapp;

public class swap_wo_3rdvar {
public static void main(String[] args) {
	int a=10;
	int b=20;
	
	System.out.println("number a is:"+a);
	System.out.println("number b is:"+b);
	
	a=a+b;
	b=a-b;
	a=a-b;
	
	
	System.out.println("result of swap without 3rd var is:"+"a="+a+" "+"b="+b);
}
}

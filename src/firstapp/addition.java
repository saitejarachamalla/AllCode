package firstapp;

public class addition {
int num1=15;
int num2=15;
public int addition()
{
	int result = num1+num2;
	System.out.println("result is;"+result);
	return result;
}
public static int additionOne()
{
int resultOne = 25+25;
System.out.println("resultOne is;"+resultOne);
return resultOne;
}
public static void main(String[] args) {
	System.out.println("rachamalla");
	int addresp = additionOne();
	System.out.println("additionOne()resp is;"+addresp);
}
}


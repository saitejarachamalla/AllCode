package firstapp;

public class reversestring {
public static void main(String[] args) {
		String name="dell";
		String reversename=" ";
		for(int i= name.length()-1;i>=0;i++)
		{
			reversename=reversename+name;
		}
		System.out.println("original name:"+name);
		System.out.println("reverse og given name:"+reversename);
}
}

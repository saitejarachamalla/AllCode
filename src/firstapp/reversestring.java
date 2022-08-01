package firstapp;

public class reversestring {
public static void main(String[] args) {
		String str="dell";
		String reversename=" ";
		for(int i=str.length()-1;i>=0;i++)
		{
			reversename=reversename+str.charAt(i);
		}
		System.out.println("original name:"+str);
		System.out.println("reverse og given name:"+reversename);
}
}

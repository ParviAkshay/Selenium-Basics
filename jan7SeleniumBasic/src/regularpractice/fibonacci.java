package regularpractice;

public class fibonacci 
{public static void main(String[] args) {
	
int num1 =0;
int num2 =1;
int sum =0;

for (int i=0;i<=10; i++)
{
	sum= num1+num2;
	num1=num2;
	num2=sum;
	System.out.print(sum+" ");
}
   System.out.println();

// palindrome

String s ="mom";
String rev ="";

for(int i=s.length()-1;i>=0;i--)
{
	rev = rev+s.charAt(i);
	
}
System.out.println(rev);
if(s.equals(rev))
{
	System.out.println("String is palindrome");
}
else
{
	System.out.println("String is not palindrome");
}

}
}
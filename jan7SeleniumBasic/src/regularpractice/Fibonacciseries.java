package regularpractice;

public class Fibonacciseries
{
	public static void main(String[] args) 
	{
		int num1 = 0;
		int num2 = 1;
		int sum;
		
		for(int i=0; i<=10; i++)
		{
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			
			System.out.print(sum+" ");
		}
		System.out.println();
	
	
//  palindrome
	
	
	String s = "MOM";
	String rev = "";
	
	for(int i=s.length()-1; i>=0; i--)
	{
		rev = rev +s.charAt(i);
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
	
//	Reverse String 
	
	String s1 ="This is String";
	String rev1[] = s1.split(" ");
	
	for(int i=rev1.length-1; i>=0; i--)
	{
		
		System.out.print(rev1[i]+" ");
	}
	System.out.println();
//	Reverse String 
	
	String s2 = "This Is A Java Program";
	String s3[]=s2.split(" ");
	
	for(int i=s3.length-1; i>=0; i--)
	{
		System.out.print(s3[i]+" ");
	}
	System.out.println();
	
//	fibonacciseries1
	
	int a1=0;
	int a2=1;
	int sum1;
	
	for(int i=0; i<=10; i++)
	{
		sum1= a1+a2;
		a1=a2;
		a2=sum1;
		
		System.out.print(sum1+" ");
	}
	System.out.println();
	
//	palindrome1
	
	String b1 = "level";
	String rev2 = "";
	for(int i=b1.length()-1; i>=0; i--)
	{
		rev2 = rev2 + b1.charAt(i);
	}
	System.out.println(rev2);
	
	if(b1.equals(rev2))
	{
		System.out.println("level is Palindrome");
	}
	else
	{
		System.out.println("level is not palindrome");
	}
//	reverse string 
	
	String c ="one man show";
	String[] c2 = c.split(" ");
	for (int i=c2.length-1; i>=0; i--)
	{
		System.out.print(c2[i]+" ");
	}
	System.out.println();
	
//	reverse
	
	String d = "GOOD";
	String rev4="";
	for(int i=d.length()-1; i>=0; i--)
	{
		rev4 = rev4 +d.charAt(i);
	}
	System.out.println(rev4);
	System.out.println();
	
//	add No from String 
	
	String f = "ad3hs4hd2hb2";
	int sum5 = 0;
	String f1 = f.replaceAll("[a-z]", "");
	String f2[]= f1.split("");
	for(String w:f2)
	{
		int f3 = Integer.parseInt(w);
		sum5 = sum5 +f3;
	}
	System.out.println(sum5);
	
//	Add No From String 
	
	String g = "737473";
	int g1 = 0;
	String[] g2 = g.split("");
	
	for(String w : g2)
	{
		int g3= Integer.parseInt(w);
		g1 = g1 + g3;
	}
	System.out.println(g1);
}
}
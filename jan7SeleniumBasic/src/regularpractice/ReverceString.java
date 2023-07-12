package regularpractice;



public class ReverceString 
{
	public static void main(String[] args) {
	
	String s = "This is program";
	
	String s1[]= s.split(" ");
	for (int i=s1.length-1; i>=0; i--)
	{
		System.out.print(s1[i]+" ");
	}
}
}

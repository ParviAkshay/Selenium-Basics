package regularpractice;

public class AA 
{
	public static void main(String[] args) 
	{
		String s ="Mumbai";
		String s1="";
		String rev ="";
		for (int i=s.length()-1; i>=0; i--)
		{
			char c = s.charAt(i);
			 rev = rev + c;
		
		
		
		if(Character.isUpperCase(c))
		{
			s1=rev.toLowerCase();
		}
		else 
		{
			s1=rev.toUpperCase();
		}
	}
		System.out.println(s1);
	}
}
//	public static void main(String[] args) 
//	{
//		String s ="bombey";
//		String rev ="";
//		String s1 ="";
//		
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			char c = s.charAt(i);
//			rev = rev+c;
//			
//			if(Character.isUpperCase(c))
//			{
//				 s1 = rev.toLowerCase();
//				
//			}
//			
//			else 
//			{
//				 s1 = rev.toUpperCase();
//			}
//		
//		}
//		
//		System.out.println(s1);
//  
//	}
//}



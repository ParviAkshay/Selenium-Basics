package regularpractice;

public class AddNoFromString 
{
	public static void main(String[] args) {
		
	
 String s = "ab5ds51s2";
 int sum = 0;
 String s1 = s.replaceAll("[a-z]", "");
 String[] s3 = s1.split("");
 
 for (String w:s3 )
 {
	 int a = Integer.parseInt(w);
	 sum = sum + a;
 }
 System.out.println(sum);

}
}

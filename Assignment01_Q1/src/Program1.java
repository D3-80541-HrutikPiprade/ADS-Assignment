import java.util.Scanner;

public class Program1 {
	
	
	public static boolean isIterativePalin(String str) {
		for(int i =0; i<str.length()/2;i++) {
			if(str.charAt(i)!=str.charAt(str.length()-i-1))
			{
				return false;
			}
		}
		return true;
	}
	

	public static boolean isRecurssivePalin(String str, int left, int right)
	{
		if(left>=right)
		{
			return true;
		}
		return (str.charAt(left) == str.charAt(right)) && isRecurssivePalin(str, left+1, right-1);
	}
	
	public static boolean isPalinByStrBuilder(String str) {
		StringBuilder sb = new StringBuilder(str);
		String reverse = sb.reverse().toString();
		
		if(str.compareTo(reverse)==0)
			return true;
		else 
			return false;
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to Check Palindrome :");
		String str = sc.next();
		
		System.out.println("By iterative method :");
//	     time complexity - O(n) & space complexity= O(1)
		if(isIterativePalin(str))					
			System.out.println(str+ " is Palindorme");
		else
			System.out.println(str + " is not Palindorme");
		
		System.out.println("By Recursive method :");
//	     time complexity - O(n) & space complexity= O(n)
		if(isRecurssivePalin(str,0,str.length()-1)) 
			System.out.println(str+ " is Palindorme");
		else
			System.out.println(str + " is not Palindorme");
		
		System.out.println("By stringBuilder method :");
//	     time complexity - O(n) & space complexity= O(n)
		if(isPalinByStrBuilder(str))				
			System.out.println(str+ " is Palindorme");
		else
			System.out.println(str + " is not Palindorme");
		
		

	}

}

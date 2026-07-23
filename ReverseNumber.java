import java.util.Scanner;
class ReversedNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		int num=sc.nextInt();
		int original,reverse=0,lastdigit;
		original=num;
		while(num>0)
		{
			lastdigit=num%10;
			reverse=reverse*10+lastdigit;
			num=num/10;
		}
		if(original==reverse){
			System.out.println("num is palindrome")
		}else {
			System.out.println("num is not palindrome");
		}
	}
}

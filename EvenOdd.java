import java.util.Scanner;
class EvenOdd
{
public static void main (String args[]){
Scanner sc= new Scanner (System.in);
  System.out.println("enter the number");
int num=sc.nextInt();
int i=num;


while (i>=0)
{
i= i-2;
}
if (i==0)
{
System.out.println("it is even"+num);
}else{
System.out.println("it is odd"+num);
}
}
}

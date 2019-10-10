import java.util.Scanner;

public class Armstng {
	public static void main(String[] args) {
		int number, originalnumber, remainder, result=0,n=0;
		System.out.println("enter a number");
		Scanner sc = new Scanner (System.in);
		number=sc.nextInt();
		originalnumber = number;
		while(originalnumber!=0)
		{
			originalnumber/=10;
			++n;
		}
		while(originalnumber!=0)
		{
			remainder = originalnumber%10;
			result += Math.pow(remainder, n);
			originalnumber/=10;
		}
		
		if(originalnumber==number)
			System.out.println(number+" is a armstrong number");
		else
			System.out.println(number+" is not a armstrong number");
	}

}

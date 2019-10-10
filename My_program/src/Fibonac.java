import java.util.Scanner;

public class Fibonac {
	public static void main(String[] args) {
		int i,n, t1=0,t2=1,nextterm=0;
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (i=0; i<=n; i++)
		{
			System.out.println(t1);
			nextterm=t1+t2;
			t1=t2;
			t2=nextterm;
		}
		
		
	}
}

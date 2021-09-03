package WproExample;
import java.util.*;
public class nextVoel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.print("min");
		int min=sc.nextInt();
		System.out.print("max");
		int max=sc.nextInt();
		int sum=0,i=1;
		while(i!=size)
		{
			System.out.print("enter the elements");
			a[i]=sc.nextInt();
			i++;
		}
		i=1;
		while(i>=min-1 && i<=max)
		{
			sum=sum+a[i];
			System.out.println(sum);
			++i;
		}
		System.out.println(sum);
	}

}

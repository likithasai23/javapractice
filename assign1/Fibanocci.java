import java.util.Scanner;
public class Fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		
		int a[];	
		System.out.println("How may numbers you want in the sequence:");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        scanner.close();
		
        a= new int[n];
        a[0]=0;
		a[1]=1;
		for(int i=2;i<n;i++)
		{
			a[i]=a[i-1]+a[i-2];
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i] +" ");
		}
	}

}

import java.util.Scanner;
public class queue  {
				public static void main(String[] args) {
				int choice, size, top = -1, push, pop, i;
				Scanner in = new Scanner(System.in);
				System.out.print("\nEnter the size of the queue : ");
				size = in.nextInt();
				int[] arr1 = new int[size];
				do {
				System.out.print("\n1-PUSH \n2-POP \n3-DISPLAY \n4-EXIT \nEnter your choice : ");
				choice = in.nextInt();
				switch (choice) {
				case 1:
				if (top >= (size-1)) {
				System.out.print("\nOVERFLOW!!!");
				} else {
				System.out.print("\nEnter element : ");
				push = in.nextInt();
				++top;
				arr1[top] = push;
				}
				break;
				case 2:
				if (top < 0) {
				System.out.print("\nUNDERFLOW!!!");
				} else {
				pop = arr1[0];
				System.out.print("\nElement popped is " + pop);
				for (i = 1; i <= top; i++) {
				arr1[i - 1] = arr1[i];
				}
				top--;
				}
				break;
				case 3:
				for (i = 0; i <= top; i++) {
				System.out.print("\t" + arr1[i]);
				}
				break;
				default:
				if (choice > 4) {
				System.out.println("\nWrong choice!!!");
				}
				break;
				}
				} while (choice != 4);
				}
}
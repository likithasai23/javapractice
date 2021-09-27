import static java.lang.System.exit;
import java.util.Scanner;
import java.util.*;

public class stack {

    Scanner scan = new Scanner(System.in);
    ArrayList A = new ArrayList<>();
    int top = -1, l;

    stack() {
        System.out.println("Enter size of Stack");
        l = scan.nextInt();
    }

    void push(int x) {
        if (top >= l) {
            System.out.println("OverFlow\n");
        } else {
            A.add(++top, x);
        }
    }

    void pop() {
        if (top < 0) {
            System.out.println("UnderFlow");
        } else if (top >= 0) {
            System.out.println("Pop Function Executed.. = " + A.remove(top--));

        }
    }

    void display() {
        for (int i = 0; i <= top; i++) {
            System.out.println(A.get(i) + "\n");

        }
    }

    public static void main(String[] args) {

        stack A = new stack();
        
        int op, l, m, op1;
        float f;
        String s;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("1.Push\n2.Pop\n3.Display\n4.Exit");
            op = scan.nextInt();

            switch (op) {
                case 1:
                    System.out.println("\nEnter Value\n");
                    m = scan.nextInt();
                    A.push(m);
                    break;

                case 2:
                    A.pop();
                    break;

                case 3:
                    A.display();
                    break;
                case 4:
                    exit(0);
            }

        } while (true);

    }
}
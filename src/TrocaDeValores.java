import java.util.Scanner;

public class TrocaDeValores {
    public static void main(String[] args) {
        int a, b, temp;
        Scanner scan = new Scanner(System.in);
        System.out.println("A: ");
        a = scan.nextInt();
        System.out.println("B: ");
        b = scan.nextInt();
        temp = a;
        a = b;
        b = temp;

        System.out.println("A = " + a);
        System.out.println("B = " + b);

    }
}

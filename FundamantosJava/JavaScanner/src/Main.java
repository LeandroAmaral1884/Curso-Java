import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next();

        System.out.println("Voce digitou valor:" + x);

        int y;
        y = sc.nextInt();

        System.out.println("Voce digitou int:" + y);

        double d;

        d = sc.nextDouble();

        System.out.println("voce digitou double:" + d);
        System.out.printf("voce digitou double: %.2f%n", +d);

        char f;
        f = sc.next().charAt(0);
        System.out.println("Voce digitou char:" + f);
        System.out.println(" Digite:");
        String m;
        int h;
        double r;
        m = sc.next();
        h = sc.nextInt();
        r = sc.nextDouble();

        System.out.println("Dados digitados:");
        System.out.println(m);
        System.out.println(h);
        System.out.println(r);

        sc.close();

    }
}

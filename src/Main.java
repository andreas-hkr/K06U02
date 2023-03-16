import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Hitta största gemensamma delaren till två heltal m och n
        // Loopa
        //   r = m % n
        //   om r = 0 --> klara och resultatet finns i n
        //   m = n
        //   n = r

        Scanner input = new Scanner(System.in);
        System.out.print("Ange talet m:");
        int m = input.nextInt();
        System.out.print("Ange talet n:");
        int n = input.nextInt();

        while (true) {
            int r = m % n;
            if (r == 0) {
                break;
            }
            m = n;
            n = r;
        }

        System.out.println("Svaret är: " + n);
    }
}
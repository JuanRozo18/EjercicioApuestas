
import java.util.Random;
import java.util.Scanner;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random num = new Random();
        boolean jugar = true;

        out.println("Ingrese un monto inicial: ");
        int monto = teclado.nextInt();

        do {

            int v1 = num.nextInt(3) + 1;
            out.println("\nNúmero aleatorio generado: " + v1);

            switch (v1) {
                case 1 -> {
                    monto *= 2;
                    out.println("¡Has tenido suerte! Tu monto se multiplica por dos.");
                }
                case 2 -> {
                    monto /= 2;
                    out.println("Vaya, has perdido la mitad...");
                }
                case 3 -> {
                    monto = 0;
                    out.println("Has perdido todo...");
                }
            }

            out.println("Actualmente tienes: " + monto);

            out.println("\n¿Quieres volver a jugar?");
            out.println("1. Sí");
            out.println("2. No");
            int opcion = teclado.nextInt();

            if (opcion != 1) {
                jugar = false;
            } else if (monto == 0) {
                out.println("Te has quedado sin dinero. Ingresa un nuevo monto:");
                monto = teclado.nextInt();
            }

        } while (jugar);

        teclado.close();
    }
}

import java.util.Scanner;

public class utilities {
    public int ValidarEntero(Scanner sc)
    {
        while (!sc.hasNextInt()) {
            System.out.println("Porfavor digite un caracter numerico");
            sc.nextLine();
        }
        return sc.nextInt();



    }
    public Double ValidarDecimal(Scanner sc)
    {
        while (!sc.hasNextDouble()) {
            System.out.println("Porfavor digite un caracter numerico");
            sc.nextLine();
        }
        return sc.nextDouble();
    }

    public Stack<Integer> LlenarPila(Stack)
}

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        boolean seguir = true;
        Scanner sc = new Scanner(System.in);
        utilities u = new utilities();

        while (seguir) {
            System.out.println("Bienvenidos a la clase de pilas vamos a mirar un CRUD");
            System.out.println("Escoja la opcion que desea validar");
            System.out.println("1) llenar pila");
            System.out.println("2) Mostrar Pila");
            System.out.println("3) Modificar");
            System.out.println("4) Eliminar");
            System.out.println("5) Salir");
            int opt = u.ValidarEntero(sc);
            System.out.println(opt);

        }
    }
}

import java.util.Scanner;
import java.util.Stack;

public class main {
    public static void main(String[] args) {
        boolean seguir = true;
        Scanner sc = new Scanner(System.in);
        utilities u = new utilities();
        Stack<Integer> pila = new Stack<>();

        while (seguir) {
            System.out.println("Bienvenidos a la clase de pilas vamos a mirar un CRUD");
            System.out.println("Escoja la opcion que desea validar");
            System.out.println("1) llenar pila");
            System.out.println("2) Mostrar Pila");
            System.out.println("3) Modificar");
            System.out.println("4) Eliminar");
            System.out.println("5) Salir");
            int opt = u.ValidarEntero(sc);
            switch (opt) {
                case 1: 
                    pila = u.LlenarPila(pila);
                    break;
                case 2: 
                    u.MostrarPila(pila);
                    break;
                    case 3: 
                    System.out.println("Pagina en mantenimiento");
                    break;
                    case 4: 
                    System.out.println("Pagina en mantenimiento");
                    break;
                    case 5: 
                    System.out.println("Hasta luego");
                    seguir = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            System.out.println(opt);

        }
    }
}

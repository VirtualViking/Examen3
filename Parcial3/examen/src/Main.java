import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        Scanner Lector = new Scanner(System.in);

        boolean programaActivo=true;

        do {
            System.out.println("Que operacion desea hacer");
            System.out.println("1-Insertar un nuevo usuario");
            System.out.println("2-Eliminar un usuario");
            System.out.println("3-Modificar un usuario");
            System.out.println("4-Consultar un usuario");
            System.out.println("5-Terminar el programa");

            int opcion = Lector.nextInt();

            if (opcion == 1) {
                System.out.println("Introduzca el nombre del usuario");
                String nombre = Lector.next();
                System.out.println("Introduzca la clave");
                int Clave = Lector.nextInt();
                System.out.println("Introduzca el userName");
                String userName = Lector.next();

                Usuario a = new Usuario();
                a.setNombre(nombre);
                a.setClave(Clave);
                a.setUserName(userName);

                usuarios.add(a);

            } else if (opcion == 2) {
                System.out.println("Introduce el alumno a eliminar");
                String nombre = Lector.next();

                Iterator<Usuario> it = usuarios.iterator();

                while(it.hasNext()){
                    Usuario a = it.next();
                    if (a.getNombre().equals(nombre)){
                        it.remove();
                    }
                }

            } else if (opcion == 3) {
                System.out.println("Introduce el alumno a modificar");
                String nombre = Lector.next();

                System.out.println("Introduce el nombre del nuevo usuario");
                String nombre2 = Lector.next();
                System.out.println("Introduce la nueva clave");
                int clave2 = Lector.nextInt();
                System.out.println("Introduce el nuevo userName");
                String userName2 = Lector.next();

                Iterator<Usuario> it = usuarios.iterator();

                while(it.hasNext()){
                    Usuario a = it.next();
                    if (a.getNombre().equals(nombre)){
                        a.setNombre(nombre2);
                        a.setClave(clave2);
                        a.setUserName(userName2);
                    }
                }


            } else if (opcion == 4) {
                for (Usuario a: usuarios){
                    System.out.println("Nombre: " +a.getNombre() + ", Clave: " +a.getClave() +", Username: " +a.getUserName());
                }

            } else if (opcion==5){
                programaActivo=false;
                {

                }
            } else {
                System.out.println("No has escogido correctamente");
            }
        }while(programaActivo);

    }
}

import java.util.Scanner;

public class Vista {
    
    Scanner scan;

    Vista () {
        scan = new Scanner(System.in);
    }

    public int getOpcionMenu () {
        String txt = "\nIngrese el número que corresponde a la acción a realizar\n";
        txt += "1 - Añadir carta a colección\n2 - Consultar tipo\n3 - Mostrar cartas del usuario\n";
        txt += "4 - Mostrar cartas del usuario ordenadas\n5 - Mostrar todas las cartas\n";
        txt += "6 - Mostrar todas las cartas ordenadas\n7 - Prueba 'Mostrar todas las cartas'\n";
        txt += "8 - Prueba 'Mostrar todas las cartas ordenadas'\n9 - Salir";

        int opcion = 0;
        while (opcion < 1 || opcion > 9){
            System.out.println(txt);
            try {
                opcion = scan.nextInt();
            } catch (Exception e) {
                scan.nextLine();
                opcion = 0;
            }
        }

        return opcion;
    }


    public int getImplementacion () {
        String txt = "\nIngrese el número que corresponde a la implementación a utilizar\n";
        txt += "1 - HashMap\n2 - TreeMap\n3 - LinkedHashMap\n";

        int opcion = 0;
        while (opcion < 1 || opcion > 3){
            System.out.println(txt);
            try {
                opcion = scan.nextInt();
            } catch (Exception e) {
                scan.nextLine();
                opcion = 0;
            }
        }

        return opcion;
    }

    public void mostrarError() {
        mostrarMensaje("Error - Carta no existe");
    }

    public void mostrarMensaje (String msg) {
        System.out.println(msg);
    }

    public String getCarta () {
        mostrarMensaje("\nIngrese el nombre de la carta\n");
        scan.nextLine();
        return scan.nextLine();
    }
}

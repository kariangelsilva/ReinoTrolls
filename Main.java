import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Troll[] trolls = new Troll[3];

    
        System.out.println("Creación de los Tres Trolls de Villa Troll");
        for (int i = 0; i < 3; i++) {
            System.out.println("\nTroll:" + (i + 1));
            System.out.print("Ingresa el nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingresa el color: ");
            String color = scanner.nextLine();
            System.out.print("Ingresa el secreto: ");
            String secreto = scanner.nextLine();
            System.out.print("Ingresa la fuerza: ");

            int fuerza = 0;
            String entrada = scanner.nextLine();
            if (entrada.matches("\\d+")) {
            fuerza = Integer.parseInt(entrada);
            } else {
        System.out.println("Fue error, se asignará 80 por defecto.");
        fuerza = 80;
        }
            switch (i) {
                case 0:
                    trolls[i] = new TrollFuerzaOculta(nombre, secreto, fuerza, color);
                    break;
                case 1:
                    trolls[i] = new TrollInteligente(nombre, secreto, fuerza, color);
                    break;
                case 2:
                    trolls[i] = new TrollAstuto(nombre, secreto, fuerza, color);
                    break;
            }
        }
        // Menú interactivo
        boolean salir = false;
        while (!salir) {
            System.out.println("\n Selecciona un Troll para Visualizar");
            for (int i = 0; i < trolls.length; i++) {
                System.out.println((i + 1) + ". " + trolls[i].getNombre() + " (" + trolls[i].getClass().getSimpleName() + ")");
            }
            System.out.println("0. Salir");
            System.out.print("Elige una opción (0-3): ");


            int opcion = 0; 
                String entrada = scanner.nextLine();
                    if (entrada.matches("\\d+")) { 
                opcion = Integer.parseInt(entrada); 
                    } else {
                System.out.println("Error: Ingresa un número válido.");
                    continue;
                }


            if (opcion == 0) {
                salir = true;
                System.out.println("Saliste del Villa Troll");
            } else if (opcion >= 1 && opcion <= trolls.length) {
                Troll trollElegido = trolls[opcion - 1];
                System.out.println("\n Visualizando a " + trollElegido.getNombre());
                trollElegido.mostrarColor();
                trollElegido.actuar();
                trollElegido.usarHabilidadUnica();
                trollElegido.mostrarFuerza();
                System.out.println(trollElegido.getSecreto());

                System.out.print("¿Quieres modifica el secreto de " + trollElegido.getNombre() + "? (si/no): ");
                String respuesta = scanner.nextLine().toLowerCase();
                if (respuesta.equals("si")) {
                    System.out.print("Ingresaa clave: ");
                    String clave = scanner.nextLine();
                    System.out.print("Ingresa el nuevo secreto: ");
                    String nuevoSecreto = scanner.nextLine();
                    trollElegido.modificarSecreto(nuevoSecreto, clave);
                }
            } else {
                System.out.println("Error: Opción inválida. Eligentre 0 y " + trolls.length + ".");
            }
        }

        scanner.close();
    }
}

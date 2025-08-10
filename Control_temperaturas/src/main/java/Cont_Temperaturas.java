import java.util.Scanner;

public class Cont_Temperaturas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[] tempSemana = new double[7]; // Guarda las temperaturas de la semana
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        boolean hayDatos = false; // Sirve para saber si ya se ingresaron datos

        int opcion;

        do {
            // Menú principal
            System.out.println("\n===== Control de Temperaturas Diarias =====");
            System.out.println("1. Ingresar temperaturas");
            System.out.println("2. Ver todas las temperaturas");
            System.out.println("3. Ver temperatura más alta");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = entrada.nextInt();

            if (opcion == 1) {
                // Pedir temperaturas de los 7 días
                for (int i = 0; i < 7; i++) {
                    System.out.print("Temperatura máxima para " + dias[i] + ": ");
                    tempSemana[i] = entrada.nextDouble();
                }
                hayDatos = true;
                System.out.println(">>> Datos guardados <<<");

            } else if (opcion == 2) {
                // Mostrar todas las temperaturas
                if (!hayDatos) {
                    System.out.println("No hay datos ingresados.");
                } else {
                    System.out.println("\n--- Temperaturas registradas ---");
                    for (int i = 0; i < 7; i++) {
                        System.out.println(dias[i] + ": " + tempSemana[i] + " °C");
                    }
                }

            } else if (opcion == 3) {
                // Buscar y mostrar temperatura más alta
                if (!hayDatos) {
                    System.out.println("No hay datos ingresados.");
                } else {
                    double max = tempSemana[0];
                    int diaMax = 0;
                    for (int i = 1; i < 7; i++) {
                        if (tempSemana[i] > max) {
                            max = tempSemana[i];
                            diaMax = i;
                        }
                    }
                    // Llamada a métodos sobrecargados
                    mostrarMaxima(max);
                    mostrarMaxima(max, dias[diaMax]);
                }

            } else if (opcion == 4) {
                // Salir del programa
                System.out.println("Saliendo...");
            } else {
                // Opción inválida
                System.out.println("Opción no válida.");
            }

        } while (opcion != 4);
    }

    // Muestra temperatura máxima sin día
    public static void mostrarMaxima(double temperatura) {
        System.out.println("Temperatura más alta: " + temperatura + " °C");
    }

    // Muestra temperatura máxima con día
    public static void mostrarMaxima(double temperatura, String dia) {
        System.out.println("Temperatura más alta: " + temperatura + " °C el " + dia);
    }

    // Función recursiva (opcional) para sumar todas las temperaturas
    public static double sumaTemperaturas(double[] arreglo, int indice) {
        if (indice == arreglo.length) {
            return 0;
        } else {
            return arreglo[indice] + sumaTemperaturas(arreglo, indice + 1);
        }
    }
}

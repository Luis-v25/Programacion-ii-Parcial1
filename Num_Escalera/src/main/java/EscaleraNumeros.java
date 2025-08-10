import java.util.Scanner;

public class EscaleraNumeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir el número de niveles
        System.out.print("Ingrese el número de niveles: ");
        int niveles = sc.nextInt();

        // Validar que sea mayor o igual a 1
        if (niveles < 1) {
            System.out.println("Error: El número de niveles debe ser mayor o igual a 1.");
            return; // salir del programa si el valor no es válido
        }

        // Mostrar la escalera ascendente
        imprimirEscaleraAscendente(niveles);

        // Mostrar la escalera descendente
        imprimirEscaleraDescendente(niveles - 1); // se resta 1 para no repetir la última línea

        sc.close();
    }

    // Procedimiento para imprimir escalera ascendente
    public static void imprimirEscaleraAscendente(int niveles) {
        for (int i = 1; i <= niveles; i++) {
            imprimirLinea(i);
        }
    }

    // Procedimiento para imprimir escalera descendente
    public static void imprimirEscaleraDescendente(int niveles) {
        for (int i = niveles; i >= 1; i--) {
            imprimirLinea(i);
        }
    }

    // Metodo que imprime Numeros
    public static void imprimirLinea(int nivel) {
        for (int i = 1; i <= nivel; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Metodo que imprime un simbolo
    public static void imprimirLinea(int nivel, char simbolo) {
        for (int i = 1; i <= nivel; i++) {
            System.out.print(simbolo + " ");
        }
        System.out.println();
    }

    // OPCIONAL: Versión recursiva para imprimir la escalera descendente
    public static void imprimirEscaleraDescendenteRecursiva(int nivel) {
        if (nivel < 1) {
            return; // caso base
        }
        imprimirLinea(nivel);
        imprimirEscaleraDescendenteRecursiva(nivel - 1);
    }
}


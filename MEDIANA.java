import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MEDIANA {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ArrayList<Integer> numeros = new ArrayList<>();
            while (true) {
                System.out.print("Ingrese un número entero o '.' para finalizar: ");
                String entrada = sc.next();

                if (entrada.equals(".")) {
                    break;
                }
                try {
                    int numero = Integer.parseInt(entrada);
                    numeros.add(numero);
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Ingrese un número entero válido o '.' para finalizar.");
                }
            }
            Collections.sort(numeros);

            int n = numeros.size();
            int mediana;

            if (n % 2 == 1) {
                mediana = numeros.get(n / 2);
            } else {
                int num1 = numeros.get(n / 2 - 1);
                int num2 = numeros.get(n / 2);
                mediana = (num1 + num2) / 2;
            }

            System.out.println("La mediana es " + mediana + ".");
        }

}

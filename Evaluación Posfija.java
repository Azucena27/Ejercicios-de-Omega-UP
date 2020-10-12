import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);

        String entradita;

        List<String> expresion = new ArrayList<String>();
        entradita = entrada.nextLine();
        System.out.println("despues de entrada : " + entradita);

        String[] expresiones = entradita.split(" ");

        for (int i = 0; i < expresiones.length; i++) {
            expresion.add(expresiones[i]);

        }
        int indice = 2;
        int total = 0;                          //como saber el tipo de un objeto ->  

        while (expresion.size() > 0 && indice < expresion.size()) {
            System.out.println("despues de expresiones while: ");

            if (Integer.parseInt(expresion.get(indice - 2)) <= 9 && Integer.parseInt(expresion.get(indice - 2)) >= 0
                    && Integer.parseInt(expresion.get(indice - 1)) <= 9 && Integer.parseInt(expresion.get(indice - 1)) >= 0) {
                System.out.println("despues de expresiones if : ");

                switch (expresion.get(indice)) {
                    case "+":
                        System.out.println("despues de expresiones case + : ");
                        total = Integer.parseInt(expresion.get(indice - 2)) + Integer.parseInt(expresion.get(indice - 1));
                        //expresion.remove(indice);
                        expresion.remove(indice - 1);
                        expresion.remove(indice - 2);
                        expresion.set(indice - 2, Integer.toString(total));
                        indice--;
                        break;
                    case "-":
                        System.out.println("despues de expresiones case - : ");
                        total = Integer.parseInt(expresion.get(indice - 2)) - Integer.parseInt(expresion.get(indice - 1));
                        //expresion.remove(indice);
                        expresion.remove(indice - 1);
                        expresion.remove(indice - 2);
                        expresion.set(indice - 2, Integer.toString(total));
                        indice--;
                        break;
                    case "*":
                        System.out.println("despues de expresiones case * : ");
                        total = Integer.parseInt(expresion.get(indice - 2)) * Integer.parseInt(expresion.get(indice - 1));
                        expresion.remove(indice);
                        expresion.remove(indice - 1);
                        expresion.remove(indice - 2);
                        expresion.set(indice - 2, Integer.toString(total));
                        indice--;
                        break;
                    case "/":
                        System.out.println("despues de expresiones case / : ");
                        total = Integer.parseInt(expresion.get(indice - 2)) / Integer.parseInt(expresion.get(indice - 1));
                        //expresion.remove(indice);
                        expresion.remove(indice - 1);
                        expresion.remove(indice - 2);
                        expresion.set(indice - 2, Integer.toString(total));
                        indice--;
                        break;
                    case "^":
                        System.out.println("despues de expresiones case ^ : ");
                        total = Integer.parseInt(expresion.get(indice - 2)) ^ Integer.parseInt(expresion.get(indice - 1));
                        //expresion.remove(indice);
                        expresion.remove(indice - 1);
                        expresion.remove(indice - 2);
                        expresion.set(indice - 2, Integer.toString(total));
                        indice--;
                        break;
                    default:
                        indice++;

                        //no sirve para nada;
                        break;
                }
                System.out.println("total " + total);
                System.out.println("algo que diga que es indice " + indice);
                System.out.println(expresion);
            } else {
                indice++;
            }
        }
        System.out.println(total);
    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);

        int dulzura;
        int numGalletas;

        numGalletas = entrada.nextInt();
        dulzura = entrada.nextInt();
        entrada.nextLine();
        String entrada2;

        List<String> dulzuras = new ArrayList<String>();

        entrada2 = entrada.nextLine();
        String[] dulzurases = entrada2.split(" ");
        for (int i = 0; i < dulzurases.length; i++) {
            dulzuras.add(dulzurases[i]);

        }
        int indice = 1;
        int total = 0;
        int numCombinaciones=0;
        
        while (dulzuras.size() > 0 && indice < dulzuras.size()) {
            /*entradita = entrada.nextLine();
            expresion.add(entradita);*/
            if (Integer.parseInt(dulzuras.get(indice - 1)) <= 1000000 && Integer.parseInt(dulzuras.get(indice - 1)) >= 0
                    && Integer.parseInt(dulzuras.get(indice)) <= 1000000 && Integer.parseInt(dulzuras.get(indice)) >= 0) {

                total = (Integer.parseInt(dulzuras.get(indice - 1)) * indice) + (Integer.parseInt(dulzuras.get(indice)) * (indice + 1));
                dulzuras.remove(indice);
                dulzuras.remove(indice - 1);

                for (int i = 0; i < dulzuras.size(); i++) {
                    if (total >= Integer.parseInt(dulzuras.get(i))) {
                        dulzuras.set(i, Integer.toString(total));
                    }

                }
                if((Integer.parseInt(dulzuras.get(indice-1))) >= dulzura){
                        dulzuras.clear();
                    }

            }
        numCombinaciones++;
        }
        System.out.println(numCombinaciones);
    }
}
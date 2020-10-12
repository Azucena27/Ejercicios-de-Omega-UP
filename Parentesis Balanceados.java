import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);

        int numOperaciones;
        boolean balanceados;
        String comoQuiera;
        numOperaciones = entrada.nextInt();
        entrada.nextLine();

        if (numOperaciones <= 1000 && numOperaciones >= 1) {

            for (int i = 0; i < numOperaciones; i++) {
                balanceados = true;
                comoQuiera = entrada.nextLine();

                if (comoQuiera.length() <= 1000 && comoQuiera.length() >= 1) {

                    if (comoQuiera.length() % 2 == 0) {

                        for (int j = 0; j < (comoQuiera.length() / 2); j++) {
                            switch (comoQuiera.charAt((comoQuiera.length() / 2) - (j + 1))) {
                                case '{':
                                    if (comoQuiera.charAt((comoQuiera.length() / 2) + j) != '}') {
                                        balanceados = false;
                                        System.out.print("NO ");
                                        j = comoQuiera.length();
                                    }
                                    break;

                                case '[':
                                    if (comoQuiera.charAt((comoQuiera.length() / 2) + j) != ']') {
                                        balanceados = false;
                                        System.out.print("NO ");
                                        j = comoQuiera.length();
                                    }
                                    break;

                                case '(':
                                    if (comoQuiera.charAt((comoQuiera.length() / 2) + j) != ')') {
                                        balanceados = false;
                                        System.out.print("NO ");
                                        j = comoQuiera.length();
                                    }
                                    break;
                            }
                        }
                        if (balanceados == true) {
                            System.out.print("SI ");
                        }
                    } else {
                        balanceados = false;
                        System.out.print("NO ");

                    }
                    comoQuiera = "";

                }
                //entrada.close();
            }
        }
    }
}
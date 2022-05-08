import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Executable;
import java.util.Arrays;


public class Program {
    public static void main(String args[]) {

        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));


        try {
            System.out.print("Informe o tamanho do Array que deseja criar: ");
            int x = Integer.parseInt(leitor.readLine());
            int[] list = new int[x];
            int[] newList = null;

            System.out.println("Informe os numeros para preencher o Array: ");
            for(int i = 0; i < list.length; i++) {
                System.out.print("Informe o " + i + "º  numero: ");
                list[i] = Integer.parseInt(leitor.readLine());
            }

            System.out.println("");
            System.out.println("Numeros digitados: ");
            //for (int i = 0; i <  list.length; i++) {
            //    System.out.print(list[i] + "\n");
            //}

            Arrays.sort(list);
            for (int i : list) {
                System.out.print(i + "\n");
            }

            System.out.println();
            System.out.print("Você que remover algum numero (S/N)? ");
            char decisao = (char) leitor.read();
            leitor.readLine();

            if (decisao == 'S' || decisao == 's') {
                System.out.print("Informe o numero que voce deseja remover do Array: ");
                int numeroRemover = Integer.parseInt(leitor.readLine());
                for (int i = 0; i < list.length - 1; i++) {
                    if (list[i] == numeroRemover) {
                        newList = new int [list.length - 1];
                        for (int index = 0; index < i; index++) {
                            newList[index] = list[index];
                        }
                        for (int j = i; j < list.length - 1; j++) {
                            newList[j] = list[j + 1];
                        }
                    }
                }
                System.out.println("");
                System.out.println("Numeros digitados: ");
                Arrays.sort(list);
                for (int j : newList) {
                    System.out.print(j + "\n");
                }
            }
            else {
                System.out.println("");
                System.out.println("Numeros digitados: ");
                Arrays.sort(list);
                for (int i : list) {
                    System.out.print(i + "\n");
                }
            }

        } catch (Exception e) {
            e.getMessage();
        }

    }
}

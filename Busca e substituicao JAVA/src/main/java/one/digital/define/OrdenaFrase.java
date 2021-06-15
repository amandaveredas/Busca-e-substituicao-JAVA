package one.digital.define;
import java.lang.*;
import java.util.StringTokenizer;
import java.util.Scanner;
import java.util.*;


public class OrdenaFrase {
    public static void main (String[] args){

        Scanner leitor = new Scanner(System.in);
        int quantTestes = leitor.nextInt();
        int i;
        int j = 0;
        int k =0;

        leitor.nextLine();
        while (j<quantTestes){
            StringTokenizer st = new StringTokenizer(leitor.nextLine());
            ArrayList<DefinePalavra> lista = new ArrayList<DefinePalavra>();

            //preenchendo a lista
            while (st.hasMoreTokens() && k<50) {
                String proximaPalavra = st.nextToken();

                if (proximaPalavra.length()<=50){
                    lista.add(new DefinePalavra(proximaPalavra));
                }
                k++; //preenchendo até 50 palavras
            }


            //ordenando pelo numero de caracteres
            Collections.sort(lista, new OrdenaCaracteres());

            //verificando se há palavras com o mesmo tamanho
            for (i=1;i<lista.size();i++){

                //comparar numero de caracteres com a palavra anterior
                String palavraAtual = lista.get(i).toString();
                String palavraAnterior = lista.get(i-1).toString();


                if(palavraAtual.length() == palavraAnterior.length()){
                    int comp = palavraAtual.compareTo(palavraAnterior);

                    if(comp < 0) {

                        Collections.swap(lista, i, i-1);
                        if(i>=2){
                            i = i-2;
                        }

                    }
                }
            }
            //imprimindo
            for (i=0;i<lista.size();i++){
                System.out.print(lista.get(i) + " ");
            }
            lista.clear();
            System.out.println();
            j++;
        }
    }
}

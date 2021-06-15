package one.digital.outros;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PagaAlmoco {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int numCasos = leitor.nextInt();
        int j = 0;
        leitor.nextLine();

        while (j<numCasos){

            StringTokenizer st = new StringTokenizer(leitor.nextLine());

            String escolhaFernanda = st.nextToken();
            String escolhaMarcia = st.nextToken();

            switch (escolhaFernanda){
                case "pedra":
                    if ((escolhaMarcia.equals("papel")) || (escolhaMarcia.equals("spock"))){
                        System.out.println("marcia");
                    } else if (escolhaMarcia.equals("pedra")){
                        System.out.println("empate");
                    }else{
                        System.out.println("fernanda");
                    }
                    break;
                case "papel":
                    if ((escolhaMarcia.equals("tesoura")) || (escolhaMarcia.equals("lagarto"))){
                        System.out.println("marcia");
                    } else if (escolhaMarcia.equals("papel")){
                        System.out.println("empate");
                    }else{
                        System.out.println("fernanda");
                    }
                    break;
                case "tesoura":
                    if ((escolhaMarcia.equals("spock")) || (escolhaMarcia.equals("pedra"))){
                        System.out.println("marcia");
                    } else if (escolhaMarcia.equals("tesoura")){
                        System.out.println("empate");
                    }else{
                        System.out.println("fernanda");
                    }
                    break;
                case "lagarto":
                    if ((escolhaMarcia.equals("pedra")) || (escolhaMarcia.equals("tesoura"))){
                        System.out.println("marcia");
                    } else if (escolhaMarcia.equals("lagarto")){
                        System.out.println("empate");
                    }else{
                        System.out.println("fernanda");
                    }
                    break;
                case "spock":
                    if ((escolhaMarcia.equals("papel")) || (escolhaMarcia.equals("lagarto"))){
                        System.out.println("marcia");
                    } else if (escolhaMarcia.equals("spock")){
                        System.out.println("empate");
                    }else{
                        System.out.println("fernanda");
                    }
                    break;
                default:
                    System.out.println("Entrada inválida");
            }
            j++;
        }
    }
}

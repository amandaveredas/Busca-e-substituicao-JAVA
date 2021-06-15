package one.digital.outros;
import java.util.Scanner;
import java.io.IOException;

public class AtalhosWeblogger {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int numCaracteres = 0;
        String proximaLinha = new String();
        String linhaAlterada = new String();
        StringBuilder fraseFinal = new StringBuilder();
        boolean entradaValida = true;
        int contAst = 0;
        int contSub = 0;
        int simboloFinal = 0;


        while (leitor.hasNextLine()){

            proximaLinha = leitor.nextLine();

            //verificando a existência dos caracteres proibidos
            if (proximaLinha.length() <=50){
                for (int i = 0; i<proximaLinha.length() ; i++){
                    char c = proximaLinha.charAt(i);
                    if(Character.isLetter(c) || (c >= 32 && c <= 33) || (c >= 40 && c<= 42) || (c >= 44 && c<= 46) || (c >= 58 && c<= 59) || (c == 63) || (c >= 65 && c<= 90) || (c == 95) || (c >= 97 && c<= 122)) { //validando pela tabela ASCII
                        if (c =='*'){
                            contAst++;
                        }else if (c == '_'){
                            contSub++;
                        }else{
                            continue;
                        }
                    }else{
                        //System.out.println("Entrada inválida!");
                        entradaValida = false;
                        break;
                    }
                }
                //verificando se os asteriscos e os sublinhados estãos em números pares e finalmente começa a "tradução"
                if (entradaValida && (contAst %2 == 0) && (contSub %2 == 0)){
                    //verificando se contem "*" ou "_"
                    if (proximaLinha.contains("*") || proximaLinha.contains("_")){
                        linhaAlterada = proximaLinha.replace("*","<b>");
                        linhaAlterada = linhaAlterada.replace("_","<i>");

                        fraseFinal.append(linhaAlterada);
                        //inserindo a / depois do <
                        for (int j = 0; j<fraseFinal.length();j++){
                            char d = fraseFinal.charAt(j);
                            if (d == '<'){
                                simboloFinal++;

                                if (simboloFinal % 2 == 0){
                                    fraseFinal.insert(j+1,'/');
                                }
                            }
                        }
                        System.out.println(fraseFinal);
                        fraseFinal.delete(0, fraseFinal.length());
                    }else{
                        System.out.println(proximaLinha);
                    }
                }
            }else{
                System.out.println("Entrada inválida!");
            }
        }
    }
}

package one.digital.outros;
import java.util.Scanner;

public class ValidaSenha {
    public static void main(String[] args) {

        String s;
        Character c;
        boolean temMaiscula = false,temMinuscula = false,temNumero = false,naoTemCaracterEsp = false;

        Scanner leitor = new Scanner(System.in);

        while (leitor.hasNextLine()){

            s = leitor.nextLine();

            if ((6 <= s.length()) && (s.length() <= 32)){ //tem entre 6 e 32 dígitos
                for (int i=0; i<s.length(); i++){ //testando os caracteres

                    c = s.charAt(i);
                    //System.out.println(c);

                    if((c >= 48 && c<= 57) || (c >= 65 && c<= 90) || (c >= 97 && c <= 122) ){ //não pode ter caracteres especiais nem acentuação - tabela ASCII
                        naoTemCaracterEsp = true;
                        //System.out.println("não tem caractere especial");
                        if (Character.isUpperCase(c)){ //tem maiuscula
                            temMaiscula = true;
                            //    System.out.println("maiuscula");
                        }else if (Character.isLowerCase(c)){ //tem minuscula
                            temMinuscula = true;
                            //    System.out.println("minuscula");
                        }else if (Character.isDigit(c)){ //tem número
                            temNumero = true;
                            //   System.out.println("numero");
                        }
                    }else {
                        naoTemCaracterEsp = false;
                        break;
                    }

                }
                if (temMaiscula && temMinuscula && temNumero && naoTemCaracterEsp){
                    System.out.println("Senha valida.");
                }else{
                    System.out.println("Senha invalida.");
                }

            }else{
                System.out.println("Senha invalida."); //não respeitou o número de caracteres

            }
            temMaiscula = false;
            temMinuscula = false;
            temNumero = false;
            naoTemCaracterEsp = false; //jogando tudo pra condição inicial}
        }
    }
}

package one.digital.outros;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.BufferedReader;

public class MaiorSub{

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String str1, str2,min,max, proximaLinha;
        int minLength, maxS;

        while ((str1 = in.readLine()) != null){
            str2 = in.readLine(); //Lê a segunda string

            //verificando quem é a menor string
            if(str1.length() < str2.length()){
                min = str1;
                max = str2;
            }else{
                min = str2;
                max = str1;
            }


            //o tamanho máximo da substring é a menor string
            minLength = min.length();
            maxS = minLength;


            boolean f = true;
            while (maxS > 0 && f) {
                int diff = minLength - maxS;
                for (int i = 0; i <= diff; i++ ) {
                    if (max.contains(min.substring(i, i + maxS))) {
                        f = false;
                        maxS++;
                        break;
                    }
                }
                maxS--;
            }
            System.out.println(maxS);
        }
        out.close();
    }

}
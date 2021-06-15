package one.digital.define;

class DefinePalavra {

    String palavra;
    int numCaracteres;


    public DefinePalavra (String palavra){
        this.palavra = palavra;
        this.numCaracteres = palavra.length();;

    }

    public String toString(){
        return this.palavra;
    }
}

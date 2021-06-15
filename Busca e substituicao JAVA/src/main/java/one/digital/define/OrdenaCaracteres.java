package one.digital.define;

import java.util.Comparator;

class OrdenaCaracteres implements Comparator<DefinePalavra> {

    @Override
    public int compare (DefinePalavra a, DefinePalavra b){
        return b.numCaracteres - a.numCaracteres;
    }

}

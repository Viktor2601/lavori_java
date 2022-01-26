package lavoro18.src;

import java.lang.reflect.Array;

public class Lavoro18 
{
    public static void main(String[] args) throws Exception 
    {
        int input[] = ArrayTools.generaArrayCasuale(10, 100);

        int inputOrdinato[] = ArrayTools.ordinaCrescente(input);

        ArrayTools.stampaArray(input);
        System.out.println("------------------------------------------------------");
        ArrayTools.stampaArray(inputOrdinato);

        System.out.println("MAX -> " + ArrayTools.max(input));
        System.out.println("MIN -> " + ArrayTools.min(input));
        System.out.println("MEDIA -> " + ArrayTools.media(input));
        System.out.println("TROVATO -> " + ArrayTools.ricercaNumero(input, 101));
    }
}
package lavoro16.src;

import javax.swing.JOptionPane;

public class Lavoro16 
{
    public static void main(String[] args) throws Exception 
    {
        //stampaNumeri(140);
        System.out.println(prezzoScontato(100, 20));
        System.out.println(somma(10, 20));
        System.out.println(divisione(100, 2));
        System.out.println(scorporoIVA(122, 22));
    }
    
    static void stampaNumeri(int max)
    {
        for (int i = 1; i <= max; i++ )
        {
            String riga = "";

            if (i < 10)
            {
                riga = "  " + i + ")________________________________________";
                System.out.println(riga);
            }
            else
            {
                if (i < 100)
                {
                    riga = " " + i + ")________________________________________";
                    System.out.println(riga);
                }
                else
                {
                    riga = i + ")________________________________________";
                    System.out.println(riga);
                }
            }
        }
    }

    static float prezzoScontato(float prezzo, float sconto)
    {
        float risultato = 0;
        
        risultato = prezzo - (prezzo*sconto/100);
        
        return risultato;
    }

    static float somma (float addendo1, float addendo2)
    {
        float risultato = addendo1 + addendo2;
        return risultato;
    }

    static float divisione (float dividendo, float divisore)
    {
        float risultato = 0;

        if (divisore == 0)
        {
            risultato = -99999999;
            return risultato;
        }
        else
        {
            risultato = dividendo / divisore;
            return risultato;
        }
    }

    static float chiediNumero(String testo)
    {
        String numero = JOptionPane.showInputDialog(testo);
        float numeroOutput = Float.parseFloat(numero);
        return numeroOutput;
    }

    static void stampa (String testo)
    {
        System.out.println();
        System.out.println(testo);
    }

    static float scorporoIVA (float prezzoConIVA, final int IVA)
    {
        float prezzoSenzaIVA = 0;

        if (IVA != 22 && IVA != 10 && IVA != 4)
        {
            String msg = "Il valore inserito non va bene...";
            stampa(msg);
            return -1;
        }

        if (prezzoConIVA <= 0)
        {
            String msg = "Il valore inserito non va bene... il prezzo non può essere uguale o minore di zero.";
            stampa(msg);
            return -1;
        }

        prezzoSenzaIVA = prezzoConIVA * 100 / (100 + IVA);

        return prezzoSenzaIVA;
    }
}

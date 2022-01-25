package lavoro17.src;

import javax.swing.JOptionPane;

public class Tool {
    	/**
	 * metodo per inserire un numero in input
	 * puoi inserire il numero sia con il '.' che con la ','
	 *
	 * @return numero float 
	 */
	public static float inserisciNumero ()
	{
		float numero = 0;
        boolean ok = false;

        while (!ok){
            String txtNumero = JOptionPane.showInputDialog("Inserisci un numero -> ");
            txtNumero = txtNumero.replaceAll(",", ".");

            try
            {
                numero = Float.parseFloat(txtNumero);
                ok = true;
            }
            catch(Exception errore)
            {
                JOptionPane.showMessageDialog(null, "Valore inserito errato ti è stato assegnato il valore 0\n" + errore.getMessage());
            }
        }

		return numero;
	}

	public static float inserisciNumero (String messaggio)
	{
		float numero = 0;
        boolean ok = false;

        while (!ok){
            String txtNumero = JOptionPane.showInputDialog(messaggio);
            txtNumero = txtNumero.replaceAll(",", ".");

            try
            {
                numero = Float.parseFloat(txtNumero);
                ok = true;
            }
            catch(Exception errore)
            {
                JOptionPane.showMessageDialog(null, "Valore inserito errato ti è stato assegnato il valore 0\n" + errore.getMessage());
            }
        }
		
		return numero;
	}

	public static float inserisciNumero (String messaggio, int numeroDecimale)
	{
		float numero = 0;
        boolean ok = false;

        while (!ok){
            String txtNumero = JOptionPane.showInputDialog(messaggio);
            txtNumero = txtNumero.replaceAll(",", ".");

            try
            {
                numero = Float.parseFloat(txtNumero);
                ok = true;
            }
            catch(Exception errore)
            {
                JOptionPane.showMessageDialog(null, "Valore inserito errato ti è stato assegnato il valore 0\n" + errore.getMessage());
            }
        }

		// arrotondare a numeroDecimale
		// 0 -> 1 ; 1 -> 10 ; 2 -> 100 ; 3 -> 1000 ...

		float arrotondare = (float) Math.pow(10, numeroDecimale);
		
		/*
		switch (numeroDecimale) 
		{
			case 0:
				arrotondare = 1;
				break;
			
			case 1:
				arrotondare = 10;
				break;
			
			case 2:
				arrotondare = 100;
				break;
			
			case 3:
				arrotondare = 1000;
				break;
			
			case 4:
				arrotondare = 10000;
				break;
			
			default:
				stampa("Valore inserito non valido");
				break;
		}
		*/

		numero = Math.round(numero*arrotondare)/arrotondare;		
		
		return numero;
	}

	public static void stampa (String testo)
	{
		System.out.println(testo);
	}

	public static void stampaNumeri (float numero)
	{
		System.out.println(numero);
	}

    public static String giornoSettimana (int numero)
    {
        String giorno = "";

        switch (numero)
        {
            case 1:
                giorno = "Lunedì";
                break;
            
            case 2:
                giorno = "Martedì";
                break;
            
            case 3:
                giorno = "Mercoledì";
                break;
            
            case 4:
                giorno = "Giovedì";
                break;

            case 5:
                giorno = "Venerdì";
                break;

            case 6:
                giorno = "Sabato";
                break;

            case 7:
                giorno = "Domenica";
                break;

            default:
                giorno = "Valore inserito non valido";
                break;
        }

        return giorno;
    }

    public static float distanza3D (float x, float y, float z)
    {
        float distanza = 0;

        distanza = (float)Math.sqrt(x*x + y*y + z*z);

        return distanza;
    }
}

    


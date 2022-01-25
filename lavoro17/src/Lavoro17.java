package lavoro17.src;

public class Lavoro17 
{
    public static void main(String[] args) throws Exception 
    {
        /*
        if (args.length != 1)
        {
            System.out.println("Devi passare un numero come parametro");
            System.exit(0);
        }

        int x = Integer.parseInt(args[0]);
        */

		float x = 0, y = 0, z = 0;

		x = Tool.inserisciNumero();
		y = Tool.inserisciNumero("Inserisci il valore di y ->");
		z = Tool.inserisciNumero("Inserisci il valore di z ->", 2);
		
		Tool.stampaNumeri(x);
        Tool.stampaNumeri(y);  
		Tool.stampaNumeri(z);

		String giorno = Tool.giornoSettimana(2);
		Tool.stampa(giorno);
		
    }
}

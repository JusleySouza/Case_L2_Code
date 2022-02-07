package l2_code.desafio3;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Algoc {

	public static final int PLUSONE = 1;
	public static final int MINUSONE = -1;
	public static final int INC = 1;
	public static final int DUP = 2;

	public static void main(String[] args) throws IOException{
		
		Scanner scanner = new Scanner(new FileReader("src/algoc-in.txt")).useDelimiter("\\n");
		String saida1 = "";
		String saida2 = "";
		String saida3 = "";

	    FileWriter arq = new FileWriter("src/algoc-out.txt");
	    PrintWriter gravarArq = new PrintWriter(arq);
		
	    while (scanner.hasNext()) {
			 String constante = scanner.nextLine();
			 int numero = Integer.parseInt(constante);
			 int verificador1 = PLUSONE;
			 int verificador2 = MINUSONE;
			 
	    
			 if (numero > 0) {
				 
				 while(verificador1 <= numero) {
					 if ( numero % 2 == 0 ) {
						 saida2 =  "DUP" ;
					 }
					 else {
						 saida2 = "DUP";
						 saida3 = "INC";
					 }
					 verificador1 *=2;
				 }
				 saida1 = "\nConstante " + numero + "\nPLUSONE";
				 

			 }
			 else if (numero < 0) {
				 while(verificador2 <= numero) {
					 if ( numero % 2 == 0 ) {
						 saida2 =  "DUP" ;
					 }
					 else {
						 saida2 = "DUP";
						 saida3 = "INC";
					 }
					 verificador2 *=2;
				 }
				 
				 saida1 = "\nConstante " + numero + "\nMINUSONE";
				 
			 }
			 else {
				 break;
			 }
			 
	    
			 gravarArq.printf(saida1 + "\n");
			 gravarArq.printf(saida2 + "\n");
			 gravarArq.printf(saida3 + "\n");
    
	    }
	    arq.close();
	 }
}

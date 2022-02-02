package l2_code.desafio2;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Verb {

	public static void main(String[] args) throws IOException{
		
		Scanner scanner = new Scanner(new FileReader("src/verb-in.txt")).useDelimiter("\\n");
		String saida;

	    FileWriter arq = new FileWriter("src/verb-out.txt");
	    PrintWriter gravarArq = new PrintWriter(arq);
		
		 while (scanner.hasNext()) {
			 String palavra = scanner.nextLine();
	
			 if(palavra.substring(palavra.length()-1).equalsIgnoreCase("a")
					 && !palavra.substring(palavra.length()-2).equalsIgnoreCase("aa")
					 ^  !palavra.substring(palavra.length()-2).equalsIgnoreCase("ae")
					 ^  !palavra.substring(palavra.length()-2).equalsIgnoreCase("ia")
					 ^  !palavra.substring(palavra.length()-2).equalsIgnoreCase("oa")
					 ^  !palavra.substring(palavra.length()-2).equalsIgnoreCase("ua")){
				 
				 saida = palavra + " - verb " + palavra.substring(0, palavra.length()-1) 
				 	+ palavra.substring(palavra.length()-1).replaceAll("a", "en")
					+ ", present tense, 3rd person";
			 } 
			 else if( palavra.substring(palavra.length()-1).equalsIgnoreCase("e")
					 && !palavra.substring(palavra.length()-2).equalsIgnoreCase("ae")
					 ^  !palavra.substring(palavra.length()-2).equalsIgnoreCase("ee")
					 ^  !palavra.substring(palavra.length()-2).equalsIgnoreCase("ie")
					 ^  !palavra.substring(palavra.length()-2).equalsIgnoreCase("oe")
					 ^  !palavra.substring(palavra.length()-2).equalsIgnoreCase("ue")) {
				 
				 saida = palavra + " - verb " + palavra.substring(0, palavra.length()-1) 
					+ palavra.substring(palavra.length()-1).replaceAll("e", "en")
					+ ", past tense, 3rd person";
			 }
			 else if(palavra.substring(palavra.length()-1).equalsIgnoreCase("o")
					 && !palavra.substring(palavra.length()-2).equalsIgnoreCase("ao")
					 ^  !palavra.substring(palavra.length()-2).equalsIgnoreCase("eo")
					 ^  !palavra.substring(palavra.length()-2).equalsIgnoreCase("io")
					 ^  !palavra.substring(palavra.length()-2).equalsIgnoreCase("oo")
					 ^  !palavra.substring(palavra.length()-2).equalsIgnoreCase("uo")) {
				 
				 saida  = palavra + " - verb " + palavra.substring(0, palavra.length()-1) 
					+ palavra.substring(palavra.length()-1).replaceAll("o", "en")
					+ ", present tense, 1st person";
			 } 
			 else if(palavra.substring(palavra.length()-1).equalsIgnoreCase("i") 
					 && !palavra.substring(palavra.length()-2).equalsIgnoreCase("oi")
					 ^  !palavra.substring(palavra.length()-2).equalsIgnoreCase("ui")
					 ^  !palavra.substring(palavra.length()-2).equalsIgnoreCase("ii")
					 ^  !palavra.substring(palavra.length()-2).equalsIgnoreCase("ai")
					 ^  !palavra.substring(palavra.length()-2).equalsIgnoreCase("ei")) {
				 
				 saida  = palavra + " - verb " + palavra.substring(0, palavra.length()-1)
					+ palavra.substring(palavra.length()-1).replaceAll("i", "en")
					+ ", future tense, 3rd person";
			 } 
			 else if(palavra.substring(palavra.length()-2, palavra.length()).equalsIgnoreCase("ai")) {
				 saida  = palavra + " - verb " + palavra.substring(0, palavra.length()-2)
					+ palavra.substring(palavra.length()-2).replaceAll("ai", "en")
					+ ", future tense, 1st person";
			 } 
			 else if(palavra.substring(palavra.length()-2, palavra.length()).equalsIgnoreCase("ei")) {
				 saida  = palavra + " - verb " + palavra.substring(0, palavra.length()-2)
					+ palavra.substring(palavra.length()-2).replaceAll("ei", "en")
					+ ", past tense, 1st person";
			 }
			 else if(palavra.substring(palavra.length()-2, palavra.length()).equalsIgnoreCase("os")) {
				 saida  = palavra + " - verb " + palavra.substring(0, palavra.length()-2)
					+ palavra.substring(palavra.length()-2).replaceAll("os", "en")
					+ ", present tense, 2nd person";
			 }
			 else if(palavra.substring(palavra.length()-2, palavra.length()).equalsIgnoreCase("es")) {
				 saida  = palavra + " - verb " + palavra.substring(0, palavra.length()-2)
					+ palavra.substring(palavra.length()-2).replaceAll("es", "en")
					+ ", past tense, 2nd person";
			 }
			 else if( palavra.substring(palavra.length()-3, palavra.length()).equalsIgnoreCase("ais")) {
				 saida  = palavra + " - verb " + palavra.substring(0, palavra.length()-3)
					+ palavra.substring(palavra.length()-3).replaceAll("ais", "en")
					+ ", future tense, 2nd person";
			 }
			 else if( palavra.substring(palavra.length()-3, palavra.length()).equalsIgnoreCase("ons")) {
				 saida  = palavra + " - verb " + palavra.substring(0, palavra.length()-3)
					+ palavra.substring(palavra.length()-3).replaceAll("ons", "en")
					+ ", present tense, 5th person";
			 } 
			 else if(palavra.substring(palavra.length()-2, palavra.length()).equalsIgnoreCase("am")) {
				 saida  = palavra + " - verb " + palavra.substring(0, palavra.length()-2)
					+ palavra.substring(palavra.length()-2).replaceAll("am", "en")
					+ ", present tense, 6th person";
			 }
			 else if(palavra.substring(palavra.length()-2, palavra.length()).equalsIgnoreCase("em")
					 && !palavra.substring(palavra.length()-3).equalsIgnoreCase("aem")) {
				 saida  = palavra + " - verb " + palavra.substring(0, palavra.length()-2)
					+ palavra.substring(palavra.length()-2).replaceAll("em", "en")
					+ ", past tense, 4th person";
			 }
			 else if( palavra.substring(palavra.length()-2, palavra.length()).equalsIgnoreCase("im")
					 && !palavra.substring(palavra.length()-3).equalsIgnoreCase("aim")) {
				 saida  = palavra + " - verb " + palavra.substring(0, palavra.length()-2)
					+ palavra.substring(palavra.length()-2).replaceAll("im", "en")
					+ ", past tense, 6th person";
			 }
			 else if (palavra.substring(palavra.length()-2, palavra.length()).equalsIgnoreCase("om")) {
				 saida  = palavra + " - verb " + palavra.substring(0, palavra.length()-2)
					+ palavra.substring(palavra.length()-2).replaceAll("om", "en")
					+ ", present tense, 4th person";
			 }
			 else if( palavra.substring(palavra.length()-3, palavra.length()).equalsIgnoreCase("aem")) {
				 saida  = palavra + " - verb " + palavra.substring(0, palavra.length()-3)
					+ palavra.substring(palavra.length()-3).replaceAll("aem", "en")
					+ ", future tense, 4th person";
			 }
			 else if( palavra.substring(palavra.length()-3, palavra.length()).equalsIgnoreCase("aim")) {
				 saida  = palavra + " - verb " + palavra.substring(0, palavra.length()-3)
					+ palavra.substring(palavra.length()-3).replaceAll("aim", "en")
					+ ", future tense, 6th person";
			 } 
			 else if(palavra.substring(palavra.length()-3).equalsIgnoreCase("est")) {
				 saida  = palavra + " - verb " + palavra.substring(0, palavra.length()-3)
					+ palavra.substring(palavra.length()-3).replaceAll("est", "en")
					+ ", past tense, 5th person";
			 }
			 else if( palavra.substring(palavra.length()-4).equalsIgnoreCase("aist")) {
				 saida  = palavra + " - verb " + palavra.substring(0, palavra.length()-4)
					+ palavra.substring(palavra.length()-4).replaceAll("aist", "en")
					+ ", future tense, 5th person";
			 } 
			 else {
				 saida  = palavra + " - Not a verb case";
			 }
		


		    gravarArq.printf(saida + "\n");
		    
		
		 }
		 arq.close();
	
	}
}

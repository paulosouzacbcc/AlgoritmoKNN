package br.com.paulosouza;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class ReadEntrada {

	public static void main(String[] args) throws IOException{

		try {
			
			InputStream is = new FileInputStream("arquivo.txt");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);

			String linha = br.readLine();
			ArrayList<Double> arrayAtributos = new ArrayList<Double>();
			
			double atributoDouble;
			String atributoString;
			
			while (linha != null) {
				
				
				for (int i = 0; i < 4; i++) {
					
				String valores[] = linha.split(Pattern.quote(","));
				atributoString = valores[i];
				atributoDouble = Double.parseDouble(atributoString);
				
				arrayAtributos.add(atributoDouble);
				System.out.println(arrayAtributos);
				}

				 linha = br.readLine();

				// System.out.println(linha);
			}
			br.close();

		} catch (IOException erro) {
			System.out.println("Erro " + erro);
		}

	}

	public void breakCaracter(String linha) {

		//
		//
		// String numCaractere = linha;
		// for (int i = 0; i < numCaractere.length(); i++) {
		// if (Character.isLetter(numCaractere.charAt(i)) == true)
		// return true;
		//
		// }
		// return false;
		//
		// }

		String inputString = linha;
		char[] characterArray = inputString.toCharArray();
		for (int i = 0; i < characterArray.length; i++) {
			char character = characterArray[i];
			System.out.println("Array Element " + i + " " + character);
		}

	}

}

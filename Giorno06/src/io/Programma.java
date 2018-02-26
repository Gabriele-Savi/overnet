package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Programma {

	public static void main(String[] args) throws IOException {
		File f = new File("prova.txt");
		if(f.exists()) {
			System.out.println("Esiste");
			FileInputStream fis = new FileInputStream(f);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			System.out.println(br.readLine());
		}else
			System.out.println("Non esiste");
		
		
		
		
		BufferedReader br = new BufferedReader(new FileReader("prova.txt"));
		String riga = br.readLine();
		while(riga != null) {
			System.out.println(riga);
			riga = br.readLine();
		}
		
		
		
	}

}

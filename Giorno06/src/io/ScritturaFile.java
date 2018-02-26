package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class ScritturaFile {

	public static void main(String[] args) throws IOException {
		File f = new File("risultato.txt");
		FileOutputStream fos = new FileOutputStream(f);
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		PrintWriter pw = new PrintWriter(osw);
		pw.println("Ciao mondo!");
		pw.flush();
		fos.close(); //Stream close
	}

}

package myapp.metodos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrinterApp {
	public static void printCupom(String conteudo, File dir, String fileName) {
		File file = new File(dir, fileName);
		printCupom(conteudo, dir, file);
	}
	
	
	public static void printCupom(String conteudo, File dir, File file) {
		try {
			if(!dir.exists())
				dir.mkdirs();
			file.createNewFile();
			FileWriter arq = new FileWriter(file.getPath());
			PrintWriter gravar = new PrintWriter(arq);
			
			gravar.print(conteudo);
			arq.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

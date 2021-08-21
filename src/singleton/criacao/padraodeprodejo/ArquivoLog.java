package singleton.criacao.padraodeprodejo;

import java.io.FileWriter;
import java.io.IOException;

public class ArquivoLog {

	private FileWriter arquivo;
	private static ArquivoLog log;
	
	private ArquivoLog() {
		try {
			this.arquivo = new FileWriter("c:\teste.log");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static ArquivoLog getInstance() {
		if (log == null) {
			log = new ArquivoLog();
		}
		
		return log;
	}
}

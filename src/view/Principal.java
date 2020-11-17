package view;

import java.io.IOException;

//import javax.swing.JOptionPane;

import controller.ArquivosController;
import controller.IArquivosController;

public class Principal {
	public static void main(String[] args){
		
		IArquivosController arqCont = new ArquivosController();
		//String dirWIn = JOptionPane.showInputDialog("Entre com o diretório");
		String path = "C:\\Temp";
		String nome = "testeee";
				
		try
		{
		//arqCont.readDir(dirWIn);
		//arqCont.createFile(path, nome);
		//arqCont.readFile(path,  nome);
		arqCont.openFile(path, nome);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}

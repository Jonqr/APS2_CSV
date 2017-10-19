package Csv;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LeitorCsv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DadoCsv csv = new DadoCsv();
		int contador=0;
		try
		{
			
			FileReader arquivoCsv = new FileReader("participantes.csv");
			String linhaCsv = new String();//Guarda linha do arquivo
			Scanner reader = new Scanner(arquivoCsv);	
			while(reader.hasNext()){contador++;}
			System.out.println(contador);
			
			while(reader.hasNext()){
//			System.out.print(lineCsv);
				linhaCsv = reader.nextLine();
				String [] separador = linhaCsv.split(","); // quebra a virgula 
				csv.setNome(separador[0]);
				csv.setEmail(separador[1]);
			
			System.out.println("Nome: "+ csv.getNome()+", Email: " + csv.getEmail());
			}
		}catch (IOException e) {
			// TODO: handle exception
		}
		
		
	}

}

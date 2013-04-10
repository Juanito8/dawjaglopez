import java.io.*;
public class BuscarEscribir{
	public static void main(String []args){
		FileReader fr=null;
		BufferedReader br=null;
		FileWriter fw=null;
		PrintWriter pw=null;
		String m=args[0];
		try{
			fr=new FileReader("e.txt"); // Para elegir el documento que leemos
			br=new BufferedReader(fr);
			
			fw=new FileWriter("s.htm"); // El htm que creamos modificado
			pw=new PrintWriter(fw);
			
			String linea; // Donde almacena la linea de texto que leemos
		
			while((linea=br.readLine())!=null){ // Para comparar la linea y si no es null
				String[] dato=linea.split(" "); // Para dividir los String en palabras
				for(int i=0;i<dato.length;i++){
					if(dato[i].equals(m)){
						pw.print(" <b>"+m+"</b> "); // Modifica el htm 
					}
					else{
						pw.print(dato[i]+" ");
						}
				}
			}
			}
			catch(Exception e){
				System.out.println("Error al abrir el fichero");
		
			}
			finally{
				try{
					fr.close();
					fw.close();
				}
				catch(Exception e){
					System.out.println("Error al cerrar el fichero");
				}
		}	
	}
}

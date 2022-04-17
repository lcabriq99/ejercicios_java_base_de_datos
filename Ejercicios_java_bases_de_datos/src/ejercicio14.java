import java.util.ArrayList;
import java.util.Scanner;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Predicate;

public class ejercicio14 {

	public static void main(String[] args) {

		Scanner Teclado = new Scanner(System.in);
		
		ArrayList<String> idiomas = new ArrayList<>();

		String miIdioma;
		int contador=0;
		System.out.println("Introducir idioma: ");
		 miIdioma=Teclado.nextLine();
	
		while (!miIdioma.equals("0")) {
			idiomas.add(miIdioma);
			contador++;
			System.out.println("introducir idioma");
			miIdioma=Teclado.nextLine();
			
		}
		
		
		
		ObjectContainer base; // abrir la base de datos
		base = Db4oEmbedded.openFile("Libro.db4o"); // abrir la base de datos

		Libro libro1 = new Libro("1" , "Quijote" , "Cervantes" , "Anaya" , "Sipnosis" , 2100 , "Ingles" 
				, 2010 , 20 , false , "Aventuras");
		
		Libro libro2 = new Libro("2" , "Lazarillo" , "Cervantes" , "Anaya" , "Sipnosis" , 2100 , "Ingles" 
				, 2010 , 20 , false , "Aventuras");
		
		Libro libro3 = new Libro("3" , "Código Davinci" , "Cervantes" , "Anaya" , "Sipnosis" , 2100 , "Ingles" 
				, 2010 , 20 , false , "Aventuras");
		
		
		base.store(libro1); // coge la instancia y la mete en la base de datos
		base.store(libro2); // coge la instancia y la mete en la base de datos
		base.store(libro3); // coge la instancia y la mete en la base de datos
		
		Libro miLibro = new Libro(null , null , null, null , null , 0 , null , 0 , 0 , false , null);
		
		ObjectSet resultado = base.queryByExample(miLibro);
		
		while(resultado.hasNext()) {
			System.out.println(resultado.next());
		}
		
		System.out.println("------------------------");
		
		Predicate<Libro> consulta = new Predicate<Libro>() {

			
			@Override
			public boolean match(Libro l) {
				boolean condicional=false;
				
				for (int i = 0; i < idiomas.size(); i++) {
					condicional =condicional || (l.getIdioma().equalsIgnoreCase(idiomas.get(i))); 
					// lo de condicional =condicional es para que los recorra todos , al ser un
					// public boolean los comprueba y si da true es el q queremos pero si uno
					// da true , todos serán true porque los machaca asi que es para que los recorra todos y guarde los true
				}
				
				
				
				return condicional;
			}
			
		};
		
		 resultado = base.query(consulta);

		while(resultado.hasNext()) {
			System.out.println(resultado.next());
		}
		
		base.close();
	}
}
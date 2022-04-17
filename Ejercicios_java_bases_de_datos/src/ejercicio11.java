import java.util.Base64;
import java.util.Scanner;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Predicate;

public class ejercicio11 {

	public static void main(String[] args) {

		Scanner Teclado = new Scanner(System.in); //abrir la base de datos
		ObjectContainer base; //abrir la base de datos
		
		
		base = Db4oEmbedded.openFile("Libro.db4o");

		System.out.println("Introduce la editorial");
		String editorial = Teclado.nextLine();
		
		System.out.println("Introduce la categoria");
		String categoria = Teclado.nextLine();

		Predicate<Libro> consulta = new Predicate<Libro>() {

			@Override
			public boolean match(Libro libro) {

				return (libro.getEditorial().equalsIgnoreCase(editorial) && libro.getCategoria().equalsIgnoreCase(categoria));
			}

		};
		
		ObjectSet resultado = base.query(consulta);
		while(resultado.hasNext()) {
			System.out.println(resultado.next());
			
			
		}
		base.close();
	}
}

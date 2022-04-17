import java.util.Base64;
import java.util.Scanner;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Predicate;

public class ejercicio8 {

	public static void main(String[] args) {

		Scanner Teclado = new Scanner(System.in); //abrir la base de datos
		ObjectContainer base; //abrir la base de datos
		
		
		base = Db4oEmbedded.openFile("Libro.db4o");

		System.out.println("Introduce el precio del libro");
		int precio = Teclado.nextInt();
		Teclado.hasNextLine();

		Predicate<Libro> consulta = new Predicate<Libro>() {

			@Override
			public boolean match(Libro libro) {

				return (libro.getPrecio() >= precio);
			}

		};
		
		ObjectSet resultado = base.query(consulta);
		while(resultado.hasNext()) {
			System.out.println(resultado.next());
			
			base.close();
		}
	}
}

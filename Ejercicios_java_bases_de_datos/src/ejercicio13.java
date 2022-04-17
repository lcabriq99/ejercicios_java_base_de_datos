import java.util.Base64;
import java.util.Scanner;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Predicate;

public class ejercicio13 {

	public static void main(String[] args) {

		Scanner Teclado = new Scanner(System.in);

		ObjectContainer base; // abrir la base de datos
		base = Db4oEmbedded.openFile("Libro.db4o"); // abrir la base de datos

		System.out.println("Introduce si quieres motrar libros de novedad o no -> true/false");
		boolean novedad = Teclado.nextBoolean();

		if (novedad == true) {
			
			Predicate<Libro> consulta = new Predicate<Libro>() {

				@Override
				public boolean match(Libro libro) {

					return (libro.getNovedad() == true);
				}

			};

			ObjectSet resultado = base.query(consulta);
			while (resultado.hasNext()) {
				System.out.println(resultado.next());

			}

		}else {
			
			Predicate<Libro> consulta = new Predicate<Libro>() {

				@Override
				public boolean match(Libro libro) {

					return (libro.getNovedad() == false);
				}

			};

			ObjectSet resultado = base.query(consulta);
			while (resultado.hasNext()) {
				System.out.println(resultado.next());

			}
			
			
		}

		
		base.close();
	}
}
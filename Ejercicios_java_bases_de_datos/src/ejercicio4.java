import java.util.Scanner;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

public class ejercicio4 {

	public static void main(String[] args) {

		Scanner Teclado = new Scanner(System.in);

		System.out.println("Introduce el ISBN del libro");
		String isbn = Teclado.nextLine();

		ObjectContainer base;
		base = Db4oEmbedded.openFile("Libro.db4o");

		Libro libro = new Libro(isbn, null, null, null, null, 0, null, 0, 0, false , null);

		ObjectSet resultado = base.queryByExample(libro);
		
		Libro libro1 = (Libro)resultado.next();

		System.out.println(resultado.next());

		System.out.println("¿Desea eliminar la base de datos?");
		String respuesta = Teclado.nextLine();

		if (respuesta.equalsIgnoreCase("Si")) {
			base.delete(libro1);
		}

		base.close();
	}

}

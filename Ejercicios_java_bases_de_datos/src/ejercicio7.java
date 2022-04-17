import java.util.Scanner;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

public class ejercicio7 {

	public static void main(String[] args) {
		
		
		//Crear y abrir la base de datos
		ObjectContainer base;
		base = Db4oEmbedded.openFile("Libro.db4o");
		//
		

		Libro miLibro = new Libro(null, null, null, null, null, 0, null, 0, 0, false , null);
		ObjectSet resultado = base.queryByExample(miLibro);
		while (resultado.hasNext()) {
			System.out.println(resultado.next());

		}

		base.close();

	}

}

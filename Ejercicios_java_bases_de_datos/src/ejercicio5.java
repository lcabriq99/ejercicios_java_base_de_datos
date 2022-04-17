import java.util.Scanner;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

public class ejercicio5 {
	
	public static void main(String[] args) {
		
		Scanner Teclado = new Scanner(System.in);
		
		System.out.println("Introduce el ISBN del libro");
		String isbn = Teclado.nextLine();
		
		ObjectContainer base;
		base = Db4oEmbedded.openFile("Libro.db4o");
		
		Libro libro = new Libro(isbn, null, null , null, null, 0, null, 0, 0, false , null);
		
		ObjectSet resultado = base.queryByExample(libro);
		
		
		Libro libro1 = (Libro)resultado.next();
		
		System.out.println("Dame el ISBN");
		String ISBN = Teclado.nextLine();
		libro1.setISBN(ISBN);

		System.out.println("Dame el titulo");
		String titulo = Teclado.nextLine();
		libro1.setTitulo(titulo);

		System.out.println("Dame el autor");
		String autor = Teclado.nextLine();
		libro1.setAutor(autor);

		System.out.println("Dame el editorial");
		String editorial = Teclado.nextLine();
		libro1.setEditorial(editorial);

		System.out.println("Dame el sinopsis");
		String sinopsis = Teclado.nextLine();
		libro1.setSinopsis(sinopsis);

		System.out.println("Dame el pagina");
		int pagina = Teclado.nextInt();
		Teclado.nextLine();
		libro1.setPagina(pagina);

		System.out.println("Dame el idioma");
		String idioma = Teclado.nextLine();
		libro1.setIdioma(idioma);

		System.out.println("Dame el anyoPublicacion");
		int anyoPublicacion = Teclado.nextInt();
		Teclado.nextLine();
		libro1.setAnyoPublicacion(anyoPublicacion);

		System.out.println("Dame el precio");
		int precio = Teclado.nextInt();
		Teclado.nextLine();
		libro1.setPrecio(precio);

		System.out.println("Dame el novedad");
		Boolean novedad = Teclado.nextBoolean();
		libro1.setNovedad(novedad);
		
	
		
		
		
		base.store(libro1);
		
		System.out.println("Actualizado");
		
		base.close();
	}

}

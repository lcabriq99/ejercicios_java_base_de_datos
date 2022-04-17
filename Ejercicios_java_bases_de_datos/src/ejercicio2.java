import java.util.Scanner;


import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;

public class ejercicio2 {
	public static void main(String[] args) {

		String ISBN;
		String titulo;
		String autor;
		String editorial;
		String sinopsis;
		int pagina;
		String idioma;
		int anyoPublicacion;
		int precio;
		boolean novedad;
		String categoria;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Dame el ISBN");
		ISBN = teclado.nextLine();

		System.out.println("Dame el titulo");
		titulo = teclado.nextLine();

		System.out.println("Dame el autor");
		autor = teclado.nextLine();

		System.out.println("Dame el editorial");
		editorial = teclado.nextLine();

		System.out.println("Dame el sinopsis");
		sinopsis = teclado.nextLine();

		System.out.println("Dame el pagina");
		pagina = teclado.nextInt();
		teclado.nextLine();

		System.out.println("Dame el idioma");
		idioma = teclado.nextLine();

		System.out.println("Dame el anyoPublicacion");
		anyoPublicacion = teclado.nextInt();
		teclado.nextLine();

		System.out.println("Dame el precio");
		precio = teclado.nextInt();
		teclado.nextLine();

		System.out.println("Dame el novedad");
		novedad = teclado.nextBoolean();
		
		System.out.println("Dame la categoria");
		categoria = teclado.nextLine();

		ObjectContainer base;
		base = Db4oEmbedded.openFile("Libro.db4o");

		Libro libro = libro = new Libro(ISBN , titulo , autor , editorial , sinopsis , pagina , idioma , anyoPublicacion , precio , novedad , categoria);
		base.store(libro);
		
		base.close();
	}

}
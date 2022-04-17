import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class ejercicio17 {
	
	public static void main(String[] args) {
		
		Scanner Teclado = new Scanner(System.in);
		
		int idAlquiler;
		String direccion;
		String poblacion;
		double precioAlquiler;
		String idContacto;
		int telefono;
		
		System.out.println("Introduce el idAlquiler");
		idAlquiler=Teclado.nextInt();
		Teclado.nextLine();
		System.out.println("Introduce la direccion");
		direccion=Teclado.nextLine();
		System.out.println("Introduce la poblacion");
		poblacion=Teclado.nextLine();
		System.out.println("Introduce el precio del Alquiler");
		precioAlquiler=Teclado.nextDouble();
		System.out.println("Introduce el idContacto");
		idContacto=Teclado.nextLine();
		System.out.println("Introduce el telefono");
		telefono=Teclado.nextInt();
		Teclado.nextLine();
		
		Connection miConexion =DriverManager.getConnection("jdbc:mysql://localhost:3306/videoclub","root","");
	
		
		
	}

}

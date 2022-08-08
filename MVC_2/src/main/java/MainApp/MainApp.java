package MainApp;

import javax.swing.JOptionPane;

import Controllers.Controller;
import Models.Cliente;
import Views.View;

public class MainApp {
	public static void main(String[] args) {
		// Usamos try-catch obligatoriamente
		try {
			// Cargamos el driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Inicializamos modelo y vista
			Cliente client = new Cliente();
			View view = new View();
			
			// Creamos controlador con parametros cliente y vista
			Controller controller = new Controller(client, view);
			
			// Inicializamos la vista
			controller.startView();
		} catch (ClassNotFoundException e) {
			// En caso que el driver no haya cargado correctamente
			JOptionPane.showMessageDialog(null, "Error charging the Driver for MySQL connection.", "ERROR", 0);
			System.out.println("Message: " + e.getMessage() + "Cause: " + e.getCause());
		}
	}
}
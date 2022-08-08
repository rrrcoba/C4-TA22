package MainApp;

import javax.swing.JOptionPane;

import Controllers.Controller;
import Models.Cliente;
import Views.View;

public class MainApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Usamos try-catch obligatoriamente
		try {
			// Cargamos el driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			Cliente client = new Cliente();
			View view = new View();
			Controller controller = new Controller(client, view);
			controller.startView();
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Error charging the Driver for MySQL connection.", "ERROR", 0);
			System.out.println("Message: " + e.getMessage() + "Cause: " + e.getCause());
		}
	}
}
package MainApp;

import javax.swing.JOptionPane;


import Views.ViewScientific;

public class MainApp  {
	public static void main( String[] args ) {
		// Usamos try-catch obligatoriamente
		try {
			// Cargamos el driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			ViewScientific viewScientific = new ViewScientific();
		} catch (ClassNotFoundException e) {
			// En caso que el driver no haya cargado correctamente
			JOptionPane.showMessageDialog(null, "Error charging the Driver for MySQL connection.", "ERROR", 0);
			System.out.println("Message: " + e.getMessage() + "Cause: " + e.getCause());
		}
	}
}
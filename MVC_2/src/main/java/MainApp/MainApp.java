package main.java.MainApp;

import javax.swing.JOptionPane;

import main.java.Controllers.Controller;
import main.java.Controllers.ControllerVideos;
import main.java.Models.Cliente;
import main.java.Models.Videos;
import main.java.Views.View;
import main.java.Views.ViewV;

public class MainApp {
	public static void main(String[] args) {
		// Usamos try-catch obligatoriamente
		try {
			// Cargamos el driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			int option = Integer.parseInt(JOptionPane.showInputDialog("Elige con que tabla quieres trabajar. 1 para clientes y 2 para videos"));
			
			if (option == 1) {
				// Inicializamos modelo y vista
				Cliente client = new Cliente();
				View view = new View();

				
				// Creamos controlador con parametros cliente y vista
				Controller controller = new Controller(client, view);
				
				// Inicializamos la vista
				controller.startView();
			} else {
				// Inicializamos modelo y vista
				Videos videos = new Videos();
				ViewV viewVideo = new ViewV();

				
				// Creamos controlador con parametros cliente y vista
				ControllerVideos controllerVideos = new ControllerVideos(videos, viewVideo);
				
				// Inicializamos la vista
				controllerVideos.startView();
			}
			
			
			
		} catch (ClassNotFoundException e) {
			// En caso que el driver no haya cargado correctamente
			JOptionPane.showMessageDialog(null, "Error charging the Driver for MySQL connection.", "ERROR", 0);
			System.out.println("Message: " + e.getMessage() + "Cause: " + e.getCause());
		}
	}
}
package MainApp;

import javax.swing.JOptionPane;

import Controllers.ControllerAssign;
import Controllers.ControllerProject;
import Controllers.ControllerScientific;
import Models.ModelAssign;
import Models.ModelProject;
import Models.ModelScientific;
import Views.ViewAssign;
import Views.ViewProject;
import Views.ViewScientific;

public class MainApp  {
	public static void main( String[] args ) {
		// Usamos try-catch obligatoriamente
		try {
			// Cargamos el driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			System.out.println("Driver OK.");
			
			int option = Integer.parseInt(JOptionPane.showInputDialog("Elige con que tabla quieres trabajar. 1 para cientificos, 2 para proyectos y 3 para asignar a"));
			
			
			if (option == 1) {
				// Inicializamos modelo y vista
				ModelScientific cientifico = new ModelScientific();
				ViewScientific viewSc = new ViewScientific();

				
				// Creamos controlador con parametros cliente y vista
				ControllerScientific controllerSc = new ControllerScientific(cientifico, viewSc);
				
				// Inicializamos la vista
				controllerSc.startView();
			} else if(option == 2) {
				// Inicializamos modelo y vista
				ModelProject project = new ModelProject();
				ViewProject viewP = new ViewProject();

				
				// Creamos controlador con parametros cliente y vista
				ControllerProject controllerP = new ControllerProject(project, viewP);
				
				// Inicializamos la vista
				controllerP.startView();
			} else {
				// Inicializamos modelo y vista
				ModelAssign assing = new ModelAssign();
				ViewAssign viewA = new ViewAssign();

				
				// Creamos controlador con parametros cliente y vista
				ControllerAssign controllerA = new ControllerAssign(assing, viewA);
				
				// Inicializamos la vista
				controllerA.startView();
			}
			
			
			
		} catch (ClassNotFoundException e) {
			// En caso que el driver no haya cargado correctamente
			JOptionPane.showMessageDialog(null, "Error charging the Driver for MySQL connection.", "ERROR", 0);
			System.out.println("Message: " + e.getMessage() + "Cause: " + e.getCause());
		}
	}
}
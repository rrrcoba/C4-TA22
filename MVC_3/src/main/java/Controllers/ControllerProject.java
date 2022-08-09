package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Models.ModelProject;
import Views.ViewProject;

public class ControllerProject implements ActionListener{

	// Variables
		private ModelProject project;
		private ViewProject view;

		private String id;
		private String name;
		private String hours;

		/**
		 * Constructor de controller
		 * 
		 * @param client
		 * @param view
		 */
		public ControllerProject(ModelProject project, ViewProject view) {
			this.project = project;
			this.view = view;
		}

		/**
		 * Inicializa la vista
		 */
		public void startView() {
			view.setTitle("Proyecto");
			view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			view.setVisible(true);
			view.setBounds(100, 100, 437, 347);

			// Ponemos las acciones a cada botón
			view.getBtnCreate().addActionListener(this);
			view.getBtnSelect().addActionListener(this);
			view.getBtnUpdate().addActionListener(this);
			view.getBtnDelete().addActionListener(this);
			view.getBtnSend().addActionListener(this);
		}

		/**
		 * Acción...
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			if (view.getBtnCreate() == e.getSource()) {
				initializeForm();
				view.getLabelTitle().setText("Crear Datos");			

			} else if (view.getBtnSelect() == e.getSource()) {
				//TODO Acción Panel inicial botón Seleccionar
				
				ResultSet r = null;
				project.openConnection();
				r = project.getValues();
				
				try {
					while(r.next()) {
						System.out.println("Id: " + r.getString("Id"));
						System.out.println("Nombre: " + r.getString("Nombre"));
						System.out.println("Horas: " + r.getString("Horas"));
					}
				} catch (SQLException ex) {
					System.out.println(ex);
				}

				project.closeConnection();

			} else if (view.getBtnUpdate() == e.getSource()) {
				initializeForm();
				view.getLabelTitle().setText("Actualizar Datos");

			} else if (view.getBtnDelete() == e.getSource()) {
				//TODO Acción Panel inicial botón Eliminar
				String id = JOptionPane.showInputDialog("Indica la ID del registro que quieres eliminar.");
				project.openConnection();
				project.deleteRecord(id);
				project.closeConnection();

			} else if (view.getBtnSend() == e.getSource()) {
				if(view.getLabelTitle().getText().compareTo("Actualizar Datos") == 0) {
					int id = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es el ID del registro que quieres cambiar?"));
					
					this.name = view.getTextField_name().getText();
					this.hours = view.getTextField_hours().getText();
					
					project.openConnection();
					project.updateData(name, hours);
					project.closeConnection();
					
				} else {
					this.name = view.getTextField_name().getText();
					this.hours = view.getTextField_hours().getText();

					project.openConnection();
					project.insertData(this.name, this.hours);
					project.closeConnection();
				}
				
				// Volvemos al panel inicial
				initializeFirstPanel();
			}	
		}


		/**
		 * Método que oculta los elementos del panel inicial y hace visibles los del panel de formulario
		 */
		public void initializeForm () {
			//TODO
			view.getBtnCreate().setVisible(false);
			view.getBtnSelect().setVisible(false);
			view.getBtnUpdate().setVisible(false);
			view.getBtnDelete().setVisible(false);
			view.getLblMsg().setVisible(false);

			view.getLabelTitle().setVisible(true);
			view.getLabelName().setVisible(true);
			view.getHours().setVisible(true);
			view.getID().setVisible(true);
			view.getBtnSend().setVisible(true);
			view.getTextField_name().setVisible(true);
			view.getTextField_hours().setVisible(true);
			view.getTextField_id().setVisible(true);
		}
		
		/**
		 * Método que oculta los elementos del formulario y hace visibles los iniciales
		 */
		public void initializeFirstPanel () {
			view.getBtnCreate().setVisible(true);
			view.getBtnSelect().setVisible(true);
			view.getBtnUpdate().setVisible(true);
			view.getBtnDelete().setVisible(true);
			view.getLblMsg().setVisible(true);

			view.getLabelTitle().setVisible(false);
			view.getLabelName().setVisible(false);
			view.getHours().setVisible(false);
			view.getID().setVisible(false);
			view.getBtnSend().setVisible(false);
			view.getTextField_name().setVisible(false);
			view.getTextField_Hours().setVisible(false);
			view.getTextField_ID().setVisible(false);
		}


		/**
		 * Método para probar la conexión con el MySQL del Fedora
		 */
		public void connectionTest() {
			project.openConnection();
			project.closeConnection();
			System.out.println("Conexión y desconexión OK");
		}
}

package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Models.ModelScientific;
import Views.ViewScientific;

public class ControllerScientific implements ActionListener{

	// Variables
		private ModelScientific cientifico;
		private ViewScientific view;

		private String dni;
		private String nomApels;

		/**
		 * 
		 * @param cientifico
		 * @param view
		 */
		public ControllerScientific(ModelScientific cientifico, ViewScientific view) {
			this.cientifico = cientifico;
			this.view = view;
		}

		/**
		 * Inicializa la vista
		 */
		public void startView() {
			view.setTitle("Cientifico");
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
				view.getLblMsg().setText("Crear Datos");			

			} else if (view.getBtnSelect() == e.getSource()) {
				//TODO Acción Panel inicial botón Seleccionar
				
				ResultSet r = null;
				cientifico.openConnection();
				r = cientifico.getValues();
				
				try {
					while(r.next()) {
						System.out.println("DNI: " + r.getString("DNI"));
						System.out.println("Nombre y apellidos: " + r.getString("Nombre_Apellidos"));
					}
				} catch (SQLException ex) {
					System.out.println(ex);
				}

				cientifico.closeConnection();

			} else if (view.getBtnUpdate() == e.getSource()) {
				view.getBtnCreate().setVisible(false);
				view.getBtnSelect().setVisible(false);
				view.getBtnUpdate().setVisible(false);
				view.getBtnDelete().setVisible(false);

				view.getLbl_NameSurnames().setVisible(true);
				view.getBtnSend().setVisible(true);
				view.getTextField_NameSurnames().setVisible(true);
				
				view.getLblMsg().setText("Actualizar Datos");

			} else if (view.getBtnDelete() == e.getSource()) {
				//TODO Acción Panel inicial botón Eliminar
				String id = JOptionPane.showInputDialog("Indica el DNI del registro que quieres eliminar.");
				cientifico.openConnection();
				cientifico.deleteRecord(id);
				cientifico.closeConnection();

			} else if (view.getBtnSend() == e.getSource()) {
				if(view.getLblMsg().getText().compareTo("Actualizar Datos") == 0) {
					String dni = JOptionPane.showInputDialog("¿Cuál es el DNI del registro que quieres cambiar?");
					
					this.dni = view.getTextField_dni().getText();
					this.nomApels = view.getTextField_NameSurnames().getText();
					
					cientifico.openConnection();
					cientifico.updateData(dni, nomApels);
					cientifico.closeConnection();
					
				} else {
					this.dni = view.getTextField_dni().getText();
					this.nomApels = view.getTextField_NameSurnames().getText();

					cientifico.openConnection();
					cientifico.insertData(this.dni, this.nomApels);
					cientifico.closeConnection();
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


			view.getLbl_dni().setVisible(true);
			view.getLbl_NameSurnames().setVisible(true);
			view.getBtnSend().setVisible(true);
			view.getTextField_NameSurnames().setVisible(true);
			view.getTextField_dni().setVisible(true);
		}
		
		/**
		 * Método que oculta los elementos del formulario y hace visibles los iniciales
		 */
		public void initializeFirstPanel () {
			view.getBtnCreate().setVisible(true);
			view.getBtnSelect().setVisible(true);
			view.getBtnUpdate().setVisible(true);
			view.getBtnDelete().setVisible(true);

			view.getLblMsg().setText("Porfavor, indica lo que deseas hacer:");
			view.getLbl_dni().setVisible(false);
			view.getLbl_NameSurnames().setVisible(false);
			view.getBtnSend().setVisible(false);
			view.getTextField_NameSurnames().setVisible(false);
			view.getTextField_dni().setVisible(false);
		}


		/**
		 * Método para probar la conexión con el MySQL del Fedora
		 */
		public void connectionTest() {
			cientifico.openConnection();
			cientifico.closeConnection();
			System.out.println("Conexión y desconexión OK");
		}
}

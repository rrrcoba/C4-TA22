package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Models.ModelAssign;
import Views.ViewAssign;

public class ControllerAssign implements ActionListener{


	// Variables
	private ModelAssign asign;
	private ViewAssign view;

	private String cientifico;
	private String proyecto;

	/**
	 * 
	 * @param asign
	 * @param view
	 */
	public ControllerAssign(ModelAssign asign, ViewAssign view) {
		this.asign = asign;
		this.view = view;
	}

	/**
	 * Inicializa la vista
	 */
	public void startView() {
		view.setTitle("Asignado A");
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
			asign.openConnection();
			r = asign.getValues();
			
			try {
				while(r.next()) {
					System.out.println("Cientifico: " + r.getString("Cientifico"));
					System.out.println("Proyecto: " + r.getString("Proyecto"));
				}
			} catch (SQLException ex) {
				System.out.println(ex);
			}

			asign.closeConnection();

		} else if (view.getBtnUpdate() == e.getSource()) {
			initializeForm();
			view.getLabelTitle().setText("Actualizar Datos");

		} else if (view.getBtnDelete() == e.getSource()) {
			//TODO Acción Panel inicial botón Eliminar
			String id = JOptionPane.showInputDialog("Indica la ID del registro que quieres eliminar.");
			asign.openConnection();
			asign.deleteRecord(id);
			asign.closeConnection();

		} else if (view.getBtnSend() == e.getSource()) {
			if(view.getLabelTitle().getText().compareTo("Actualizar Datos") == 0) {
				int id = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es el ID del registro que quieres cambiar?"));
				
				this.cientifico = view.getTextField_cientifico().getText();
				this.proyecto = view.getTextField_proyecto().getText();
				
				asign.openConnection();
				asign.updateData(cientifico, proyecto);
				asign.closeConnection();
				
			} else {
				this.cientifico = view.getTextField_cientifico().getText();
				this.proyecto = view.getTextField_proyecto().getText();

				asign.openConnection();
				asign.insertData(this.cientifico, this.proyecto);
				asign.closeConnection();
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
		view.getSurname().setVisible(true);
		view.getBtnSend().setVisible(true);
		view.getTextField_name().setVisible(true);
		view.getTextField_surname().setVisible(true);
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
		view.getSurname().setVisible(false);
		view.getBtnSend().setVisible(false);
		view.getTextField_name().setVisible(false);
		view.getTextField_surname().setVisible(false);
	}


	/**
	 * Método para probar la conexión con el MySQL del Fedora
	 */
	public void connectionTest() {
		asign.openConnection();
		asign.closeConnection();
		System.out.println("Conexión y desconexión OK");
	}
}

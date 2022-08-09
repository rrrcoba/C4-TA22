package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
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

		} else if (view.getBtnDelete() == e.getSource()) {
			//TODO Acción Panel inicial botón Eliminar
			String id = JOptionPane.showInputDialog("Indica la ID proyecto de la asignación que deseas eliminar.");
			asign.openConnection();
			asign.deleteRecord(id);
			asign.closeConnection();

		} else if (view.getBtnSend() == e.getSource()) {


			this.cientifico = view.getTextField_sc().getText();
			this.proyecto = view.getTextField_pr().getText();

			asign.openConnection();
			asign.insertData(this.cientifico, this.proyecto);
			asign.closeConnection();

			
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
		view.getBtnDelete().setVisible(false);

		view.getLbl_sc().setVisible(true);
		view.getLbl_pr().setVisible(true);
		view.getBtnSend().setVisible(true);
		view.getTextField_sc().setVisible(true);
		view.getTextField_pr().setVisible(true);
	}
	
	/**
	 * Método que oculta los elementos del formulario y hace visibles los iniciales
	 */
	public void initializeFirstPanel () {
		view.getBtnCreate().setVisible(true);
		view.getBtnSelect().setVisible(true);
		view.getBtnDelete().setVisible(true);

		view.getLbl_sc().setVisible(false);
		view.getLbl_pr().setVisible(false);
		view.getBtnSend().setVisible(false);
		view.getTextField_sc().setVisible(false);
		view.getTextField_pr().setVisible(false);
	}
}

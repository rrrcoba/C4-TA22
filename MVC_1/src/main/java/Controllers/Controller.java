package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JFrame;

import Models.Cliente;
import Views.View;

public class Controller implements ActionListener{
	
	// Variables
	private Cliente client;
	private View view;
	
	
	/**
	 * Constructor de controller
	 * 
	 * @param client
	 * @param view
	 */
	public Controller(Cliente client, View view) {
		this.client = client;
		this.view = view;
	}

	/**
	 * Inicializa la vista
	 */
	public void startView() {
		view.setTitle("Cliente");
		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		view.setVisible(true);
		view.setBounds(100, 100, 437, 347);
		
		// Ponemos las acciones a cada botón
		view.getBtnCreate().addActionListener(this);
		view.getBtnSelect().addActionListener(this);
		view.getBtnUpdate().addActionListener(this);
		view.getBtnDelete().addActionListener(this);
	}

	/**
	 * Acción...
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (view.getBtnCreate() == e.getSource()) {
			initializeForm();
			
			
			// Pruebas de conexión
			//connectionTest();
			
		} else if (view.getBtnSelect() == e.getSource()) {
			//TODO Acción Panel inicial botón Seleccionar
			
		} else if (view.getBtnUpdate() == e.getSource()) {
			//TODO Acción Panel inicial botón Actualizar
			
		} else if (view.getBtnDelete() == e.getSource()) {
			//TODO Acción Panel inicial botón Eliminar
			
		} else if (view.getBtnSend() == e.getSource()) {
			//TODO Acción Panel formulario botón Enviar
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
		view.getDirection().setVisible(true);
		view.getDni().setVisible(true);
		view.getBtnSend().setVisible(true);
		view.getTextField_name().setVisible(true);
		view.getTextField_surname().setVisible(true);
		view.getTextField_direction().setVisible(true);
		view.getTextField_dni().setVisible(true);
		
		
	}
	
	
	/**
	 * Método para probar la conexión con el MySQL del Fedora
	 */
	public void connectionTest() {
		client.openConnection();
		client.closeConnection();
		System.out.println("Conexión y desconexión OK");
	}
}
package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Models.Cliente;
import Views.View;

public class Controller implements ActionListener{

	// Variables
	private Cliente client;
	private View view;

	private String name;
	private String surname;
	private String direction;
	private int dni;
	private String date;


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

		} else if (view.getBtnUpdate() == e.getSource()) {
			initializeForm();
			view.getLabelTitle().setText("Actualizar Datos");

		} else if (view.getBtnDelete() == e.getSource()) {
			//TODO Acción Panel inicial botón Eliminar

		} else if (view.getBtnSend() == e.getSource()) {
			if(view.getLabelTitle().getText().compareTo("Actualizar Datos") == 0) {
				int id = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es el ID del registro que quieres cambiar?"));
				
				this.name = view.getTextField_name().getText();
				this.surname = view.getTextField_surname().getText();
				this.direction = view.getTextField_direction().getText();
				this.dni = Integer.parseInt(view.getTextField_dni().getText());
				this.date = view.getTextField_date().getText();
				
				client.openConnection();
				client.updateData(id, name, surname, direction, dni, date);
				client.closeConnection();
				
			} else {
				this.name = view.getTextField_name().getText();
				this.surname = view.getTextField_surname().getText();
				this.direction = view.getTextField_direction().getText();
				this.dni = Integer.parseInt(view.getTextField_dni().getText());
				this.date = view.getTextField_date().getText();

				client.openConnection();
				client.insertData(this.name, this.surname, this.direction, this.dni, this.date);
				client.closeConnection();
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
		view.getDirection().setVisible(true);
		view.getDni().setVisible(true);
		view.getDate().setVisible(true);
		view.getBtnSend().setVisible(true);
		view.getTextField_name().setVisible(true);
		view.getTextField_surname().setVisible(true);
		view.getTextField_direction().setVisible(true);
		view.getTextField_dni().setVisible(true);
		view.getTextField_date().setVisible(true);
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
		view.getDirection().setVisible(false);
		view.getDni().setVisible(false);
		view.getDate().setVisible(false);
		view.getBtnSend().setVisible(false);
		view.getTextField_name().setVisible(false);
		view.getTextField_surname().setVisible(false);
		view.getTextField_direction().setVisible(false);
		view.getTextField_dni().setVisible(false);
		view.getTextField_date().setVisible(false);
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
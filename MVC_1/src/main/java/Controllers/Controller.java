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
			//TODO acción del botón create
			
//			view.getContentPaneForm().setVisible(true);
//			view.getContentPane().setVisible(false);
		} else if (view.getBtnSelect() == e.getSource()) {
			//TODO
		} else if (view.getBtnUpdate() == e.getSource()) {
			//TODO
		} else if (view.getBtnDelete() == e.getSource()) {
			//TODO
		}
		
		System.out.println("Accion del botón OK");
		
	}
	
	public void initializeContentPaneForm () {
		
	}
	
	/**
	 * Transmite el nombre hacia la vista
	 * 
	 * @param name
	 */
	public void showName(String name) {
		
	}

	/**
	 * Transmite el apellido hacia la vista
	 * 
	 * @param surname
	 */
	public void showSurname(String surname) {
		
	}
	
	/**
	 * Transmite la dirección hacia la vista
	 * 
	 * @param direction
	 */
	public void showDirection(String direction) {
		
	}
	
	/**
	 * Transmite el dni hacia la vista
	 * 
	 * @param dni
	 */
	public void showDni(int dni) {
		
	}
	
	/**
	 * Transmite la fecha hacia la vista
	 * 
	 * @param date
	 */
	public void showDate(Date date) {
		
	}
}
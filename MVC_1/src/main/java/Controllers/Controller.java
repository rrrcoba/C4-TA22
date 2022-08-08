package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import Models.Cliente;
import Views.View;

public class Controller implements ActionListener{
	
	// IMPORTANTE
	// Recordad cambiar estoo
	final static String user = "remote";
	final static String pass = "abcd1234";
	final static String ip = "jdbc:mysql://192.168.1.31:3306?useTimezone=true&serverTimezone=UTC";

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
	}

	/**
	 * Acción...
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
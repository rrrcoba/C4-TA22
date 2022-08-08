package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Models.Videos;
import Views.ViewVideo;

public class ControllerVideos implements ActionListener{

	// Variables
	private Videos videos;
	private ViewVideo viewVideo;

	private int id;
	private String title;
	private String director;
	private int cli_id;


	/**
	 * Constructor de controller
	 * 
	 * @param client
	 * @param view
	 */
	public ControllerVideos(Videos videos, ViewVideo viewVideo) {
		this.videos = videos;
		this.viewVideo = viewVideo;
	}

	/**
	 * Inicializa la vista
	 */
	public void startView() {
		//viewVideo.setTitle("Videos");
		//viewVideo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//viewVideo.setVisible(true);
		//viewVideo.setBounds(100, 100, 437, 347);

		// Ponemos las acciones a cada botón
		//viewVideo.getBtnCreate().addActionListener(this);
		//viewVideo.getBtnSelect().addActionListener(this);
		//viewVideo.getBtnUpdate().addActionListener(this);
		//viewVideo.getBtnDelete().addActionListener(this);
		//viewVideo.getBtnSend().addActionListener(this);
	}

	/**
	 * Acción...
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (viewVideo.getBtnCreate() == e.getSource()) {
			//TODO
			initializeForm();
			viewVideo.getLabelTitle().setText("Crear Datos");			

		} else if (viewVideo.getBtnSelect() == e.getSource()) {
			//TODO Acción Panel inicial botón Seleccionar
			
			ResultSet r = null;
			videos.openConnection();
			r = videos.getValues();
			
			try {
				while(r.next()) {
					System.out.println("Id: " + r.getString("id"));
					System.out.println("Title: " + r.getString("title"));
					System.out.println("Director: " + r.getString("director"));
					System.out.println("Cli_id: " + r.getString("cli_id"));
				}
			} catch (SQLException ex) {
				System.out.println(ex);
			}

			videos.closeConnection();

		} else if (viewVideo.getBtnUpdate() == e.getSource()) {
			initializeForm();
			viewVideo.getLabelTitle().setText("Actualizar Datos");

		} else if (viewVideo.getBtnDelete() == e.getSource()) {
			//TODO Acción Panel inicial botón Eliminar
			String id = JOptionPane.showInputDialog("Indica la ID del registro que quieres eliminar.");
			videos.openConnection();
			videos.deleteRecord(id);
			videos.closeConnection();

		} else if (viewVideo.getBtnSend() == e.getSource()) {
			if(viewVideo.getLabelTitle().getText().compareTo("Actualizar Datos") == 0) {
				int id = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es el ID del registro que quieres cambiar?"));
				
				this.title = viewVideo.getTextField_Title().getText();
				this.director = viewVideo.getTextField_Director().getText();
				this.cli_id = Integer.parseInt(viewVideo.getTextField_cli_id().getText());
				
				videos.openConnection();
				videos.updateData(id, this.title, this.director, this.cli_id);
				videos.closeConnection();
				
			} else {
				this.title = viewVideo.getTextField_Title().getText();
				this.director = viewVideo.getTextField_Director().getText();
				this.cli_id = Integer.parseInt(viewVideo.getTextField_cli_id().getText());

				videos.openConnection();
				videos.insertData(id, this.title, this.director, this.cli_id);
				videos.closeConnection();
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
		viewVideo.getBtnCreate().setVisible(false);
		viewVideo.getBtnSelect().setVisible(false);
		viewVideo.getBtnUpdate().setVisible(false);
		viewVideo.getBtnDelete().setVisible(false);
		viewVideo.getLblMsg().setVisible(false);

		viewVideo.getLabelTitle().setVisible(true);
		viewVideo.getLblTitle().setVisible(true);
		viewVideo.getDirector().setVisible(true);
		viewVideo.getCli_id.setVisible(true);
		viewVideo.getBtnSend().setVisible(true);
		viewVideo.getTextField_title().setVisible(true);
		viewVideo.getTextField_director().setVisible(true);
		viewVideo.getTextField_cli_id.setVisible(true);
	}
	
	/**
	 * Método que oculta los elementos del formulario y hace visibles los iniciales
	 */
	public void initializeFirstPanel () {
		viewVideo.getBtnCreate().setVisible(true);
		viewVideo.getBtnSelect().setVisible(true);
		viewVideo.getBtnUpdate().setVisible(true);
		viewVideo.getBtnDelete().setVisible(true);
		viewVideo.getLblMsg().setVisible(true);

		viewVideo.getLabelTitle().setVisible(false);
		viewVideo.getLabelName().setVisible(false);
		viewVideo.getSurname().setVisible(false);
		viewVideo.getDirection().setVisible(false);
		viewVideo.getDni().setVisible(false);
		viewVideo.getDate().setVisible(false);
		viewVideo.getBtnSend().setVisible(false);
		viewVideo.getTextField_name().setVisible(false);
		viewVideo.getTextField_surname().setVisible(false);
		viewVideo.getTextField_direction().setVisible(false);
		viewVideo.getTextField_dni().setVisible(false);
		viewVideo.getTextField_date().setVisible(false);
	}


	/**
	 * Método para probar la conexión con el MySQL del Fedora
	 */
	public void connectionTest() {
		videos.openConnection();
		videos.closeConnection();
		System.out.println("Conexión y desconexión OK");
	}
}
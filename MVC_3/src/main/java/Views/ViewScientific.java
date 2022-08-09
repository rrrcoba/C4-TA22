package Views;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class ViewScientific extends JFrame {
	
	private static final long serialVersionUID = 3L;

	private JPanel contentPane;

	/* Elementos del panel inicial*/
	private JButton btnCreate;
	private JButton btnUpdate;
	private JButton btnSelect;
	private JButton btnDelete;

	private JLabel lblMsg;
	private JTextField textField_dni;
	private JTextField textField_NameSurnames;

	private JLabel lbl_NameSurnames;
	private JLabel lbl_dni;

	private JButton btnSend;
	
	/**
	 * Constructor
	 */
	public ViewScientific () {
		// Panel inicial con sus elementos
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setVisible(true);
		contentPane.setLayout(null);
		
		initialPaneElements();
		initialFormElements();
	}
	
	/**
	 * Inicializa los elementos del panel inicial
	 */
	public void initialPaneElements() {
		btnCreate = new JButton("Crear");
		btnCreate.setBounds(145, 123, 118, 23);
		btnCreate.setVisible(true);
		contentPane.add(btnCreate);
		
		btnUpdate = new JButton("Actualizar");
		btnUpdate.setBounds(145, 161, 118, 23);
		btnUpdate.setVisible(true);
		contentPane.add(btnUpdate);
		
		btnSelect = new JButton("Consultar");
		btnSelect.setBounds(145, 195, 118, 23);
		btnSelect.setVisible(true);
		contentPane.add(btnSelect);
		
		btnDelete = new JButton("Eliminar");
		btnDelete.setBounds(145, 229, 118, 23);
		btnDelete.setVisible(true);
		contentPane.add(btnDelete);
		
		lblMsg = new JLabel("Porfavor, indica lo que deseas hacer:");
		lblMsg.setHorizontalAlignment(SwingConstants.CENTER);
		lblMsg.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMsg.setBounds(39, 40, 349, 32);
		lblMsg.setVisible(true);
		contentPane.add(lblMsg);
	}
	
	/**
	 * Inicializa los elementos del formulario
	 */
	public void initialFormElements () {
		lbl_dni = new JLabel("DNI:");
		lbl_dni.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl_dni.setBounds(24, 121, 101, 23);
		lbl_dni.setVisible(false);
		contentPane.add(lbl_dni);
		
		lbl_NameSurnames = new JLabel("Nombre y apellidos:");
		lbl_NameSurnames.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl_NameSurnames.setBounds(24, 154, 170, 33);
		lbl_NameSurnames.setVisible(false);
		contentPane.add(lbl_NameSurnames);
		
		textField_dni = new JTextField();
		textField_dni.setBounds(226, 124, 125, 20);
		textField_dni.setColumns(10);
		textField_dni.setVisible(false);
		contentPane.add(textField_dni);
		
		textField_NameSurnames = new JTextField();
		textField_NameSurnames.setBounds(236, 162, 115, 20);
		textField_NameSurnames.setColumns(10);
		textField_NameSurnames.setVisible(false);
		contentPane.add(textField_NameSurnames);
		
		btnSend = new JButton("Enviar");
		btnSend.setVisible(false);
		btnSend.setBounds(155, 212, 89, 23);
		contentPane.add(btnSend);
	}
}

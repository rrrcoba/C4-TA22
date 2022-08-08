package Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class View extends JFrame {

	private JPanel contentPane;
	
	/* Botones*/
	private JButton btnCreate;
	private JButton btnUpdate;
	private JButton btnSelect;
	private JButton btnDelete;

	private JLabel lblMsg;

	private JTextField textField_name;
	private JTextField textField_surname;
	private JTextField textField_direction;
	private JTextField textField_dni;

	

	/**
	 *	Creamos el marco.
	 */
	public View() {
		// Panel inicial
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setVisible(true);
		contentPane.setLayout(null);
		
		btnCreate = new JButton("Crear");
		btnCreate.setBounds(145, 123, 118, 23);
		contentPane.add(btnCreate);
		
		btnUpdate = new JButton("Actualizar");
		btnUpdate.setBounds(145, 161, 118, 23);
		contentPane.add(btnUpdate);
		
		btnSelect = new JButton("Consultar");
		btnSelect.setBounds(145, 195, 118, 23);
		contentPane.add(btnSelect);
		
		btnDelete = new JButton("Eliminar");
		btnDelete.setBounds(145, 229, 118, 23);
		contentPane.add(btnDelete);
		
		lblMsg = new JLabel("Porfavor, indica lo que deseas hacer:");
		lblMsg.setHorizontalAlignment(SwingConstants.CENTER);
		lblMsg.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMsg.setBounds(31, 47, 349, 32);
		contentPane.add(lblMsg);
		
		
//		// Formulario sin contentPaneForm
//		textField_name = new JTextField();
//		textField_name.setVisible(false);
//		textField_name.setBounds(112, 48, 135, 20);
//		contentPane.add(textField_name);
//		textField_name.setColumns(10);
//		
//		textField_surname = new JTextField();
//		textField_surname.setVisible(false);
//		textField_surname.setColumns(10);
//		textField_surname.setBounds(112, 82, 135, 20);
//		contentPane.add(textField_surname);
//		
//		textField_direction = new JTextField();
//		textField_direction.setVisible(false);
//		textField_direction.setColumns(10);
//		textField_direction.setBounds(112, 113, 135, 20);
//		contentPane.add(textField_direction);
//		
//		textField_dni = new JTextField();
//		textField_dni.setVisible(false);
//		textField_dni.setColumns(10);
//		textField_dni.setBounds(112, 150, 135, 20);
//		contentPane.add(textField_dni);		
		
			
		
//		// ContentPaneForm and buttons
//		JPanel contentPaneForm = new JPanel();
//		contentPaneForm.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setContentPane(contentPaneForm);
//		contentPaneForm.setLayout(null);
//		contentPaneForm.setVisible(false);
//		
//		JLabel name = new JLabel("Nombre:");
//		name.setFont(new Font("Tahoma", Font.PLAIN, 14));
//		name.setBounds(46, 45, 79, 23);
//		contentPaneForm.add(name);
//		
//		JLabel surname = new JLabel("Apellido:");
//		surname.setFont(new Font("Tahoma", Font.PLAIN, 14));
//		surname.setBounds(46, 79, 79, 23);
//		contentPaneForm.add(surname);
//		
//		JLabel direction = new JLabel("Dirección:");
//		direction.setFont(new Font("Tahoma", Font.PLAIN, 14));
//		direction.setBounds(46, 113, 79, 23);
//		contentPaneForm.add(direction);
//		
//		JLabel dni = new JLabel("DNI:");
//		dni.setFont(new Font("Tahoma", Font.PLAIN, 14));
//		dni.setBounds(46, 147, 61, 23);
//		contentPaneForm.add(dni);
//		
//		textField_name = new JTextField();
//		textField_name.setBounds(112, 48, 135, 20);
//		contentPaneForm.add(textField_name);
//		textField_name.setColumns(10);
//		
//		textField_surname = new JTextField();
//		textField_surname.setColumns(10);
//		textField_surname.setBounds(112, 82, 135, 20);
//		contentPaneForm.add(textField_surname);
//		
//		textField_direction = new JTextField();
//		textField_direction.setColumns(10);
//		textField_direction.setBounds(112, 113, 135, 20);
//		contentPaneForm.add(textField_direction);
//		
//		textField_dni = new JTextField();
//		textField_dni.setColumns(10);
//		textField_dni.setBounds(112, 150, 135, 20);
//		contentPaneForm.add(textField_dni);
//		
//		JLabel title = new JLabel("Crear Datos");
//		title.setHorizontalAlignment(SwingConstants.CENTER);
//		title.setFont(new Font("Tahoma", Font.PLAIN, 18));
//		title.setBounds(162, 11, 160, 23);
//		contentPaneForm.add(title);
//		
//		JButton send = new JButton("Enviar");
//		send = new JButton("Enviar");
//		send.setBounds(122, 181, 89, 23);
//		contentPaneForm.add(send);
	}

	/**
	 * @return the btnCreate
	 */
	public JButton getBtnCreate() {
		return btnCreate;
	}

	/**
	 * @param btnCreate the btnCreate to set
	 */
	public void setBtnCreate(JButton btnCreate) {
		this.btnCreate = btnCreate;
	}

	/**
	 * @return the btnUpdate
	 */
	public JButton getBtnUpdate() {
		return btnUpdate;
	}

	/**
	 * @param btnUpdate the btnUpdate to set
	 */
	public void setBtnUpdate(JButton btnUpdate) {
		this.btnUpdate = btnUpdate;
	}

	/**
	 * @return the btnSelect
	 */
	public JButton getBtnSelect() {
		return btnSelect;
	}

	/**
	 * @param btnSelect the btnSelect to set
	 */
	public void setBtnSelect(JButton btnSelect) {
		this.btnSelect = btnSelect;
	}

	/**
	 * @return the btnDelete
	 */
	public JButton getBtnDelete() {
		return btnDelete;
	}

	/**
	 * @param btnDelete the btnDelete to set
	 */
	public void setBtnDelete(JButton btnDelete) {
		this.btnDelete = btnDelete;
	}

	/**
	 * @return the lblMsg
	 */
	public JLabel getLblMsg() {
		return lblMsg;
	}

	/**
	 * @param lblMsg the lblMsg to set
	 */
	public void setLblMsg(JLabel lblMsg) {
		this.lblMsg = lblMsg;
	}
}

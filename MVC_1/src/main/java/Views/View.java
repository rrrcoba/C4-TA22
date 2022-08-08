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
	
	/* Elementos del panel inicial*/
	private JButton btnCreate;
	private JButton btnUpdate;
	private JButton btnSelect;
	private JButton btnDelete;

	private JLabel lblMsg;

	
	/* Elementos del panel del formulario */
	private JTextField textField_name;
	private JTextField textField_surname;
	private JTextField textField_direction;
	private JTextField textField_dni;

	private JLabel labelTitle;
	private JButton btnSend;
	private JLabel labelName;
	private JLabel surname;
	private JLabel direction;
	private JLabel dni;

	

	/**
	 *	Creamos el marco.
	 */
	public View() {
		// Panel inicial con sus elementos
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
		
		
		
		/* Formulario sin contentPaneForm */
		//TODO poner campos fecha
		textField_name = new JTextField();
		textField_name.setVisible(false);
		textField_name.setColumns(10);
		textField_name.setBounds(112, 48, 135, 20);
		contentPane.add(textField_name);
		
		textField_surname = new JTextField();
		textField_surname.setVisible(false);
		textField_surname.setColumns(10);
		textField_surname.setBounds(112, 82, 135, 20);
		contentPane.add(textField_surname);
		
		textField_direction = new JTextField();
		textField_direction.setVisible(false);
		textField_direction.setColumns(10);
		textField_direction.setBounds(112, 113, 135, 20);
		contentPane.add(textField_direction);
		
		textField_dni = new JTextField();
		textField_dni.setVisible(false);
		textField_dni.setColumns(10);
		textField_dni.setBounds(112, 150, 135, 20);
		contentPane.add(textField_dni);		
		
		btnSend = new JButton("Enviar");
		btnSend.setVisible(false);
		btnSend.setBounds(122, 181, 89, 23);
		contentPane.add(btnSend);
		
		labelTitle = new JLabel("Crear Datos");
		labelTitle.setVisible(false);
		labelTitle.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitle.setFont(new Font("Tahoma", Font.PLAIN, 18));
		labelTitle.setBounds(162, 11, 160, 23);
		contentPane.add(labelTitle);
		
		labelName = new JLabel("Nombre:");
		labelName.setVisible(false);
		labelName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelName.setBounds(46, 45, 79, 23);
		contentPane.add(labelName);
		
		surname = new JLabel("Apellido:");
		surname.setVisible(false);
		surname.setFont(new Font("Tahoma", Font.PLAIN, 14));
		surname.setBounds(46, 79, 79, 23);
		contentPane.add(surname);
		
		direction = new JLabel("Dirección:");
		direction.setVisible(false);
		direction.setFont(new Font("Tahoma", Font.PLAIN, 14));
		direction.setBounds(46, 113, 79, 23);
		contentPane.add(direction);
		
		dni = new JLabel("DNI:");
		dni.setVisible(false);
		dni.setFont(new Font("Tahoma", Font.PLAIN, 14));
		dni.setBounds(46, 147, 61, 23);
		contentPane.add(dni);

			
		
//		/* ContentPaneForm and buttons */
//		JPanel contentPaneForm = new JPanel();
//		contentPaneForm.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setContentPane(contentPaneForm);
//		contentPaneForm.setLayout(null);
//		contentPaneForm.setVisible(false);
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
//		btnSend = new JButton("Enviar");
//		btnSend.setBounds(122, 181, 89, 23);
//		contentPaneForm.add(btnSend);
//		
//		labelTitle = new JLabel("Crear Datos");
//		labelTitle.setHorizontalAlignment(SwingConstants.CENTER);
//		labelTitle.setFont(new Font("Tahoma", Font.PLAIN, 18));
//		labelTitle.setBounds(162, 11, 160, 23);
//		contentPaneForm.add(labelTitle);
//		
//		labelName = new JLabel("Nombre:");
//		labelName.setFont(new Font("Tahoma", Font.PLAIN, 14));
//		labelName.setBounds(46, 45, 79, 23);
//		contentPaneForm.add(labelName);
//		
//		surname = new JLabel("Apellido:");
//		surname.setFont(new Font("Tahoma", Font.PLAIN, 14));
//		surname.setBounds(46, 79, 79, 23);
//		contentPaneForm.add(surname);
//		
//		direction = new JLabel("Dirección:");
//		direction.setFont(new Font("Tahoma", Font.PLAIN, 14));
//		direction.setBounds(46, 113, 79, 23);
//		contentPaneForm.add(direction);
//		
//		dni = new JLabel("DNI:");
//		dni.setFont(new Font("Tahoma", Font.PLAIN, 14));
//		dni.setBounds(46, 147, 61, 23);
//		contentPaneForm.add(dni);
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

	/**
	 * @return the textField_name
	 */
	public JTextField getTextField_name() {
		return textField_name;
	}

	/**
	 * @param textField_name the textField_name to set
	 */
	public void setTextField_name(JTextField textField_name) {
		this.textField_name = textField_name;
	}

	/**
	 * @return the textField_surname
	 */
	public JTextField getTextField_surname() {
		return textField_surname;
	}

	/**
	 * @param textField_surname the textField_surname to set
	 */
	public void setTextField_surname(JTextField textField_surname) {
		this.textField_surname = textField_surname;
	}

	/**
	 * @return the textField_direction
	 */
	public JTextField getTextField_direction() {
		return textField_direction;
	}

	/**
	 * @param textField_direction the textField_direction to set
	 */
	public void setTextField_direction(JTextField textField_direction) {
		this.textField_direction = textField_direction;
	}

	/**
	 * @return the textField_dni
	 */
	public JTextField getTextField_dni() {
		return textField_dni;
	}

	/**
	 * @param textField_dni the textField_dni to set
	 */
	public void setTextField_dni(JTextField textField_dni) {
		this.textField_dni = textField_dni;
	}

	/**
	 * @return the title
	 */
	public JLabel getLabelTitle() {
		return this.labelTitle;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(JLabel title) {
		this.labelTitle = title;
	}

	/**
	 * @return the btnSend
	 */
	public JButton getBtnSend() {
		return btnSend;
	}

	/**
	 * @param btnSend the button Send to set
	 */
	public void setBtnSend(JButton btnSend) {
		this.btnSend = btnSend;
	}

	/**
	 * @return the name
	 */
	public JLabel getLabelName() {
		return this.labelName;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(JLabel name) {
		this.labelName = name;
	}

	/**
	 * @return the surname
	 */
	public JLabel getSurname() {
		return surname;
	}

	/**
	 * @param surname the surname to set
	 */
	public void setSurname(JLabel surname) {
		this.surname = surname;
	}

	/**
	 * @return the direction
	 */
	public JLabel getDirection() {
		return direction;
	}

	/**
	 * @param direction the direction to set
	 */
	public void setDirection(JLabel direction) {
		this.direction = direction;
	}

	/**
	 * @return the dni
	 */
	public JLabel getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(JLabel dni) {
		this.dni = dni;
	}
}

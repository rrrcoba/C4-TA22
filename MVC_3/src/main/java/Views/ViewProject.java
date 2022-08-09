package Views;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class ViewProject extends JFrame {

	private static final long serialVersionUID = 2L;

	private JPanel contentPane;

	/* Elementos del panel inicial*/
	private JButton btnCreate;
	private JButton btnUpdate;
	private JButton btnSelect;
	private JButton btnDelete;

	private JLabel lblMsg;
	private JTextField textField_name;
	private JTextField textField_hours;

	private JButton btnSend;
	private JLabel lbl_name;
	private JLabel lbl_hours;
	
	/**
	 * Constructor
	 */
	public ViewProject () {
		// Panel inicial con sus elementos
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setVisible(true);
		contentPane.setLayout(null);
		
		initialPaneElements();
		initialFormPaneElements();
	}
	
	/**
	 * Inicializa el panel de elementos iniciales
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
	 * Inicializa los elementos del panel del formulario
	 */
	public void initialFormPaneElements() {
		lbl_hours = new JLabel("Horas:");
		lbl_hours.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl_hours.setBounds(61, 169, 87, 38);
		lbl_hours.setVisible(false);
		contentPane.add(lbl_hours);
		
		lbl_name = new JLabel("Nombre:");
		lbl_name.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl_name.setBounds(61, 123, 74, 32);
		lbl_name.setVisible(false);
		contentPane.add(lbl_name);
		
		textField_name = new JTextField();
		textField_name.setBounds(145, 130, 138, 20);
		textField_name.setColumns(10);
		textField_name.setVisible(false);
		contentPane.add(textField_name);
		
		textField_hours = new JTextField();
		textField_hours.setBounds(145, 180, 138, 20);
		textField_hours.setColumns(10);
		textField_hours.setVisible(false);
		contentPane.add(textField_hours);

		btnSend = new JButton("Enviar");
		btnSend.setVisible(false);
		btnSend.setBounds(122, 211, 89, 23);
		contentPane.add(btnSend);
	}

	public JButton getBtnCreate() {
		return btnCreate;
	}

	public void setBtnCreate(JButton btnCreate) {
		this.btnCreate = btnCreate;
	}

	public JButton getBtnUpdate() {
		return btnUpdate;
	}

	public void setBtnUpdate(JButton btnUpdate) {
		this.btnUpdate = btnUpdate;
	}

	public JButton getBtnSelect() {
		return btnSelect;
	}

	public void setBtnSelect(JButton btnSelect) {
		this.btnSelect = btnSelect;
	}

	public JButton getBtnDelete() {
		return btnDelete;
	}

	public void setBtnDelete(JButton btnDelete) {
		this.btnDelete = btnDelete;
	}

	public JLabel getLblMsg() {
		return lblMsg;
	}

	public void setLblMsg(JLabel lblMsg) {
		this.lblMsg = lblMsg;
	}

	public JTextField getTextField_name() {
		return textField_name;
	}

	public void setTextField_name(JTextField textField_name) {
		this.textField_name = textField_name;
	}

	public JTextField getTextField_hours() {
		return textField_hours;
	}

	public void setTextField_hours(JTextField textField_hours) {
		this.textField_hours = textField_hours;
	}

	public JButton getBtnSend() {
		return btnSend;
	}

	public void setBtnSend(JButton btnSend) {
		this.btnSend = btnSend;
	}

	public JLabel getLbl_name() {
		return lbl_name;
	}

	public void setLbl_name(JLabel lbl_name) {
		this.lbl_name = lbl_name;
	}

	public JLabel getLbl_hours() {
		return lbl_hours;
	}

	public void setLbl_hours(JLabel lbl_hours) {
		this.lbl_hours = lbl_hours;
	}
	
	
}

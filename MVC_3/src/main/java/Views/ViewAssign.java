package Views;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class ViewAssign extends JFrame{
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	/* Elementos del panel inicial*/
	private JButton btnCreate;
	private JButton btnUpdate;
	private JButton btnSelect;
	private JButton btnDelete;

	private JLabel lblMsg;
	private JLabel lbl_sc;
	private JLabel lbl_pr;
	private JTextField textField_sc;
	private JTextField textField_pr;

	private JButton btnSend;
	
	/**
	 * Constructor
	 */
	public ViewAssign () {
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
	 * 
	 */
	public void initialFormPaneElements () {
		lbl_sc = new JLabel("DNI Científico:");
		lbl_sc.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl_sc.setBounds(31, 127, 144, 32);
		lbl_sc.setVisible(false);
		contentPane.add(lbl_sc);
		
		lbl_pr = new JLabel("ID Proyecto:");
		lbl_pr.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl_pr.setBounds(31, 170, 144, 32);
		lbl_pr.setVisible(false);
		contentPane.add(lbl_pr);
		
		textField_sc = new JTextField();
		textField_sc.setBounds(143, 135, 120, 20);
		textField_sc.setColumns(10);
		textField_sc.setVisible(false);
		contentPane.add(textField_sc);	
		
		textField_pr = new JTextField();
		textField_pr.setColumns(10);
		textField_pr.setBounds(145, 178, 120, 20);
		textField_pr.setVisible(false);
		contentPane.add(textField_pr);
		
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

	public JLabel getLbl_sc() {
		return lbl_sc;
	}

	public void setLbl_sc(JLabel lbl_sc) {
		this.lbl_sc = lbl_sc;
	}

	public JLabel getLbl_pr() {
		return lbl_pr;
	}

	public void setLbl_pr(JLabel lbl_pr) {
		this.lbl_pr = lbl_pr;
	}

	public JTextField getTextField_sc() {
		return textField_sc;
	}

	public void setTextField_sc(JTextField textField_sc) {
		this.textField_sc = textField_sc;
	}

	public JTextField getTextField_pr() {
		return textField_pr;
	}

	public void setTextField_pr(JTextField textField_pr) {
		this.textField_pr = textField_pr;
	}

	public JButton getBtnSend() {
		return btnSend;
	}

	public void setBtnSend(JButton btnSend) {
		this.btnSend = btnSend;
	}
}

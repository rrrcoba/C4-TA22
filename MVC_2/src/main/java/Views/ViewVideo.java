package Views;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ViewVideo extends JFrame {

	private static final long serialVersionUID = 2L;

	private JPanel contentPane;

	/* Elementos del panel inicial*/
	private JButton btnCreate;
	private JButton btnUpdate;
	private JButton btnSelect;
	private JButton btnDelete;

	private JLabel lblMsg;


	/* Elementos del panel del formulario */
	private JTextField textField_title;
	private JTextField textField_director;
	private JTextField textField_cli;
	
	private JLabel labelTitle;
	private JButton btnSend;
	private JLabel labelTitleM;
	private JLabel director;
	private JLabel cli;

	



	/**
	 *	Creamos el marco.
	 */
	public ViewVideo() {
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
		textField_title = new JTextField();
		textField_title.setVisible(false);
		textField_title.setColumns(10);
		textField_title.setBounds(112, 48, 135, 20);
		contentPane.add(textField_title);

		textField_director = new JTextField();
		textField_director.setVisible(false);
		textField_director.setColumns(10);
		textField_director.setBounds(112, 82, 135, 20);
		contentPane.add(textField_director);
		
		textField_cli = new JTextField();
		textField_cli.setVisible(false);
		textField_cli.setColumns(10);
		textField_cli.setBounds(112, 120, 135, 20);
		contentPane.add(textField_cli);

		btnSend = new JButton("Enviar");
		btnSend.setVisible(false);
		btnSend.setBounds(122, 211, 89, 23);
		contentPane.add(btnSend);

		labelTitle = new JLabel("");
		labelTitle.setVisible(false);
		labelTitle.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitle.setFont(new Font("Tahoma", Font.PLAIN, 18));
		labelTitle.setBounds(145, 11, 160, 23);
		contentPane.add(labelTitle);

		labelTitleM = new JLabel("Título:");
		labelTitleM.setVisible(false);
		labelTitleM.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelTitleM.setBounds(46, 45, 79, 23);
		contentPane.add(labelTitleM);

		director = new JLabel("Director:");
		director.setVisible(false);
		director.setFont(new Font("Tahoma", Font.PLAIN, 14));
		director.setBounds(46, 79, 79, 23);
		contentPane.add(director);
		
		cli = new JLabel("ID Cliente:");
		cli.setVisible(false);
		cli.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cli.setBounds(46, 110, 79, 23);
		contentPane.add(cli);

	}


	/**
	 * 
	 */
	public JPanel getContentPane() {
		return contentPane;
	}


	/**
	 * 
	 * @param contentPane
	 */
	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}


	/**
	 * 
	 * @return
	 */
	public JButton getBtnCreate() {
		return btnCreate;
	}


	/**
	 * 
	 * @param btnCreate
	 */
	public void setBtnCreate(JButton btnCreate) {
		this.btnCreate = btnCreate;
	}


	/**
	 * 
	 * @return
	 */
	public JButton getBtnUpdate() {
		return btnUpdate;
	}


	/**
	 * 
	 * @param btnUpdate
	 */
	public void setBtnUpdate(JButton btnUpdate) {
		this.btnUpdate = btnUpdate;
	}


	/**
	 * 
	 * @return
	 */
	public JButton getBtnSelect() {
		return btnSelect;
	}


	/**
	 * 
	 * @param btnSelect
	 */
	public void setBtnSelect(JButton btnSelect) {
		this.btnSelect = btnSelect;
	}


	/**
	 * 
	 * @return
	 */
	public JButton getBtnDelete() {
		return btnDelete;
	}


	/**
	 * 
	 * @param btnDelete
	 */
	public void setBtnDelete(JButton btnDelete) {
		this.btnDelete = btnDelete;
	}


	/**
	 * 
	 * @return
	 */
	public JLabel getLblMsg() {
		return lblMsg;
	}


	/**
	 * 
	 * @param lblMsg
	 */
	public void setLblMsg(JLabel lblMsg) {
		this.lblMsg = lblMsg;
	}


	/**
	 * 
	 * @return
	 */
	public JTextField getTextField_title() {
		return textField_title;
	}


	/**
	 * 
	 * @param textField_title
	 */
	public void setTextField_title(JTextField textField_title) {
		this.textField_title = textField_title;
	}


	/**
	 * 
	 * @return
	 */
	public JTextField getTextField_director() {
		return textField_director;
	}


	/**
	 * 
	 * @param textField_director
	 */
	public void setTextField_director(JTextField textField_director) {
		this.textField_director = textField_director;
	}


	/**
	 * 
	 * @return
	 */
	public JLabel getLabelTitle() {
		return labelTitle;
	}


	/**
	 * 
	 * @param labelTitle
	 */
	public void setLabelTitle(JLabel labelTitle) {
		this.labelTitle = labelTitle;
	}


	/**
	 * 
	 * @return
	 */
	public JButton getBtnSend() {
		return btnSend;
	}


	/**
	 * 
	 * @param btnSend
	 */
	public void setBtnSend(JButton btnSend) {
		this.btnSend = btnSend;
	}


	/**
	 * 
	 * @return
	 */
	public JLabel getLabelTitleM() {
		return labelTitleM;
	}


	/**
	 * 
	 * @param labelTitleM
	 */
	public void setLabelTitleM(JLabel labelTitleM) {
		this.labelTitleM = labelTitleM;
	}


	/**
	 * 
	 * @return
	 */
	public JLabel getDirector() {
		return director;
	}


	/**
	 * 
	 * @param director
	 */
	public void setDirector(JLabel director) {
		this.director = director;
	}


	/**
	 * @return the textField_cli
	 */
	public JTextField getTextField_cli() {
		return textField_cli;
	}


	/**
	 * @param textField_cli the textField_cli to set
	 */
	public void setTextField_cli(JTextField textField_cli) {
		this.textField_cli = textField_cli;
	}


	/**
	 * @return the cli
	 */
	public JLabel getCli() {
		return cli;
	}


	/**
	 * @param cli the cli to set
	 */
	public void setCli(JLabel cli) {
		this.cli = cli;
	}

}

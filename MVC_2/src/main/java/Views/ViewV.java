package main.java.Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ViewV extends JFrame {

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
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewV frame = new ViewV();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewV() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
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
		lblMsg.setBounds(31, 47, 349, 32);
		lblMsg.setHorizontalAlignment(SwingConstants.CENTER);
		lblMsg.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblMsg);

		/* Formulario sin contentPaneForm */
		textField_title = new JTextField();
		textField_title.setBounds(112, 48, 135, 20);
		textField_title.setVisible(false);
		textField_title.setColumns(10);
		contentPane.add(textField_title);

		textField_director = new JTextField();
		textField_director.setBounds(112, 82, 135, 20);
		textField_director.setVisible(false);
		textField_director.setColumns(10);
		contentPane.add(textField_director);
		
		textField_cli = new JTextField();
		textField_cli.setBounds(112, 113, 135, 20);
		textField_cli.setVisible(false);
		textField_cli.setColumns(10);
		contentPane.add(textField_cli);

		btnSend = new JButton("Enviar");
		btnSend.setBounds(122, 211, 89, 23);
		btnSend.setVisible(false);
		contentPane.add(btnSend);

		labelTitle = new JLabel("");
		labelTitle.setBounds(145, 11, 160, 23);
		labelTitle.setVisible(false);
		labelTitle.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitle.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(labelTitle);

		labelTitleM = new JLabel("Título:");
		labelTitleM.setBounds(46, 45, 79, 23);
		labelTitleM.setVisible(false);
		labelTitleM.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(labelTitleM);

		director = new JLabel("Director:");
		director.setBounds(41, 79, 79, 23);
		director.setVisible(false);
		director.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(director);
		
		cli = new JLabel("ID Cliente:");
		cli.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cli.setBounds(31, 106, 79, 30);
		cli.setVisible(false);
		contentPane.add(cli);
		
	}

	public JLabel getLblMsg() {
		return lblMsg;
	}

	public void setLblMsg(JLabel lblMsg) {
		this.lblMsg = lblMsg;
	}

	public JTextField getTextField_title() {
		return textField_title;
	}

	public void setTextField_title(JTextField textField_title) {
		this.textField_title = textField_title;
	}

	public JTextField getTextField_director() {
		return textField_director;
	}

	public void setTextField_director(JTextField textField_director) {
		this.textField_director = textField_director;
	}

	public JTextField getTextField_cli() {
		return textField_cli;
	}

	public void setTextField_cli(JTextField textField_cli) {
		this.textField_cli = textField_cli;
	}

	public JLabel getLabelTitle() {
		return labelTitle;
	}

	public void setLabelTitle(JLabel labelTitle) {
		this.labelTitle = labelTitle;
	}

	public JLabel getLabelTitleM() {
		return labelTitleM;
	}

	public void setLabelTitleM(JLabel labelTitleM) {
		this.labelTitleM = labelTitleM;
	}

	public JLabel getDirector() {
		return director;
	}

	public void setDirector(JLabel director) {
		this.director = director;
	}

	public JLabel getCli() {
		return cli;
	}

	public void setCli(JLabel cli) {
		this.cli = cli;
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

	public JButton getBtnSend() {
		return btnSend;
	}

	public void setBtnSend(JButton btnSend) {
		this.btnSend = btnSend;
	}
	
	

}



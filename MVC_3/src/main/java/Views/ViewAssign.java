package Views;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ViewAssign extends JFrame{
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	/* Elementos del panel inicial*/
	private JButton btnCreate;
	private JButton btnUpdate;
	private JButton btnSelect;
	private JButton btnDelete;

	private JLabel lblMsg;
	
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
	}
	
	/**
	 * Inicializa el panel de elementos iniciales
	 */
	public void initialPaneElements() {
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
	
	
}

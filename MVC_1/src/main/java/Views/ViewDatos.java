package Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class ViewDatos extends JFrame {

	private JPanel contentPane;
	private JTextField textField_name;
	private JTextField textField_surname;
	private JTextField textField_direction;
	private JTextField textField_dni;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewDatos frame = new ViewDatos();
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
	public ViewDatos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 455, 294);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel name = new JLabel("Nombre: ");
		name.setFont(new Font("Tahoma", Font.PLAIN, 14));
		name.setBounds(46, 45, 79, 23);
		contentPane.add(name);
		
		JLabel surname = new JLabel("Apellido:");
		surname.setFont(new Font("Tahoma", Font.PLAIN, 14));
		surname.setBounds(46, 79, 79, 23);
		contentPane.add(surname);
		
		JLabel direction = new JLabel("Dirección:");
		direction.setFont(new Font("Tahoma", Font.PLAIN, 14));
		direction.setBounds(46, 113, 79, 23);
		contentPane.add(direction);
		
		JLabel dni = new JLabel("DNI:");
		dni.setFont(new Font("Tahoma", Font.PLAIN, 14));
		dni.setBounds(46, 147, 61, 23);
		contentPane.add(dni);
		
		textField_name = new JTextField();
		textField_name.setBounds(112, 48, 135, 20);
		contentPane.add(textField_name);
		textField_name.setColumns(10);
		
		textField_surname = new JTextField();
		textField_surname.setColumns(10);
		textField_surname.setBounds(112, 82, 135, 20);
		contentPane.add(textField_surname);
		
		textField_direction = new JTextField();
		textField_direction.setColumns(10);
		textField_direction.setBounds(112, 113, 135, 20);
		contentPane.add(textField_direction);
		
		textField_dni = new JTextField();
		textField_dni.setColumns(10);
		textField_dni.setBounds(112, 150, 135, 20);
		contentPane.add(textField_dni);
		
		JLabel title = new JLabel("Crear Datos");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("Tahoma", Font.PLAIN, 18));
		title.setBounds(162, 11, 160, 23);
		contentPane.add(title);
		
		JButton send = new JButton("Enviar");
		send.setBounds(122, 181, 89, 23);
		contentPane.add(send);
	}
}

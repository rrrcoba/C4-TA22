package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Date;

import javax.swing.JOptionPane;

public class Cliente {

	// IMPORTANTE
	// Recordad cambiar estoo
	final static String user = "root";
	final static String pass = "Oriol92.";
	final static String url = "jdbc:mysql://192.168.1.58:3306?useTimezone=true&serverTimezone=UTC";
	final static String db = "ud22ex1";
	
	// Variables
	private int id;
	private String name;
	private String surname;
	private String direction;
	private int DNI;
	private String date;

	private Connection c;

	/**
	 * Creamos la conexión
	 */
	public void openConnection() {
		try {
			c = DriverManager.getConnection(url,user,pass);

			System.out.println("Connected.");

		} catch (SQLException e) {
			System.out.println("No se ha podido conectar con mi base de datos.");
			System.out.println(e);
		}
	}

	/**
	 * Cerramos la conexión
	 */
	public void closeConnection() {

		try {
			c.close();
			System.out.println("Se ha finalizado la conexión con el servidor.");

		} catch (SQLException e) {
			System.out.println("No se ha podido cerrar la conexión con mi base de datos.");
			System.out.println(e);
		}
	}

	/**
	 * Insertamos registros
	 * 
	 * @throws ClassNotFoundException
	 */
	public void insertData(String name, String surname, String direction, int dni, String date) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb = c.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "INSERT INTO cliente (nombre, apellido, direccion, dni, fecha) values('" + name + "', '" + surname +
			"', '" + direction + "', " + dni + ", '" + date + "');";
			Statement st = c.createStatement();
			st.executeUpdate(Query);
			JOptionPane.showMessageDialog(null, "Datos almacenados correctamente.");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "Error en el almacenamiento.", "ERROR", 0);
		}
	}

	/**
	 * Leemos registros
	 * 
	 * @param db
	 * @param table_name
	 * @return
	 */
	public ResultSet getValues() {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb = c.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "SELECT * FROM cliente;";

			Statement st = c.createStatement();
			java.sql.ResultSet resultSet;
			resultSet = st.executeQuery(Query);

			return resultSet;

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage() + "\n Error en la adquisicion de datos.", "ERROR", 0);
		}
		return null;
	}

	/**
	 * Eliminación de datos registrados
	 * 
	 * @param table_name
	 * @param field
	 * @param ID
	 */
	public void deleteRecord(String table_name, String field, String ID) {

		try {
			String Query = "DELETE FROM cliente WHERE " + field + " = \"" + ID + "\"";
			Statement st = c.createStatement();
			st.executeUpdate(Query);

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage() + "\n Error en la eliminación de datos.", "ERROR", 0);
			e.printStackTrace();
		}

	}

	/**
	 * Actualización de datos registrados
	 * @param table_name
	 * @param new_value
	 * @param field
	 * @param ID
	 * @param field_id
	 */
	public void updateData(String table_name, String new_value, String field, String ID, String field_id) {

		try {
			String Query = "UPDATE cliente SET " + field + " = \"" + new_value + "\"" + " WHERE " + field_id + " = \"" + ID + "\"";
			Statement st = c.createStatement();
			st.executeUpdate(Query);

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage() + "\n Error en la actualización de datos.", "ERROR", 0);
			e.printStackTrace();
		}

	}

	public Connection getConnection() {
		return c;
	}

	public void setConnection(Connection c) {
		this.c = c;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}

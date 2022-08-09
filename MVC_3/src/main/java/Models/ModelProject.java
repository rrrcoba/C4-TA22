package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class ModelProject {

	// IMPORTANTE
	// Recordad cambiar estoo

	final static String user = "remote";
	final static String pass = "abcd1234";
	final static String url = "jdbc:mysql://192.168.1.31:3306?useTimezone=true&serverTimezone=UTC";
	final static String db = "ud22ex3";

	private Connection c;

	/**
	 * Creamos la conexión
	 */
	public void openConnection() {
		try {
			c = DriverManager.getConnection(url, user, pass);

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
	public void insertData(String name, String hours) {
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = c.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "INSERT INTO Proyectos (Nombre, Horas) values('"	+ name + "', '" + hours + "');";
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
			String Querydb = "USE " + db + ";";
			Statement stdb = c.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "SELECT * FROM Proyectos;";

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
	public void deleteRecord(String ID) {

		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = c.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "DELETE FROM Proyectos WHERE ID = " + ID + ";";
			Statement st = c.createStatement();
			st.executeUpdate(Query);
			JOptionPane.showMessageDialog(null, "Datos eliminados correctamente.");

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage() + "\n Error en la eliminación de datos.", "ERROR", 0);
			e.printStackTrace();
		}

	}

	/**
	 * Actualización de datos registrados
	 * 
	 * @param ID
	 * @param newName
	 * @param newHours
	 */
	public void updateData(int ID, String newName, String newHours) {
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = c.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "UPDATE Proyectos SET Nombre='" + newName + "', Horas='" + newHours + "' WHERE ID=" + ID + ";";
			Statement st = c.createStatement();
			st.executeUpdate(Query);
			JOptionPane.showMessageDialog(null, "Actualización realizada con éxito.");

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage() + "\n Error en la actualización de datos.", "ERROR", 0);
			e.printStackTrace();
		}
	}
}

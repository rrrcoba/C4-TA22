package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class Cliente {
	
	private String name;
	private String surname;
	private String direction;
	private int DNI;
	private Date date;
	
	private Connection c;

	//Metodo para insertar registros a la tabla
	public void insert(String name, String surname, String direction, int DNI, Date date) {

		this.name = "'"+name+"'";	
		this.surname = "'"+surname+"'";	
		this.direction = "'"+direction+"'";
		this.DNI = DNI;
		this.date = date;		
	}

//	//Metodo para imprimir los registros
//	public java.sql.ResultSet select(String db) {
//
//		java.sql.ResultSet resultSet;
//		try {
//			resultSet = Conexion.getValues(db, "Cliente");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return resultSet;
//	}
	
	
	
	/**
	 * Creamos la conexión
	 */
	public void openConnection(String user, String pass) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://192.168.1.58:3306",user,pass);

			System.out.println("Server Connected");


		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("No se ha podido conectar con mi base de datos");
			System.out.println(e);
		}
	}
	
	/**
	 * Cerramos la conexión
	 */
	public void closeConnection() {

		try {
			c.close();
			System.out.println("Se ha finalizado la conexión con el servidor");

		} catch (SQLException e) {
			//Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, e);
			System.out.println("No se ha podido cerrar la conexión con mi base de datos");
			System.out.println(e);
		}
	}

	/**
	 * Insertamos registros
	 * 
	 * @throws ClassNotFoundException
	 */
	public void insertData(String table_name, String fields, String values) {
		try {
			String Querydb = "USE ud22ex1;";
			Statement stdb = c.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "INSERT INTO " + table_name + "(" + fields + ") values(" + values +");";
			Statement st = c.createStatement();
			st.executeUpdate(Query);

			System.out.println("Datos almacenados correctamente");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("Error en el almacenamiento");
		}
	}
	
	/**
	 * Leemos registros
	 * @param db
	 * @param table_name
	 * @return
	 */
	public ResultSet getValues(String db, String table_name) {
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = c.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "SELECT * FROM " + table_name + ";";

			Statement st = c.createStatement();
			java.sql.ResultSet resultSet;
			resultSet = st.executeQuery(Query);

			return resultSet;

		} catch (SQLException e) {
			System.out.println(e.getMessage()); System.out.println("Error en la adquisicion de datos");
		}
		return null;
	}
	
	/**
	 * Eliminación de datos registrados
	 * @param table_name
	 * @param field
	 * @param ID
	 */
	public void deleteRecord(String table_name, String field, String ID) {

		try {
			String Query = "DELETE FROM " + table_name + " WHERE " + field + " = \"" + ID + "\"";
			Statement st = c.createStatement();
			st.executeUpdate(Query);

		} catch (SQLException e) {
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
			String Query = "UPDATE " + table_name + " SET " + field + " = \"" + new_value + "\"" + " WHERE " + field_id + " = \"" + ID + "\"";
			Statement st = c.createStatement();
			st.executeUpdate(Query);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public Connection getC() {
		return c;
	}

	public void setC(Connection c) {
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}

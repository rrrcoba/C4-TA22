package Models;

import java.sql.SQLException;
import java.util.Date;

import Controllers.Controller;

public class Cliente {
	
	private Controller control = new Controller(); 
	private String name;
	private String surname;
	private String direction;
	private int DNI;
	private Date date;

	//Metodo para insertar registros a la tabla
	public void insert(String name, String surname, String direction, int DNI, Date date) {

		this.name = "'"+name+"'";	
		this.surname = "'"+surname+"'";	
		this.direction = "'"+direction+"'";
		this.DNI = DNI;
		this.date = date;		
	}

	//Metodo para imprimir los registros
	public java.sql.ResultSet select(String db) {

		java.sql.ResultSet resultSet  = conexion.getValues(db, "Cliente");
		return resultSet;
		
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

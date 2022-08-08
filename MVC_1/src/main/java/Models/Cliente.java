package Models;

import java.util.Date;

public class Cliente {

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
	public void select(String db) {
		
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

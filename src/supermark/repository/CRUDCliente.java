package supermark.repository;
import java.sql.SQLException;

import supermark.Cliente;


public class CRUDCliente {
	private ConexionBDD conexion;
	private String sql;
	
	public CRUDCliente() {
		super();
		this.conexion = new ConexionBDD ("supermark");
		this.conexion.connect();
		this.setSql("");
	}

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}
	
	public void insertar (Cliente cliente)  {
		this.sql =  "INSERT INTO cliente" + " (nombre,apellido,dni,id_domicilio,edad) " +
				 "VALUE ( ' " + cliente.getNombre () + "', '" + cliente.getApellido () + 
				"', ' " + cliente.getDNI () + "', '" + cliente.getDomicilio () + "', ' " + cliente.getEdad () + "' )";
		try {
			conexion.getStmt().executeUpdate(this.sql);
		}
		catch (SQLException e) {
			e.printStackTrace();
		} finally {
			System.out.println ("Usuario registrado");
			
		}
	
	}
	
	
}
 



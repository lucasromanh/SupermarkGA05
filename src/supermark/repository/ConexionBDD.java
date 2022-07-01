package supermark.repository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionBDD {
	
	private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	private String DB_URL = "jdbc:mysql://localhost:3306/";
	//Credenciales de la BDD
	private static final String USER = "root";
	private static final String PASS = "Micram135+";
	
	private Connection conn = null;
	private Statement stmt = null;//Objeto para realizar las declaraciones SQL que requiramos
	private ResultSet rs = null;
	
	public ConexionBDD(String db) {
		this.DB_URL += db;
	}
	
	public void connect() {
		try {
			Class.forName(JDBC_DRIVER);
			
			System.out.println("Conectando a la base datos...");
			conn = DriverManager.getConnection(DB_URL,USER,PASS);//Me conecto a la base datos
			
			System.out.println("Creando sentencias SQL...");
			//Especificamos que crearemos una sentencia SQL sobre la conexion previamente creada
			stmt = conn.createStatement();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
	

	public void close() {
		try {
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Connection getConn() {
		return conn;
	}

	public void setConn(Connection conn) {
		this.conn = conn;
	}

	public Statement getStmt() {
		return stmt;
	}

	public void setStmt(Statement stmt) {
		this.stmt = stmt;
	}

	public ResultSet getRs() {
		return rs;
	}

	public void setRs(ResultSet rs) {
		this.rs = rs;
	}

	


}
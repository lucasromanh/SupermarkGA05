package supermark.repository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionBDD {
	
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/supermark_ga05";
	//Credenciales de la BDD
	static final String USER = "root";
	static final String PASS = "Micram135+";
	
	public ConexionBDD(String string) {
		// TODO Auto-generated constructor stub
	}



	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;//Objeto para realizar las declaraciones SQL que requiramos
		ResultSet rs = null;//Conjunto de resultados
		
		try {
			Class.forName(JDBC_DRIVER);
			
			System.out.println("Conectando a la base datos...");
			conn = DriverManager.getConnection(DB_URL,USER,PASS);//Me conecto a la base datos
			
			System.out.println("Creando sentencias SQL...");
			stmt = conn.createStatement();//Especificamos que crearemos una sentencia SQL sobre la conexion previamente creada
			String sql = "SELECT cliente.id,cliente.nombre,cliente.apellido,cliente.dni,cliente.id_domicilio,cliente.edad FROM supermark_ga05.cliente";
			rs = stmt.executeQuery(sql);  //Ejecuto la consulta SELECT
			//String sql2 = "INSERT INTO universidad.departamento (departamento.nombre) VALUE ('Nutrición')";
			//stmt.executeUpdate(sql2); Crear Reed Upload Delete 
			
//			while (rs.next()) {//Mientras exista un fila siguiente/Elementos en el conjunto
//				int id = rs.getInt("id");
//				String nombre = rs.getString("nombre");
				String apellido = rs.getString("apellido");
//				long dni = rs.getLong("dni");
//				int id_domicilio = rs.getInt("id_domicilio");
//				int edad = rs.getInt("edad");
				
				
				System.out.println("id: "+id);
				System.out.println("nombre: "+nombre);
				System.out.println("apellido: "+apellido);
				System.out.println("dni: "+dni);
				System.out.println("id_domicilio: "+id_domicilio);
				System.out.println("edad: "+edad);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public void connect() {
		// TODO Auto-generated method stub
		
	}

	public Object getStmt() {
		// TODO Auto-generated method stub
		return null;
	}


}
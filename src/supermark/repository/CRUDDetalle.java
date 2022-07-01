package supermark.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import supermark.Comprobante;
import supermark.Detalle;
import supermark.Producto;

public class CRUDDetalle {
	private ConexionBDD conexion;
	private String sql;
	
	public CRUDDetalle() {
		super();
		this.conexion = new ConexionBDD("supermark");
		this.conexion.connect();//Abre la conexion
		this.sql = "";
	}
	
	public HashMap<Integer,Detalle> getLineasDetalle(Comprobante comp){
		HashMap<Integer, Detalle> detalles = new HashMap<Integer, Detalle>();
		this.sql = "SELECT * FROM detalle WHERE id_comprobante ="+
				comp.getId();
		ResultSet rs;
		try {
			rs = conexion.getStmt().executeQuery(sql);
			CRUDProducto cp = new CRUDProducto();
			int count = 0;
			while (rs.next()) {
				count++;
				Producto prod = cp.getProducto(rs.getInt("id_producto"));
				Detalle linea = new Detalle(prod, rs.getInt("cantidad"), null);
				detalles.put(count, linea);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return detalles;
	}
	
	public void registrarDetalle(Detalle detalle,Integer id_comprobante) {
		this.sql = "INSERT INTO detalle "+
				"(id_comprobante,id_producto,cantidad) "+
				"VALUE ("+
				id_comprobante+","+
				detalle.getProducto().getId()+","+
				detalle.getCantidad()+")";
		try {
			conexion.getStmt().executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Linea de Detalle agregada");
		}
	}
}

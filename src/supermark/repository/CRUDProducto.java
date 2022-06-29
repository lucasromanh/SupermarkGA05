package supermark.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import supermark.code.Producto;

public class CRUDProducto {
	private Conexion conexion;
	private String sql;
	
	public CRUDProducto() {
		super();
		this.conexion = new Conexion("supermark");
		this.conexion.connect();//Abre la conexion
		this.sql = "";
	}
	
	public Producto getProducto(Integer id) {
		Producto prod = null;
		this.sql = "SELECT * FROM producto WHERE id ="+id;
		try {
			ResultSet rs = conexion.getStmt().executeQuery(sql);
			while (rs.next()) {
				prod = new Producto(
						rs.getInt("id"),
						rs.getString("nombre"),
						rs.getString("marca"),
						rs.getDate("fecha_venc"), 
						rs.getFloat("precio"), 
						rs.getInt("stock")
						);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return prod;
	}
	
	public void actualizarStock(Producto producto,int cantidad) {
		this.sql = "UPDATE producto SET producto.stock="+
				(producto.getStock()+cantidad)+
				" WHERE producto.id="+producto.getId();
		try {
			conexion.getStmt().executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Stock Actualizado");
		}
	}
	
	public int getStockActual(Producto producto) {
		int stockActual = 0;
		this.sql = "SELECT stock FROM producto "+
				" WHERE producto.id="+producto.getId();
		try {
			conexion.setRs(conexion.getStmt().executeQuery(sql));
			int count = 0;
			while(conexion.getRs().next()) {
				stockActual = conexion.getRs().getInt("stock");
			}
			if(count>0) {
				System.out.println("Stock Actualizado");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return stockActual;
	}
}

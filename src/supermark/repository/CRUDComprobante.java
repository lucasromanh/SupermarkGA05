package supermark.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import supermark.Comprobante;
import supermark.Detalle;
import supermark.Cliente;


public class CRUDComprobante {
	private ConexionBDD conexion;
	private String sql;
	
	public CRUDComprobante() {
		super();
		this.conexion = new ConexionBDD ("supermark");
		this.conexion.connect();//Abre la conexion
		this.sql = "";
	}
	
	public void registrarCompra(Comprobante comprobante) {
		HashMap<Integer, Detalle> detalles = comprobante.getDetalle();
		this.sql = "INSERT INTO comprobante "+
				"(fecha,id_cliente,metodosdepago) "+
				"VALUE ('"+
				
				comprobante.getFecha()+"',"+
				comprobante.getDestinatario().getId()+","+
				")";
		try {
			int row = conexion.getStmt().executeUpdate(sql);
			agregarDetallesAComprobante(detalles,row);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Comprobante registrado");
		}
	}
	
	public void agregarDetallesAComprobante(HashMap<Integer, Detalle> detalles,Integer id_comprobante) {
		CRUDDetalle cd = new CRUDDetalle();
		CRUDProducto cp = new CRUDProducto();
		for(Detalle det:detalles.values()) {
			if(det.getProducto().getStock()-det.getCantidad()>=0) {
				//Insertamos una fila en la tabla Detalle
				cd.registrarDetalle(det, id_comprobante);
				//Actualizacion sobre la tabla Producto
				//cp.getStockActual(det.getProducto());
				cp.actualizarStock(det.getProducto(), -det.getCantidad());
			}else {
				System.out.println("No se dispone del stock necesario para realizar esta venta");
			}
		}
	}
	
	public ArrayList<Comprobante> getComprobantes(Cliente cliente) {
		ArrayList<Comprobante> comprobantes = new ArrayList<Comprobante>();
		this.sql = "SELECT * FROM comprobante WHERE id_usuario ="+
					cliente.getId();
		try {
			conexion.setRs(conexion.getStmt().executeQuery(sql));
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Comprobantes del Usuario:");
			ResultSet rs = conexion.getRs();
			try {
				CRUDDetalle cd = new CRUDDetalle();
				while (rs.next()) {//Mientras exista un fila siguiente/Elementos en el conjunto
					Comprobante comp = new Comprobante(null, null, null, cliente);
					comp.setId(rs.getInt("id"));
					comp.setTotal(rs.getFloat("tipo"));
					comp.setFecha(rs.getTimestamp("fecha"));
					//Busco las lineas de detalle asociadas al comprobante
					comp.setDetalle(cd.getLineasDetalle(comp));
					
					comprobantes.add(comp);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return comprobantes;
	}
}

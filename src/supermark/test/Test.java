package supermark.test;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;

import supermark.Comprobante;
import supermark.Detalle;
import supermark.Producto;
import supermark.PagoTarjeta;
import supermark.Cliente;
import supermark.Factura;
import supermark.repository.CRUDComprobante;
import supermark.repository.CRUDProducto;

public class Test {

	public static void main(String[] args) {
//		Usuario user = new Usuario();
//		user.setId(1);
//		CRUDComprobante cc = new CRUDComprobante();
//		ArrayList<Comprobante> comprobantes = cc.getComprobantes(user);
//		for(Comprobante comprobante:comprobantes) {
//			System.out.println(comprobante);
//		}
		CRUDComprobante cc = new CRUDComprobante();
		HashMap<Integer, Detalle> detalles = new HashMap<Integer, Detalle>();
		//IMPORTANTE:
		//stockActual debería ser un dato obtenido de la misma base de datos
		//a traves de otra consulta:
		Producto p = new Producto(1, null, null, null, null, null);
		CRUDProducto cp = new CRUDProducto();
		p.setStock(cp.getStockActual(p));
		Detalle detalle = new Detalle(p,10, null);
		//
		detalles.put(1,detalle);
		Cliente user = new Cliente(null, null, 0, null, 0);
		user.getDNI();
		PagoTarjeta tc = new PagoTarjeta(null, null, null, 123456, null, null, null, null, null);
		Comprobante comp = new Comprobante (
					1,
					000000001,
					new Timestamp(System.currentTimeMillis()),
					detalles,
					user
					);
		cc.registrarCompra(comp);
//		System.out.print(cp.getStockActual(new Producto(1)));
	}

}

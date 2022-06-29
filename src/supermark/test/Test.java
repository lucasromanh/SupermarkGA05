package supermark.test;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;

import supermark.code.Comprobante;
import supermark.code.Detalle;
import supermark.code.Producto;
import supermark.code.TarjetaCredito;
import supermark.code.Usuario;
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
		Producto p = new Producto(1);
		CRUDProducto cp = new CRUDProducto();
		p.setStock(cp.getStockActual(p));
		Detalle detalle = new Detalle(p,10);
		//
		detalles.put(1,detalle);
		Usuario user = new Usuario();
		user.setId(1);
		TarjetaCredito tc = new TarjetaCredito(123456);
		Comprobante comp = new Comprobante(
					"C",
					new Timestamp(System.currentTimeMillis()),
					detalles,
					user,
					tc);
		cc.registrarCompra(comp);
//		System.out.print(cp.getStockActual(new Producto(1)));
	}

}

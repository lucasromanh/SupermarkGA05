package supermark;
import java.util.*;

public class PagoTarjeta extends MetodosdePago{
	
	
	private String Pagotarjeta_debito;
	private String Pagotarjeta_crédito;
	private String banco_emisor;
	private Integer numero_tarjeta;
	private String nombre_tarjeta;
	private Date fecha_vencimiento;
	private Integer Cod_Seg;
	private Integer cuotas;
	
	
	public PagoTarjeta( String pagotarjeta_debito, String pagotarjeta_crédito,
			String banco_emisor, Integer numero_tarjeta, String nombre_tarjeta, Date fecha_vencimiento, Integer cod_Seg,
			Float monto_a_pagar, Integer cuotas) {
		super();
		
		Pagotarjeta_debito = pagotarjeta_debito;
		Pagotarjeta_crédito = pagotarjeta_crédito;
		this.banco_emisor = banco_emisor;
		this.numero_tarjeta = numero_tarjeta;
		this.nombre_tarjeta = nombre_tarjeta;
		this.fecha_vencimiento = fecha_vencimiento;
		Cod_Seg = cod_Seg;
		this.cuotas = cuotas;
	}
	public String getPagotarjeta_debito() {
		return Pagotarjeta_debito;
	}
	public void setPagotarjeta_debito(String pagotarjeta_debito) {
		Pagotarjeta_debito = pagotarjeta_debito;
	}
	public String getPagotarjeta_crédito() {
		return Pagotarjeta_crédito;
	}
	public void setPagotarjeta_crédito(String pagotarjeta_crédito) {
		Pagotarjeta_crédito = pagotarjeta_crédito;
	}
	public String getBanco_emisor() {
		return banco_emisor;
	}
	public void setBanco_emisor(String banco_emisor) {
		this.banco_emisor = banco_emisor;
	}
	public Integer getNumero_tarjeta() {
		return numero_tarjeta;
	}
	public void setNumero_tarjeta(Integer numero_tarjeta) {
		this.numero_tarjeta = numero_tarjeta;
	}
	public String getNombre_tarjeta() {
		return nombre_tarjeta;
	}
	public void setNombre_tarjeta(String nombre_tarjeta) {
		this.nombre_tarjeta = nombre_tarjeta;
	}
	public Date getFecha_vencimiento() {
		return fecha_vencimiento;
	}
	public void setFecha_vencimiento(Date fecha_vencimiento) {
		this.fecha_vencimiento = fecha_vencimiento;
	}
	public Integer getCod_Seg() {
		return Cod_Seg;
	}
	public void setCod_Seg(Integer cod_Seg) {
		Cod_Seg = cod_Seg;
	}

	public Integer getCuotas() {
		return cuotas;
	}
	public void setCuotas(Integer cuotas) {
		this.cuotas = cuotas;
	}

}

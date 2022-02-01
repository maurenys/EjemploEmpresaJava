package empresa;

public class Venta {

	private int idVenta;
	private Producto producto;
	private Cliente cliente;
	private Proveedor proveedor;
	private OfertaPublica ofertaPublica;
	
	public Venta(int idVenta, Producto producto, Cliente cliente, Proveedor proveedor, OfertaPublica ofertaPublica) {
		
		this.idVenta = idVenta;
		this.producto = producto;
		this.cliente = cliente;
		this.proveedor = proveedor;
		this.ofertaPublica = ofertaPublica;
	}

	public int getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public OfertaPublica getOfertaPublica() {
		return ofertaPublica;
	}

	public void setOfertaPublica(OfertaPublica ofertaPublica) {
		this.ofertaPublica = ofertaPublica;
	}
	
	
	
	
}

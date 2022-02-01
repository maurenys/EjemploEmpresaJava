package empresa;

public class Producto {

	private int idProducto;
	private String nombreProducto;
	private Cliente cliente;
	private String descProducto;
	private Programador programador;
	
	public Producto(int idProducto, String nombreProducto, Cliente cliente, String descProducto,
			Programador programador) {
		
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
		this.cliente = cliente;
		this.descProducto = descProducto;
		this.programador = programador;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getDescProducto() {
		return descProducto;
	}

	public void setDescProducto(String descProducto) {
		this.descProducto = descProducto;
	}

	public Programador getProgramador() {
		return programador;
	}

	public void setProgramador(Programador programador) {
		this.programador = programador;
	}
	
	

	
}

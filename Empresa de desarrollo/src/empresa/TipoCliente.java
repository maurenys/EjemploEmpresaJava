package empresa;

public class TipoCliente {

	private int idTipoCliente;
	private String descripcionCliente;
	
	public TipoCliente(int idTipoCliente, String descripcionCliente) {
		
		this.idTipoCliente = idTipoCliente;
		this.descripcionCliente = descripcionCliente;
	}

	public int getIdTipoCliente() {
		return idTipoCliente;
	}

	public void setIdTipoCliente(int idTipoCliente) {
		this.idTipoCliente = idTipoCliente;
	}

	public String getDescripcionCliente() {
		return descripcionCliente;
	}

	public void setDescripcionCliente(String descripcionCliente) {
		this.descripcionCliente = descripcionCliente;
	}
	
	
	
	
}

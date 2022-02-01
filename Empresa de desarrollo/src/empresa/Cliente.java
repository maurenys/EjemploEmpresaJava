package empresa;

public class Cliente {

	private int idCliente;
	private String nombreC;
	private TipoCliente tipoCliente;
	
	public Cliente(int idCliente, String nombreC, TipoCliente tipoCliente) {
		
		this.idCliente = idCliente;
		this.nombreC = nombreC;
		this.tipoCliente = tipoCliente;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombreC() {
		return nombreC;
	}

	public void setNombreC(String nombreC) {
		this.nombreC = nombreC;
	}

	public TipoCliente getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(TipoCliente tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
	
	
	

}

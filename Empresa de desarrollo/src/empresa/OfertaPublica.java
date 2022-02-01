package empresa;

public class OfertaPublica {

	private int idOferpublica;
	private int numeroOferta;
	private String descOferta;
	
	
	public OfertaPublica(int idOferpublica, int numeroOferta, String descOferta) {
		
		this.idOferpublica = idOferpublica;
		this.numeroOferta = numeroOferta;
		this.descOferta = descOferta;
	}


	public int getIdOferpublica() {
		return idOferpublica;
	}


	public void setIdOferpublica(int idOferpublica) {
		this.idOferpublica = idOferpublica;
	}


	public int getNumeroOferta() {
		return numeroOferta;
	}


	public void setNumeroOferta(int numeroOferta) {
		this.numeroOferta = numeroOferta;
	}


	public String getDescOferta() {
		return descOferta;
	}


	public void setDescOferta(String descOferta) {
		this.descOferta = descOferta;
	}
	
	
	
	
}

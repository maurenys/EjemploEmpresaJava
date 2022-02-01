package empresa;

public class Programador {
     
	private int idProgramador;
	private String nombreProgramador;
	private String cargoProgramador;
	
	
	public Programador(int idProgramador, String nombreProgramador, String cargoProgramador) {
		
		this.idProgramador = idProgramador;
		this.nombreProgramador = nombreProgramador;
		this.cargoProgramador = cargoProgramador;
	}


	public int getIdProgramador() {
		return idProgramador;
	}


	public void setIdProgramador(int idProgramador) {
		this.idProgramador = idProgramador;
	}


	public String getNombreProgramador() {
		return nombreProgramador;
	}


	public void setNombreProgramador(String nombreProgramador) {
		this.nombreProgramador = nombreProgramador;
	}


	public String getCargoProgramador() {
		return cargoProgramador;
	}


	public void setCargoProgramador(String cargoProgramador) {
		this.cargoProgramador = cargoProgramador;
	}
	
	
	
	
}

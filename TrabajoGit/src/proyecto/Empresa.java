package proyecto;

public class Empresa {
	
	private String nombres;
	private String CIF;
	
	//------------------------------------------------
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getCIF() {
		return CIF;
	}
	public void setCIF(String cIF) {
		CIF = cIF;
	}
	
	//--------------------------------------------------
	
	public Empresa(String nombres, String cIF) {
		super();
		this.nombres = nombres;
		CIF = cIF;
	}
	
	
}


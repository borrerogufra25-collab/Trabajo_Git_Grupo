package proyecto;

public class TarjetaDeVisita extends Documento {
	private String nombreT;
	private String telefono;
	
	//-----------------------------------------------------------------------
	public String getNombreT() {
		return nombreT;
	}
	public void setNombreT(String nombreT) {
		this.nombreT = nombreT;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		telefono = telefono;
	}

	
	//-------------------------------------------------------------------------
	
	public TarjetaDeVisita(String nombreT, String telefono) {
		super(telefono, telefono);
		this.nombreT = nombreT;
		telefono = telefono;
	}

	
	//----------------------------------------------------------------------------
	public void Imprimir(Empresa p) {
		super.imprimirEncabezado();
		System.out.println("*** El nombre del trabajador es: "+nombreT);
		System.out.println("****. El teléfono es: "+telefono);
	}
	
}

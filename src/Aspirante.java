import java.util.Arrays;

class Aspirante{
	private String folio;
	private String nombre;
	private String primerAp;
	private String segundoAP;
	private byte edad;
	private String direccion;
	private String telefono;
	private String correosElectronicos[];
	private String redesSociales[];
	private String carrerasInteres[];
	private String escuelaProcedencia;
	private String bachillerato;
	
	public Aspirante(String folio, String nombre, String primerAp, String segundoAP, byte edad, String direccion,
			String telefono, String[] correosElectronicos, String[] redesSociales, String[] carrerasInteres,
			String escuelaProcedencia, String bachillerato) {
		super();
		this.folio = folio;
		this.nombre = nombre;
		this.primerAp = primerAp;
		this.segundoAP = segundoAP;
		this.edad = edad;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correosElectronicos = correosElectronicos;
		this.redesSociales = redesSociales;
		this.carrerasInteres = carrerasInteres;
		this.escuelaProcedencia = escuelaProcedencia;
		this.bachillerato = bachillerato;
	}

	public String getFolio() {
		return folio;
	}

	public void setFolio(String folio) {
		this.folio = folio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerAp() {
		return primerAp;
	}

	public void setPrimerAp(String primerAp) {
		this.primerAp = primerAp;
	}

	public String getSegundoAP() {
		return segundoAP;
	}

	public void setSegundoAP(String segundoAP) {
		this.segundoAP = segundoAP;
	}

	public byte getEdad() {
		return edad;
	}

	public void setEdad(byte edad) {
		this.edad = edad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String[] getCorreosElectronicos() {
		return correosElectronicos;
	}

	public void setCorreosElectronicos(String[] correosElectronicos) {
		this.correosElectronicos = correosElectronicos;
	}

	public String[] getRedesSociales() {
		return redesSociales;
	}

	public void setRedesSociales(String[] redesSociales) {
		this.redesSociales = redesSociales;
	}

	public String[] getCarrerasInteres() {
		return carrerasInteres;
	}

	public void setCarrerasInteres(String[] carrerasInteres) {
		this.carrerasInteres = carrerasInteres;
	}

	public String getEscuelaProcedencia() {
		return escuelaProcedencia;
	}

	public void setEscuelaProcedencia(String escuelaProcedencia) {
		this.escuelaProcedencia = escuelaProcedencia;
	}

	public String getBachillerato() {
		return bachillerato;
	}

	public void setBachillerato(String bachillerato) {
		this.bachillerato = bachillerato;
	}

	@Override
	public String toString() {
		return "\nFicha de ingreso: " + folio + "\n====================" + "\nnombre: " + nombre + "\nprimerAp:" + primerAp + "\nsegundoAP: "
				+ segundoAP + "\nedad: " + edad + "\ndireccion: " + direccion + "\ntelefono: " + telefono
				+ "\ncorreosElectronicos: " + Arrays.toString(correosElectronicos) + "\nredesSociales: "
				+ Arrays.toString(redesSociales) + "\ncarrerasInteres: " + Arrays.toString(carrerasInteres)
				+ "\nescuelaProcedencia: " + escuelaProcedencia + "\nbachillerato: " + bachillerato;
	}
	
	
	
	
	
	
	
	
}
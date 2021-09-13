
class RegistroAspirante{
	private Aspirante vectorAspirante[];
	
	public RegistroAspirante(int tamaño) {
		vectorAspirante = new Aspirante[tamaño];
	}

	public Aspirante[] getVectorAspirante() {
		return vectorAspirante;
	}

	public void setVectorAspirante(Aspirante[] vectorAspirante) {
		this.vectorAspirante = vectorAspirante;
	}
	
	public void registrarAspirante(Aspirante a, int contFolio) {
		try {
			vectorAspirante[contFolio] = a;
        }
        catch(ArrayIndexOutOfBoundsException e) {
           System.out.println("\n>> No se agrego el usuario porque El vector ya esta lleno\n");
        }
		
	}
	
	public void eliminarAspirante(String folioFicha) {
		for (int i = 0; i < vectorAspirante.length; i++) {
			try {
				if((vectorAspirante[i].getFolio().equals(folioFicha))) {
					String correosElectronicos[] = new String[1];
					String redesSociales[] = new String[1];
					String carrerasInteres[] = new String[1]; 
					vectorAspirante[i].setFolio("");
					vectorAspirante[i].setNombre("");
					vectorAspirante[i].setPrimerAp("");
					vectorAspirante[i].setSegundoAP("");
					vectorAspirante[i].setEdad((byte)0);
					vectorAspirante[i].setDireccion("");
					vectorAspirante[i].setTelefono("");
					vectorAspirante[i].setEscuelaProcedencia("");
					vectorAspirante[i].setBachillerato("");
					vectorAspirante[i].setCorreosElectronicos(correosElectronicos);
					vectorAspirante[i].setRedesSociales(redesSociales);
					vectorAspirante[i].setCarrerasInteres(carrerasInteres);
					System.out.println("\n>> Aspirante eliminado.");
					break;
				}
					
					
	        }
	        catch(NullPointerException e) {
	           
	        }
		}  
	}
	
	public void imprimirListaAspirantes() {
		for (int i = 0; i < vectorAspirante.length; i++) {
			try {
				if(!(vectorAspirante[i].getNombre().equals("")))
					 System.out.println(vectorAspirante[i].toString()); 
	        }
	        catch(NullPointerException e) {
	           
	        }
		}  
	}
	
	
	
	
}

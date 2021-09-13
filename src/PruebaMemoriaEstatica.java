import java.util.Scanner;

public class PruebaMemoriaEstatica {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numeroAspirantes = 100;
		int opcion = 0;
		RegistroAspirante ra = new RegistroAspirante(numeroAspirantes);
		
		int contFolio = 0;
		String folio;
		String nombre;
		String primerAp;
		String segundoAP;
		byte edad;
		String direccion;
		String telefono;
		String correosElectronicos[];
		String redesSociales[];
		String carrerasInteres[];
		String escuelaProcedencia;
		String bachillerato;
		
		do {
			System.out.println("\nElije opcion: ");
			System.out.println("1) Agregar usuario");
			System.out.println("2) eliminar usuario");
			System.out.println("3) Mostrar usuarios");
			System.out.println("4) Salir");
			System.out.println("Introduce opcion: ");
			opcion = entrada.nextInt();
			
			switch (opcion) {
			case 1:
				contFolio++;
				folio = "0" + contFolio;
				System.out.println("\nIntroduce datos");
				System.out.println("nombre: ");
				nombre = entrada.next();
				System.out.println("Apellido Paterno: ");
				primerAp = entrada.next();
				System.out.println("Apellido Materno: ");
				segundoAP = entrada.next();
				System.out.println("edad: ");
				edad = entrada.nextByte();
				System.out.println("Direccion: ");
				direccion = entrada.next();
				System.out.println("Telefono: ");
				telefono = entrada.next();
				
				System.out.println("numero de Correos electronicos: ");
				int numeroCorreos = entrada.nextInt();
				correosElectronicos = new String[numeroCorreos];
				for(int j = 0; j < correosElectronicos.length; j++) {
					System.out.println("Introduce correo " + (j+1) + ": ");
					correosElectronicos[j] = entrada.next();
				}
				
				System.out.println("numero de Redes sociales: ");
				int numeroSociales = entrada.nextInt();
				redesSociales = new String[numeroSociales];
				for(int j = 0; j < redesSociales.length; j++) {
					System.out.println("Introduce red social " + (j+1) + ": ");
					redesSociales[j] = entrada.next();
				}
				
				System.out.println("numero de Carreras de interes: ");
				int numeroCarreras = entrada.nextInt();
				carrerasInteres = new String[numeroCarreras];
				for(int j = 0; j < carrerasInteres.length; j++) {
					System.out.println("Introduce carrera " + (j+1) + ": ");
					carrerasInteres[j] = entrada.next();
				}
				
				System.out.println("Escuela de procedencia: ");
				escuelaProcedencia = entrada.next();
				System.out.println("Bachillerato: ");
				bachillerato = entrada.next();
				Aspirante asp1 = new Aspirante(folio, nombre, primerAp, segundoAP, edad, direccion, telefono, correosElectronicos, redesSociales, carrerasInteres, escuelaProcedencia, bachillerato);
				ra.registrarAspirante(asp1, contFolio-1);
				break;
			case 2:
				System.out.println("Introduce folio: ");
				String folioBorrar = entrada.next();
				ra.eliminarAspirante(folioBorrar);
				break;
			case 3:
				ra.imprimirListaAspirantes();
				break;
			case 4:
				System.out.println("Saliendo . . .");
				break;
				
			default:
				break;
			}
		}while (opcion != 4);
	
		
		/*
		
		}
		*/
			
	}
}

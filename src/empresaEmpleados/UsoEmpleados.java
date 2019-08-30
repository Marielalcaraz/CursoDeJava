package empresaEmpleados;

public class UsoEmpleados {

	public static void main(String[] args) {
		/*
		 * En este programa veremos: Polimorfismo, Principio de sustituci�n y Enlazado Din�mico
		 */
		
		Empleado[] Empleados = new Empleado[5];
		
		Empleados[0]=new Empleado("Gat�n",48000);
		Empleados[1]=new Empleado("Carlitos",48000);
		Empleados[2]=new Empleado("Luc�a",48000);
		Empleados[3]=new Empleado("Rita",48000);
		
		/*
		 * PRINCIPIO DE SUSTITUCI�N
		 * Como un Jefe es un empleado por principio de sustituci�n
		 * podemos almacenar un objeto de tipo jefe en un array de empleado
		 * porque un JEFE es un EMPLEADO
		 */
		Empleados[4]=new Jefe("Victor",50000); //PRINCIPIO DE SUSTITUCI�N
		
		for(Empleado objeto:Empleados) {
			/*
			 * Por POLIMORFISMO podemos utilizar el mismo m�todo getSueldo
			 * que es distinto en la clase empleado y jefe
			 * pero como las dos propiedades tienen el mismo nombre (polimorfismo)
			 * y los mismo par�metros, podemos utilizar las dos
			 * Esto es porque el interprete de JAVA por medio del 
			 * ENLAZAMIENTO DIN�MICO sabe que m�todo utilizar. 
			 */
			System.out.println(objeto.getDatosEmpleado()+"\nSALARIO: "+objeto.getSueldo());
		}
		
		
		
	}

}

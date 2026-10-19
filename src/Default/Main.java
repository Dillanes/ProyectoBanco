package Default;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Empleados empleado = new Empleados(2222,"Miguel",43322333,'H');
		Empleados empleado2 = new Empleados(3324,"Maria",45645456,'M');
		Empleados empleado3 = new Empleados(5443,"Juan",878787656,'H');
		
		List<Empleados> lista = new ArrayList<Empleados>();
		
		//Agregar
		lista.add(empleado);
		lista.add(empleado2);
		lista.add(empleado3);
		
		System.out.println(lista);
		
		Empleados empleadosEncontrados = null;
		
		//Buscar
		empleadosEncontrados = lista.get(1);
		
		System.out.println("Se encontro el registro");
		System.out.println(empleadosEncontrados);
		
		
		//editar .set(indice , elemento)
		empleadosEncontrados.setNombre("Mauricio AV");
		empleadosEncontrados.setNumCell(3435454);
		empleadosEncontrados.setSexo('H');
		
		System.out.println("Empleado actualizado: ");
		System.out.println(empleadosEncontrados);
		

		//eliminar
		lista.remove(2);
		
		System.out.println("Un registro eliminado: ");
		System.out.println(lista);
		
	}

}

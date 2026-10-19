package Default;

public class Empleados {
	
	private long numEmp;
	private String Nombre;
	private long numCell;
	private char sexo;
	
	public Empleados() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empleados(long numEmp, String nombre, long numCell, char sexo) {
		super();
		this.numEmp = numEmp;
		Nombre = nombre;
		this.numCell = numCell;
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Empleados [numEmp=" + numEmp + ", Nombre=" + Nombre + ", numCell=" + numCell + ", sexo=" + sexo + "]";
	}

	public long getNumEmp() {
		return numEmp;
	}

	public void setNumEmp(long numEmp) {
		this.numEmp = numEmp;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public long getNumCell() {
		return numCell;
	}

	public void setNumCell(long numCell) {
		this.numCell = numCell;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	

	

}

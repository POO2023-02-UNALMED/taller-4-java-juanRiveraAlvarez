package classroom;

public enum Tipo {
	
	DISCIPLINAR(10,"10"),FUNDAMENTACION(20,"20"),ELECTIVA(30,"30");
	
	private int codigo;
	private String nombre;
	private Tipo(int codigo,String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
}

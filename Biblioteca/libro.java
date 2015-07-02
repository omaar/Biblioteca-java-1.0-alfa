public class libro{
	//VARIABLES
	public String titulo, editorial;
	public int existencia;
	autor a1 = new autor();

	//CONSTRUCTOR

	public libro(){
		this.titulo="---";
		this.editorial="---";
		this.existencia=0;
		a1.setName("name");
	}

	/*public libro(String titulo, String nombre, String editorial, int existencia){
		this.titulo=titulo;
		this.editorial=editorial;
		this.existencia=existencia;
		a1.setName(nombre);
	}*/

	//METODOS

	public String getInfo(){
		return String.format("\n Titulo: %s \n Autor: %s \n Editorial: %s \n Existencias: %d",this.titulo, a1.getName(), this.editorial, this.existencia);
	}

	public String getInfoAutor(){
		return a1.getInfo();
	}

	public void setTitulo(String titulo){
		this.titulo=titulo;
	}

	public void setEditorial(String editorial){
		this.editorial=editorial;
	}

	public void setExistencia(int existencia){
		this.existencia=existencia;
	}

	public void setName(String name){
		a1.setName(name);
	}

	public String getTitulo(){
		return String.format(this.titulo);
	}

	public int getExistencia(){
		return this.existencia;
	}
}
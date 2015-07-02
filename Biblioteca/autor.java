public class autor{
	//VARIABLES
	public String nombre; 
	private String tel, correo, org;
	

	//CONSTRUCTOR

	public autor(){
		this.nombre="name";
		this.tel="000";
		this.correo="example@domain.com";
		this.org="freeBooks";
	}

	/*public autor(String nombre, String tel ,String correo, String org){
		this.nombre=nombre;
		this.tel=tel;
		this.correo=correo;
		this.org=org;	
	}*/

	//METODOS

	public void setName(String nombre){
		this.nombre=nombre;
	}

	public void setTelefono(String tel){
		this.tel=tel;
	}

	public void setCorreo(String correo){
		this.correo=correo;
	}

	public void setOrg(String org){
		this.org=org;
	}

	public String getName(){
		return String.format(this.nombre);
	}

	public String getInfo(){
		return String.format("\n Nombre: %s \n Telefono: %s \n E-mail: %s \n Organizacion: %s",this.nombre, this.tel, this.correo, this.org);
	}
}
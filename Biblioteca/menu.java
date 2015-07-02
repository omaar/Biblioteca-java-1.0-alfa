import java.util.Scanner;

public class menu{
	//VARIABLES
	public int op=0,cont=0;
	Scanner sc = new Scanner(System.in);
	libro l = new libro();

	//CONTRUCTOR

	//METODOS
	public void impMenu(){
		do{
			cont++;
			System.out.println("\n Sistema Biblioteca" +
							"\n 1.Ingresar Libro" +
							"\n 2.Mostrar libros \n");
			op=sc.nextInt();
			if(op==1){
				
				System.out.println("Titulo: ");
				l.setTitulo(sc.nextLine());
				sc.nextLine();
				System.out.println("Autor: ");
				l.setName(sc.nextLine());
				sc.nextLine();
				System.out.println("Editorial: ");
				l.setEditorial(sc.nextLine());
				sc.nextLine();
				System.out.println("Existencia(s): ");
				l.setExistencia(sc.nextInt());
				
			}
			else if(op==2){
				System.out.println(l.getInfo());
				System.out.println(l.getInfoAutor());
			}
			else{
				System.out.println ("error");
			}

		}while(op<3);

	}
}
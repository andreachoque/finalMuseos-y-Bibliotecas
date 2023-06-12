import java.util.*;
public class Obras {
//(cod, titulo,autor,NroPag, anioPublicacion)
	private String cod, autor,nomObra;
	private int apub;
	
	public String getNomObra() {
		return nomObra;
	}

	public void setNomObra(String nomObra) {
		this.nomObra = nomObra;
	}

	Obras(){
		this.cod="";
		this.autor="";
		this.nomObra="";
		this.apub=0;
		
	}
	
	Obras(String codigo, String autor,String nomObra, int aniopub){
		this.cod=codigo;
		this.autor=autor;
		this.nomObra=nomObra;
		this.apub=aniopub;
	}
	
	public void leerObras() {
		Scanner teclado= new Scanner(System.in);
		System.out.print("Ingrese el codigo del obra: ");
		this.cod=teclado.nextLine();
		System.out.print("\nIngrese el autor: ");
		this.autor=teclado.nextLine();
		System.out.print("\nIngrese nombre de la obra: ");
		this.nomObra=teclado.nextLine();
		System.out.print("\nIngrese el año de publicación: ");
		this.apub=teclado.nextInt();
	}
	
	public void mostrarObras() {
		System.out.println("Obra ["+this.cod+", "+this.autor+", "+this.nomObra+", "+this.apub+"]");
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}



	public int getApub() {
		return apub;
	}

	public void setApub(int apub) {
		this.apub = apub;
	}
	
}

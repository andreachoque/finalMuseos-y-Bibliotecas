import java.util.*;
public class Libros {
	private String cod, autor;
	private int npag, apub;
	
	Libros(){
		this.cod="";
		this.autor="";
		this.npag=0;
		this.apub=0;
		
	}
	
	Libros(String codigo, String autor, int paginas, int aniopub){
		this.cod=codigo;
		this.autor=autor;
		this.npag=paginas;
		this.apub=aniopub;
	}
	
	public void leerLibros() {
		Scanner teclado= new Scanner(System.in);
		System.out.print("Ingrese el codigo del ibro: ");
		this.cod=teclado.nextLine();
		System.out.print("\nIngrese el autor: ");
		this.autor=teclado.nextLine();
		System.out.print("\nIngrese el numero de Paginas: ");
		this.npag=teclado.nextInt();
		System.out.print("\nIngrese el a�o de publicaci�n: ");
		this.apub=teclado.nextInt();
	}
	
	public void mostrarLibros() {
		System.out.println("--> Libro ["+this.cod+", "+this.autor+", "+this.npag+", "+this.apub+"]");
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

	public int getNpag() {
		return npag;
	}

	public void setNpag(int npag) {
		this.npag = npag;
	}

	public int getApub() {
		return apub;
	}

	public void setApub(int apub) {
		this.apub = apub;
	}
	
}

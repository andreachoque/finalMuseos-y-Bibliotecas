
import java.util.Scanner;

public class main {
   

   	  public static void main(String[] args) {
           
               Scanner scanner = new Scanner(System.in);
               LSNormalLibros l1=new LSNormalLibros();
		l1.addUltimo(new Libros("Las intermitencias de la muerte", "Jose Saramago", 214, 2005));
		l1.addUltimo(new Libros("Animales Fantasticos", "JK Rowling", 150, 2001));
		l1.addUltimo(new Libros("Fuego y sangre", "George RR Martin", 100, 2018));
		l1.addUltimo(new Libros("El Se�or de los anillos", "JRR Tolkien", 100, 1954));
		
		LSNormalLibros l2=new LSNormalLibros();
		l2.addUltimo(new Libros("Harry Potter", "JK Rowling", 50, 1997));
		l2.addUltimo(new Libros("El resplandor", "Stephen King", 84, 1978));
		l2.addUltimo(new Libros("Juego de Tronos", "George RR Martin", 300, 1996));
		l2.addUltimo(new Libros("Carrie", "Stephen King", 100, 1974));
		
		LSNormalLibros l3 = new LSNormalLibros();
		l3.addUltimo(new Libros("Nomadas nocturnos", "George RR Martin", 210, 1980));
		l3.addUltimo(new Libros("Una vacante imprevista", "JK Rowling", 130,  2012));
		l3.addUltimo(new Libros("It", "Stephen King", 95,1986));
		l3.addUltimo(new Libros("El hobbit", "JRR Tolkien", 80,1937));
		l3.addUltimo(new Libros("Cuentos de Beedle el Bardo", "JK Rowling", 105, 2012));
		
		LSNormalLibros l4 = new LSNormalLibros();
		l4.addUltimo(new Libros("La historia de Lisey", "Stephen King", 10, 2006));
		l4.addUltimo(new Libros("El Silmarillion", "JRR Tolkien", 35, 1977));
		l4.addUltimo(new Libros("El gusano de seda", "JK Rowling", 60, 2016));
		l4.addUltimo(new Libros("La historia de Beren y Luthien", "JRR Tolkien", 88, 2017)); 
		
		LSNormalLibros l5 = new LSNormalLibros();
		l5.addUltimo(new Libros("Muerte de la luz", "George RR Martin", 150, 1977));
		l5.addUltimo(new Libros("El retorno del rey", "JRR Tolkien", 300, 1955));
		l5.addUltimo(new Libros("La larga marcha", "Stephen King", 190,1979));
		l5.addUltimo(new Libros("El canto del Cuco", "JK Rowling", 99, 2013));
		l5.addUltimo(new Libros("Festin de cuervos", "George RR Martin", 500, 2004));
		
		LSNormalLibros l7 = new LSNormalLibros();
		l7.addUltimo(new Libros("Cien a�os de soledad", "Gabriel Garc�a M�rquez", 300, 1967));
		l7.addUltimo(new Libros("El amor en los tiempos del c�lera", "Gabriel Garc�a M�rquez", 250, 1985));
		l7.addUltimo(new Libros("La ciudad y los perros", "Mario Vargas Llosa", 200, 1963));
		l7.addUltimo(new Libros("La casa de los esp�ritus", "Isabel Allende", 280, 1982));
		l7.addUltimo(new Libros("Rayuela", "Julio Cort�zar", 150, 1963));

		LSNormalLibros l8 = new LSNormalLibros();
		l8.addUltimo(new Libros("1984", "George Orwell", 180, 1949));
		l8.addUltimo(new Libros("Un mundo feliz", "Aldous Huxley", 200, 1932));
		l8.addUltimo(new Libros("Fahrenheit 451", "Ray Bradbury", 150, 1953));
		l8.addUltimo(new Libros("El hombre invisible", "H.G. Wells", 120, 1897));
		l8.addUltimo(new Libros("La maquina del tiempo", "H.G. Wells", 100, 1895));
		
		LSNormalLibros l9 = new LSNormalLibros();
		l9.addUltimo(new Libros("El codigo Da Vinci", "Dan Brown", 350, 2003));
		l9.addUltimo(new Libros("La sombra del viento", "Carlos Ruiz Zafon", 280, 2001));
		l9.addUltimo(new Libros("La catedral del mar", "Ildefonso Falcones", 300, 2006));
		l9.addUltimo(new Libros("El psicoanalista", "John Katzenbach", 200, 2002));
		l9.addUltimo(new Libros("La trilogia de Nueva York", "Paul Auster", 220, 1987));

		LSNormalLibros l0 = new LSNormalLibros();
		l0.addUltimo(new Libros("Los pilares de la Tierra", "Ken Follett", 900, 1989));
		l0.addUltimo(new Libros("La isla del tesoro", "Robert Louis Stevenson", 150, 1883));
		l0.addUltimo(new Libros("Las aventuras de Tom Sawyer", "Mark Twain", 180, 1876));
		l0.addUltimo(new Libros("El gran Gatsby", "F. Scott Fitzgerald", 200, 1925));
		l0.addUltimo(new Libros("La llamada de lo salvaje", "Jack London", 120, 1903));

		LSNormalLibros l6 = new LSNormalLibros();
		l6.addUltimo(new Libros("La odisea", "Homero", 250, -800));
		l6.addUltimo(new Libros("La Iliada", "Homero", 280, -750));
		l6.addUltimo(new Libros("Divina Comedia", "Dante Alighieri", 300, 1320));
		
		/*		
		System.out.println("------------------------------------------------------");
		
		l1.mostrarLSN();
		l2.mostrarLSN();
		l3.mostrarLSN();
		l4.mostrarLSN();
		l5.mostrarLSN();
		l6.mostrarLSN();
		l7.mostrarLSN();
		l8.mostrarLSN();
		l9.mostrarLSN();
		l0.mostrarLSN();
		
		System.out.println("------------------------------------------------------");*/
		  //LDMBiblio A=new LDMBiblio();
	        Biblioteca m1=new Biblioteca(10,"Miraflores","Calle Claudio Sanjinez No 1602 (Casa del Poeta)","Biblioteca Especializada Yolanda Bedregal",l1);
	        Biblioteca m2=new Biblioteca(11,"Huaychani"," C. Merida # 5","Municipal de Huaychani",l2);
	        Biblioteca m3=new Biblioteca(12,"Alto Obrajes"," Av. Del Maestro Esq. C. 10 - Frente al Parque UFAO","Alto Obrajes",l3);
	        Biblioteca m4=new Biblioteca(13,"Alto Pampahasi"," C. G Esq. Mercado La Paz - Lado Reten Policial","Zonal de Alto Pampahasi",l4);
	        Biblioteca m5=new Biblioteca(14,"Achachicala"," Av. Ramos Gavilan entre la C. 3 y 2 - Lado Mercado de las Nieves","Municipal de Achachicala",l5);
	        Biblioteca m6=new Biblioteca(15,"El Tejar bajo","Av. Heroes del Pac�fico Esq. C. Raymundo Gonzoles, Sede Social de Junta de Vecinos - Plaza 27 de mayo","Biblioteca de tradiciones, costumbres y folklore :Ismael Sotomayor",l6);
	        Biblioteca m7=new Biblioteca(16,"Munaypata"," C. 31 de Julio - frente al Colegio 25 de Mayo","Biblioteca Zonal Munaypata",l7);
	        Biblioteca m8=new Biblioteca(17,"Central","Calle Mexico Plaza del Estudiante Calle Cañada Strongest","Centro de Informaci�n Documental",l8);
	        Biblioteca m9=new Biblioteca(18,"Mariscal Santa Cruz"," Av. Mscal Santa Cruz y Calle Potosi, (Casa de la Cultura Franz Tamayo)","Archivo Historico Rosendo Gutierrez",l9);
	        Biblioteca m10=new Biblioteca(19,"Miraflores","Calle Francisco  de Chirinos esquina Calle Caballero","Biblioteca Municipal Miraflores",l0);

	        /*A.adiFinal(m1);
	        A.adiFinal(m2);
	        A.adiFinal(m3);
	        A.adiFinal(m4);
	        A.adiFinal(m5);
	        A.adiFinal(m6);
	        A.adiFinal(m7);
	        A.adiFinal(m8);
	        A.adiFinal(m9);
	        A.adiFinal(m10);*/
                
                 CSimpleD B=new CSimpleD();
                B.adicionar(m1);
	        B.adicionar(m2);
	        B.adicionar(m3);
	        B.adicionar(m4);
	        B.adicionar(m5);
	        B.adicionar(m6);
	        B.adicionar(m7);
	        B.adicionar(m8);
	        B.adicionar(m9);
	        B.adicionar(m10);
                B.mostrar();
                B.mostrarbibliotecacompleta();
	        
	       
	        LSNormalObras O1=new LSNormalObras();
			O1.addUltimo(new Obras("33","Vincent van Gogh","Los Girasoles",1888));
			O1.addUltimo(new Obras("29","Pablo Picasso","Mujer Llorando",1937));
			O1.addUltimo(new Obras("29","Pablo Picasso","La Persistencia de la Memoria",1931));
			O1.addUltimo(new Obras("50","Leonardo da Vinci","La Virgen de las Rocas",1483));
			
			LSNormalObras O8=new LSNormalObras();
			O8.addUltimo(new Obras("12","Salvador Dali","La Tentacion de San Antonio",1946));
			O8.addUltimo(new Obras("50","Leonardo da Vinci","La Ultima Cena",1495));
			O8.addUltimo(new Obras("29","Pablo Picasso","El Viejo Guitarrista Ciego",1903));
			O8.addUltimo(new Obras("50","Leonardo da Vinci","El Hombre de Vitruvio",1490));

			LSNormalObras O2=new LSNormalObras();
			O2.addUltimo(new Obras("29","Pablo Picasso","Guernica",1937));
			O2.addUltimo(new Obras("12","Salvador Dali","El Gran Masturbador",1929));
			O2.addUltimo(new Obras("33","Vincent van Gogh","Los Comedores de Patatas",1885));
			O2.addUltimo(new Obras("33","Vincent van Gogh","Autorretrato sin Barba",1889));

			LSNormalObras O3=new LSNormalObras();
			O3.addUltimo(new Obras("12","Salvador Dali","La Persistencia de la Memoria",1931));
			O3.addUltimo(new Obras("33","Vincent van Gogh","La Noche Estrellada",1889));
			O3.addUltimo(new Obras("12","Salvador Dali","Sueño Causado por el Vuelo de una Abeja Alrededor de una Granada un Segundo Antes de Despertar",1944));
			O3.addUltimo(new Obras("BOL001","Melchor Perez de Holguin","La Purisima Concepcion", 1752));
			
			LSNormalObras O0=new LSNormalObras();
			O0.addUltimo(new Obras("BOL001","Melchor Perez de Holguin","La Virgen de la Candelaria", 1730));
			O0.addUltimo(new Obras("BOL001","Melchor Perez de Holguin","San Francisco de Asis", 1744));
			O0.addUltimo(new Obras("BOL001","Melchor Perez de Holguin","La Asuncion de la Virgen Maria", 1745));
			O0.addUltimo(new Obras("50","Leonardo da Vinci","La Gioconda",1503));

			LSNormalObras O6=new LSNormalObras();
			O6.addUltimo(new Obras("BOL002","Maria Luisa Pacheco","Retrato de Victor Paz Estenssoro", 1960));
			O6.addUltimo(new Obras("BOL002","Maria Luisa Pacheco","Retrato de Jose Santos Vargas", 1963));
			O6.addUltimo(new Obras("BOL002","Maria Luisa Pacheco","Retrato de Alcides Arguedas", 1965));
			O6.addUltimo(new Obras("BOL002","Maria Luisa Pacheco","Retrato de Franz Tamayo", 1968));
	
			LSNormalObras O7=new LSNormalObras();
			O7.addUltimo(new Obras("BOL005","Julio de la Vega","Oruro, Carnaval 2", 1956));
			O7.addUltimo(new Obras("BOL003","Bernardo Bitti","La Asuncion de la Virgen", 1585));
			O7.addUltimo(new Obras("BOL004","Meliton Rodriguez","Retrato de Manuel Isidoro Belzu", 1848));
			O7.addUltimo(new Obras("BOL003","Bernardo Bitti","El Bautismo de Cristo", 1596));

			LSNormalObras O4=new LSNormalObras();
			O4.addUltimo(new Obras("BOL004","Meliton Rodriguez","Retrato de Andres de Santa Cruz", 1845));
			O4.addUltimo(new Obras("10","Frida Kahlo","Raices",1943));
			O4.addUltimo(new Obras("BOL004","Meliton Rodriguez","Retrato de Jose Ballivian y Segurola", 1852));
			O4.addUltimo(new Obras("MM002", "Roberto Mamani Mamani", "Mitos y Leyendas Andinas", 1998));

			LSNormalObras O5=new LSNormalObras();
			O5.addUltimo(new Obras("10","Frida Kahlo","Las Dos Fridas",1939));
			O5.addUltimo(new Obras("BOL003","Bernardo Bitti","La Ultima Cena", 1601));
			O5.addUltimo(new Obras("BOL005","Julio de la Vega","Bailando Caporales", 1957));
			O5.addUltimo(new Obras("MM004", "Roberto Mamani Mamani", "La Sabidur�a de los Antiguos", 2012));
			
			LSNormalObras O10=new LSNormalObras();
			O10.addUltimo(new Obras("BOL005","Julio de la Vega","Oruro, Carnaval 1", 1956));
			O10.addUltimo(new Obras("10","Frida Kahlo","Autorretrato con Collar de Espinas",1940));
			O10.addUltimo(new Obras("BOL003","Bernardo Bitti","La Anunciacion", 1587));
			O10.addUltimo(new Obras("10","Frida Kahlo","El Abrazo de Amor del Universo",1949));

			LSNormalObras O9 = new LSNormalObras();
			O9.addUltimo(new Obras("MM001", "Roberto Mamani Mamani", "El Poder de la Pachamama", 2002));
			O9.addUltimo(new Obras("BOL004","Meliton Rodriguez","Retrato de Pedro Blanco Soto", 1857));
			O9.addUltimo(new Obras("MM003", "Roberto Mamani Mamani", "La Vida en las Alturas", 2007));
			O9.addUltimo(new Obras("BOL005","Julio de la Vega","Calle Sag�rnaga", 1960));
			
						
			/*System.out.println("------------------------------------------------------");
			
			O1.mostrarLSN();
			O2.mostrarLSN();
			O3.mostrarLSN();
			O4.mostrarLSN();
			O5.mostrarLSN();
			O6.mostrarLSN();
			O7.mostrarLSN();
			O8.mostrarLSN();
			O9.mostrarLSN();
			O10.mostrarLSN();
		 */
		// LDMMuseo M=new LDMMuseo();
	     Museo M1=new Museo(29,"Miraflores","Av. Del Ej�rcito","ESPACIO DE LA MEMORIA HIST�RICA DE LAS LUCHAS DEL PUEBLO BOLIVIANO POR LA LIBERTAD Y LA DEMOCRACIA",O1);
	     Museo M2=new Museo(20, "Centro", "Calle Linares 906", "EXPOSICI�N Y VENTA DE TEXTILES ANDINOS",O2);	    
	     Museo M3=new Museo(21, "Sopocachi", "Plaza Isabel La Cat�lica s/n", "EXPOSICI�N DE ARTE CONTEMPOR�NEO",O3);	     
	     Museo M4=new Museo(22, "Miraflores", "Calle Ingavi s/n", "EXPOSICI�N DE ARTEFACTOS ARQUEOL�GICOS PREHISP�NICOS",O4);	     
	     Museo M5=new Museo(23, "San Pedro", "Calle Linares 906", "EXPOSICI�N DE LA HISTORIA, USO Y CULTIVO DE LA COCA",O5);	    
	     Museo M6=new Museo(24, "Sopocachi", "Calle Capit�n Castrillo s/n", "EXPOSICI�N DE LA HISTORIA DEL LITORAL BOLIVIANO",O6);	     
	     Museo M7=new Museo(25, "San Francisco", "Calle Ja�n 711", "EXPOSICI�N DE INSTRUMENTOS MUSICALES BOLIVIANOS",O7);	     
	     Museo M8=new Museo(26, "San Jorge", "Calle Comercio 1472", "EXPOSICI�N DE ARTE BOLIVIANO E INTERNACIONAL",O8);	     
	     Museo M9=new Museo(27, "San Jorge", "Calle Comercio 1472", "EXPOSICI�N DE LA HISTORIA DE LA REVOLUCI�N BOLIVIANA",O9);	     
	     Museo M0=new Museo(28, "Cotahuma", "Calle 21 de Mayo s/n", "EXPOSICI�N DE LA CULTURA DE LA COCA Y LA IDENTIDAD BOLIVIANA",O10);   
	     
	     /*	M.adiFinal(M1);
	        M.adiFinal(M2);
	        M.adiFinal(M3);
	        M.adiFinal(M4);
	        M.adiFinal(M5);
	        M.adiFinal(M6);
	        M.adiFinal(M7);
	        M.adiFinal(M8);
	        M.adiFinal(M9);
	        M.adiFinal(M0);
                */
            PilaA a=new PilaA();
                a.adicionar(M1);
	        a.adicionar(M2);
	        a.adicionar(M3);
	        a.adicionar(M4);
	        a.adicionar(M5);
	        a.adicionar(M6);
	        a.adicionar(M7);
	        a.adicionar(M8);
	        a.adicionar(M9);
	        a.adicionar(M0);
                a.mostrar();
		a.mostrarMuseoCompleto();
                
                
                
	        int opcion;
        do {
            System.out.println("----- Menú Principal -----");
            System.out.println("1. Mostrar bibliotecas");
            System.out.println("2. Mostrar bibliotecas y libros");
            System.out.println("3. Mostrar museos");
            System.out.println("4. Mostrar museos y obras");
            System.out.println("5. Buscar Obras por autor");
            System.out.println("6. Buscar Libro por autor");
            System.out.println("7. Buscar por nombre del libro");
            System.out.println("8. Buscar por nombre de obra");
            System.out.println("9. Buscar año de obra");
            System.out.println("10.Buscar año de libro");
            System.out.println("11. Salir");
            System.out.print("Ingrese una opción: ");
            
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    B.mostrar(); //RECURSIVO
                    break;
                case 2:
                    B.mostrarbibliotecacompleta();
                    break;
                case 3:
                    a.mostrar(); //RECURSIVO
                    break;
                case 4:
                    a.mostrarMuseoCompleto();
                    break;
                case 5: 
                    buscarAutorEnMuseos(a);
                    break; 
                case 6:  
                    buscarLibrosPorAutor(B);
                    break;
                case 7:   
                    buscarLibroPorCodigo(B);
                    break;
                case 8:  
                    buscarObraEnMuseos(a);
                    break;
                case 9:   
                    buscarObrasPorAnio(a);
                    break;
                case 10:  
                    buscarLibroPorAnio(B);
                    break;
 
                case 11:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 11);

        scanner.close();
        
        
        
    }  
          
           public static void buscarAutorEnMuseos (PilaA s)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el autor a buscar: ");
        String autorBuscado = scanner.nextLine();
        Museo elem;
        boolean encontrado = false;
        if (s.esvacia ())
            System.out.println ("Pila vacia");
        else
        {
            System.out.println ("\n Datos de la Pila ");
            PilaA aux1 = new PilaA ();
            while (!s.esvacia ())
            {
                elem = s.eliminar ();
                aux1.adicionar (elem);
                 NodoObras aux=elem.getListaObras().getP();
                while (aux != null) {
                if (aux.getDato().getAutor().equalsIgnoreCase(autorBuscado)) {
                    encontrado = true;
                    //museo.mostrarMuseo();
                    System.out.println("Museo: " + elem.getDireccion());
                    System.out.println("Ubicación: " + elem.getNomMun());
                    System.out.println("Obra: " + aux.getDato().getNomObra());
                    System.out.println("Autor: " + aux.getDato().getAutor());
                    System.out.println("Año de publicacion : " + aux.getDato().getApub());
                    System.out.println("--------------------");
                    break;
                }
                
                aux = aux.getSig();
            }
            }
             if (!encontrado) {
                System.out.println("No se encontraron obras del autor ");
            }
            while (!aux1.esvacia ())
            {
                elem = aux1.eliminar ();

                s.adicionar (elem);
            }
        }
    }
    public static void buscarAutorEnMuseos(LDMMuseo i) {
        // Aquí debes tener acceso a las listas de museos, reemplaza "listaMuseos" por tu variable correspondiente
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el autor a buscar: ");
        String autorBuscado = scanner.nextLine();
        NodoDobleMuseo o = i.getPm();
        boolean encontrado = false;
        while (o != null) {
            Museo museo = o.getDatoL();
            NodoObras aux = museo.getListaObras().getP();
            
            while (aux != null) {
                if (aux.getDato().getAutor().equalsIgnoreCase(autorBuscado)) {
                    encontrado = true;
                    //museo.mostrarMuseo();
                    System.out.println("Museo: " + museo.getDireccion());
                    System.out.println("Ubicación: " + museo.getNomMun());
                    System.out.println("Obra: " + aux.getDato().getNomObra());
                    System.out.println("Autor: " + aux.getDato().getAutor());
                    System.out.println("Año de publicacion : " + aux.getDato().getApub());
                    System.out.println("--------------------");
                    break;
                }
                
                aux = aux.getSig();
            }
            
            o = o.getSig();
        }
        if (!encontrado) {
                System.out.println("No se encontraron obras del autor ");
            }
    }
    
    public static void buscarObraEnMuseos(PilaA s) {
        // Aquí debes tener acceso a las listas de museos, reemplaza "listaMuseos" por tu variable correspondiente
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la obra a buscar: ");
                     String nombreObraBuscada = scanner.nextLine();
            boolean encontrado = false;
            Museo elem;
        if (s.esvacia ())
            System.out.println ("Pila vacia");
        else
        {
            System.out.println ("\n Datos de la Pila ");
            PilaA aux1 = new PilaA ();
            while (!s.esvacia ())
            {
                elem = s.eliminar ();
                aux1.adicionar (elem);
                 NodoObras aux=elem.getListaObras().getP();
            while (aux != null) {
                if (aux.getDato().getNomObra().equalsIgnoreCase(nombreObraBuscada)) {
                    encontrado = true;
                    //museo.mostrarMuseo();
                    System.out.println("Museo: " + elem.getDireccion());
                    System.out.println("Ubicación: " + elem.getNomMun());
                    System.out.println("Obra: " + aux.getDato().getNomObra());
                    System.out.println("Autor: " + aux.getDato().getAutor());
                    System.out.println("Año de publicacion : " + aux.getDato().getApub());
                    System.out.println("--------------------");
                    
                    break;
                }
                
                aux = aux.getSig();
            }
           }
        if (!encontrado) {
                System.out.println("No se encontró la obra en ningun museo ");
            }
         while (!aux1.esvacia ())
            {
                elem = aux1.eliminar ();

                s.adicionar (elem);
            }}
    }
   public static void buscarLibroPorCodigo(CSimpleD s) {
        // Aquí debes tener acceso a las listas de bibliotecas, reemplaza "listaBibliotecas" por tu variable correspondiente
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del libro a buscar: ");
        String codigoBuscado = scanner.nextLine();
        boolean encontrado = false;
        Biblioteca elem;
         if (s.esvacia ())
            System.out.println ("Pila vacia");
        else
        {
            System.out.println ("\n Datos de la Pila ");
            CSimpleD aux1 = new CSimpleD ();
            while (!s.esvacia ())
            {
                elem = s.eliminar ();
                aux1.adicionar (elem);
                 NodoLibro aux=elem.getListaLibros().getP();
            while (aux != null) {
                if (aux.getDato().getCod().equalsIgnoreCase(codigoBuscado)) {
                    encontrado = true;
                    System.out.println("Biblioteca: " + elem.getNomMun());
                    System.out.println("Ubicación: " + elem.getDireccion());
                    System.out.println("Obra: " + aux.getDato().getCod());
                    System.out.println("Autor: " + aux.getDato().getAutor());
                    System.out.println("Año de publicacion : " + aux.getDato().getApub());
                    System.out.println("--------------------");
                    break;
                }
                
                aux = aux.getSig();
            }
        }
        
        if (!encontrado) {
            System.out.println("No se encontró ningún libro con el titulo buscado.");
        }
         while (!aux1.esvacia ())
            {
                elem = aux1.eliminar ();

                s.adicionar (elem);
            }
        }
    } 
   
    public static void buscarLibroPorAnio(CSimpleD s) {
        // Aquí debes tener acceso a las listas de bibliotecas, reemplaza "listaBibliotecas" por tu variable correspondiente
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el año del libro a buscar: ");
        int codigoBuscado = scanner.nextInt();
        boolean encontrado = false;
        Biblioteca elem;
         if (s.esvacia ())
            System.out.println ("Pila vacia");
        else
        {
            System.out.println ("\n Datos de la Pila ");
            CSimpleD aux1 = new CSimpleD ();
            while (!s.esvacia ())
            {
                elem = s.eliminar ();
                aux1.adicionar (elem);
                 NodoLibro aux=elem.getListaLibros().getP();
            
            while (aux != null) {
                if (aux.getDato().getApub()==codigoBuscado) {
                    encontrado = true;
                    System.out.println("Biblioteca: " + elem.getNomMun());
                    System.out.println("Ubicación: " + elem.getDireccion());
                    System.out.println("Obra: " + aux.getDato().getCod());
                    System.out.println("Autor: " + aux.getDato().getAutor());
                    System.out.println("Año de publicacion : " + aux.getDato().getApub());
                    System.out.println("--------------------");
                    break;
                }
                
                aux = aux.getSig();
            }
          
        }
        
        if (!encontrado) {
            System.out.println("No se encontró ningún libro publicado en ese año.");
        }
         while (!aux1.esvacia ())
            {
                elem = aux1.eliminar ();

                s.adicionar (elem);
            }
        }
    } 
   
    public static void buscarLibrosPorAutor (CSimpleD s) {
        // Aquí debes tener acceso a las listas de bibliotecas, reemplaza "listaBibliotecas" por tu variable correspondiente
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el autor del libro a buscar: ");
        String autor = scanner.next();
       boolean encontrado = false;
        Biblioteca elem;
         if (s.esvacia ())
            System.out.println ("Pila vacia");
        else
        {
            System.out.println ("\n Datos de la Pila ");
            CSimpleD aux1 = new CSimpleD ();
            while (!s.esvacia ())
            {
                elem = s.eliminar ();
                aux1.adicionar (elem);
                 NodoLibro aux=elem.getListaLibros().getP();
            while (aux != null) {
                if (aux.getDato().getAutor().equalsIgnoreCase(autor)) {
                    encontrado = true;
                    //biblioteca.mostrarBiblioteca();
                    System.out.println("Biblioteca: " + elem.getNomMun());
                    System.out.println("Ubicación: " + elem.getDireccion());
                    System.out.println("Obra: " + aux.getDato().getCod());
                    System.out.println("Autor: " + aux.getDato().getAutor());
                    System.out.println("Año de publicacion : " + aux.getDato().getApub());
                    System.out.println("--------------------");
                    break;
                }
                
                aux = aux.getSig();
            }
           
        }
        
        if (!encontrado) {
            System.out.println("No se encontraron libros publicados en el año buscado.");
        }
         while (!aux1.esvacia ())
            {
                elem = aux1.eliminar ();

                s.adicionar (elem);
            }
        }
    }
 
    
     public static void buscarObrasPorAnio(PilaA s) {
        // Aquí debes tener acceso a las listas de museos, reemplaza "listaMuseos" por tu variable correspondiente
          Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el año de publicación a buscar: ");
        int anioBuscado = scanner.nextInt();
       boolean encontrado = false;
            Museo elem;
        if (s.esvacia ())
            System.out.println ("Pila vacia");
        else
        {
            System.out.println ("\n Datos de la Pila ");
            PilaA aux1 = new PilaA ();
            while (!s.esvacia ())
            {
                elem = s.eliminar ();
                aux1.adicionar (elem);
                 NodoObras aux=elem.getListaObras().getP();
            while (aux != null) {
                if (aux.getDato().getApub() == anioBuscado) {
                    encontrado = true;
                    System.out.println("Museo: " + elem.getDireccion());
                    System.out.println("Ubicación: " + elem.getNomMun());
                    System.out.println("Obra: " + aux.getDato().getNomObra());
                    System.out.println("Autor: " + aux.getDato().getAutor());
                    System.out.println("Año de publicacion : " + aux.getDato().getApub());
                    System.out.println("--------------------");
                    break;
                }
                
                aux = aux.getSig();
            }
        }
        
        if (!encontrado) {
            System.out.println("No se encontraron obras de arte publicadas en el año buscado.");
        }
         while (!aux1.esvacia ())
            {
                elem = aux1.eliminar ();

                s.adicionar (elem);
            }
    } 
     }

}
     
    
    
  

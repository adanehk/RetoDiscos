package retodiscos;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    static int cont;
    static ArrayList<Disco> stock = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    
    

    public static void main(String[] args) {   
        rellenarStock();
        
        Tienda tienda = new Tienda();
        Disco disco = new Disco();
        // Disco disco = new Disco("Titulo 1", "Artista 1", "Ciudad 1", 101.0, "Genero 1", 1, "Sello 1");
        
        int opc;
        System.out.println("Bienvenido");
        do {
            System.out.println("\n1.Añadir disco\n2. Quitar disco\n3.Mostrar todos los discos");
            int res = input.nextInt();
            
            switch (res) {
                case 1:
                    System.out.println("Nombre del disco: ");
                    String nombre = input.next();
                    
                    System.out.println("Nombre del artista: ");
                    String artista = input.next();
                    
                    System.out.println("Discogrfica: ");
                    String discogrfica = input.next();
                    
                    System.out.println("Precio del disco: ");
                    double precio = input.nextDouble();
                    
                    System.out.println("Nombre del genero: ");
                    String genero = input.next();
                    
                    System.out.println("Número de canciones: ");
                    int numCanciones = input.nextInt();
                    
                    System.out.println("Formato: ");
                    String formato = input.next();
                    
                    Disco nuevoDisco = new Disco(nombre, artista, discogrfica, precio, genero, numCanciones, formato);
                    tienda.addDisco(nuevoDisco);
                    System.out.println("Has creado el disco " + nombre + " y lo has añadido al stock");
                    break;
                case 3:
                    System.out.println("Actualmente hay " disco);
                    System.out.println("Mostrar");
                    
                    for(int i = 0; i < stock.size(); i++) {
                        System.out.println(stock.get(i).toString());
                    }
                    break;
                default:
                    throw new AssertionError();
            }
            
        } while(true);
    
    }

    private static void rellenarStock() {
        stock.add(new Disco("Thriller", "Michael Jackson", "USA", 1200.50, "Pop", 10, "Epic"));
        stock.add(new Disco("Back in Black", "AC/DC", "Australia", 950.30, "Rock", 5, "Atlantic"));
        stock.add(new Disco("The Dark Side of the Moon", "Pink Floyd", "UK", 1100.00, "Progressive Rock", 8, "Harvest"));
        stock.add(new Disco("The Bodyguard", "Whitney Houston", "USA", 870.40, "R&B", 6, "Arista"));
        stock.add(new Disco("Rumours", "Fleetwood Mac", "UK", 920.10, "Rock", 7, "Warner Bros"));
        stock.add(new Disco("Saturday Night Fever", "Bee Gees", "UK", 830.75, "Disco", 9, "RSO"));
        stock.add(new Disco("Come On Over", "Shania Twain", "Canada", 780.60, "Country", 4, "Mercury"));
        stock.add(new Disco("Led Zeppelin IV", "Led Zeppelin", "UK", 990.00, "Rock", 5, "Atlantic"));
        stock.add(new Disco("Bad", "Michael Jackson", "USA", 880.25, "Pop", 11, "Epic"));
        stock.add(new Disco("Hotel California", "Eagles", "USA", 970.80, "Rock", 3, "Asylum"));
        
        stock.add(new Disco("21", "Adele", "UK", 650.40, "Pop", 12, "XL"));
        stock.add(new Disco("Abbey Road", "The Beatles", "UK", 1000.00, "Rock", 5, "Apple"));
        stock.add(new Disco("Metallica", "Metallica", "USA", 920.00, "Metal", 6, "Elektra"));
        stock.add(new Disco("Born in the U.S.A.", "Bruce Springsteen", "USA", 710.10, "Rock", 4, "Columbia"));
        stock.add(new Disco("Supernatural", "Santana", "USA", 680.50, "Latin Rock", 7, "Arista"));
        stock.add(new Disco("Hybrid Theory", "Linkin Park", "USA", 740.00, "Nu Metal", 6, "Warner Bros"));
        stock.add(new Disco("1989", "Taylor Swift", "USA", 610.20, "Pop", 15, "Big Machine"));
        stock.add(new Disco("Nevermind", "Nirvana", "USA", 930.00, "Grunge", 9, "DGC"));
        stock.add(new Disco("Divide", "Ed Sheeran", "UK", 560.00, "Pop", 14, "Asylum"));
        stock.add(new Disco("Purple Rain", "Prince", "USA", 850.30, "Rock", 5, "Warner Bros"));
        
        stock.add(new Disco("Ten", "Pearl Jam", "USA", 770.00, "Grunge", 6, "Epic"));
        stock.add(new Disco("Appetite for Destruction", "Guns N' Roses", "USA", 890.00, "Hard Rock", 7, "Geffen"));
        stock.add(new Disco("Born This Way", "Lady Gaga", "USA", 540.20, "Pop", 10, "Interscope"));
        stock.add(new Disco("Dangerous", "Michael Jackson", "USA", 820.00, "Pop", 8, "Epic"));
        stock.add(new Disco("Goodbye Yellow Brick Road", "Elton John", "UK", 760.00, "Rock", 4, "MCA"));
    }
}

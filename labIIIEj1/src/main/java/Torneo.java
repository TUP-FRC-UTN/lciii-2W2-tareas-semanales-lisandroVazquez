import java.util.Scanner;

public class Torneo {

    
    public static void main(String[] args) {
       
        Scanner Lector = new Scanner(System.in);
        
        System.out.println("Ingrese el equipo: ");
        String nombre = Lector.nextLine();
        
        System.out.println("Ingrese la cantidad de partidos ganados: ");
        int ganados = Lector.nextInt();
        
        System.out.println("Ingrese la cantidad de partidos empatados: ");
        int empatados = Lector.nextInt();
        
        System.out.println("Ingrese la cantidad de partidos perdidos: ");
        int perdidos = Lector.nextInt();
        
        System.out.println("Ingrese la posicion: ");
        int posicion = Lector.nextInt();
        
        System.out.println("Ingrese la cantidad de goles a favor: ");
        int golesFavor = Lector.nextInt();
        
        System.out.println("Ingrese la cantidad de goles en contra: ");
        int golesContra = Lector.nextInt();
        
        int puntos = (ganados*3 + empatados*1);
        
        Equipo e = new Equipo(nombre, puntos, ganados, empatados, perdidos, golesFavor, golesContra, posicion);
        System.out.println(e.toString());
    }
    
}

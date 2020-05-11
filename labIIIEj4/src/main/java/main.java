import java.util.Scanner;

public class main {

    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int cantidadLibros;
        System.out.println("Ingrese el total de libros almacenados: ");
        cantidadLibros = lector.nextInt();
        Biblioteca b = new Biblioteca(cantidadLibros);
        if(cantidadLibros != 0){
            for (int i = 0; i < cantidadLibros; i++){
                lector.nextLine();
                System.out.println("Ingrese el titulo: ");
                String titulo = lector.nextLine();
                System.out.println("Ingrese el precio: ");
                int precio = lector.nextInt();
                System.out.println("Ingrese el estado (1.Disponible 2.Prestado 3.Extraviado): ");
                int estado = lector.nextInt();
                System.out.println("Ingrese la cantidad de prestamos: ");
                int prestamos = lector.nextInt();
                
                Libro nuevoLibro = new Libro(titulo, precio, estado, prestamos);
                b.agregarLibro(nuevoLibro);
                
                if(prestamos != 0){
                    for (int j = 0; j < prestamos; j++){
                        lector.nextLine();
                        System.out.println("Nombre del solicitante: ");
                        String solicitante = lector.nextLine();
                        System.out.println("Ingrese cantidad de dias del prestamo:");
                        int cantidadDias = lector.nextInt();
                        System.out.println("Libro devuelto? (1.Si 2.No): ");
                        int devolucion = lector.nextInt();
                        
                        Prestamo nuevoPrestamo = new Prestamo(solicitante, cantidadDias, nuevoLibro.libroDevuelto(devolucion));
                        nuevoLibro.agregarPrestamo(nuevoPrestamo);
                    }
                }
                
            }
            System.out.println("\nCnatidad de libros por estado: " +b.cantidadLibros());
            System.out.println("\nDinero total extraviado: " +b.totalExtraviado());
            for (Libro libros : b.libros){
                System.out.println("\nPersonas que se llevaron el libro: \n"+libros.getTitulo()+"\n"+libros.listadoSolicitantes());
                
            }
            System.out.println("Promedio de prestamos: "+b.promedioPrestamo());
        }else{
            System.out.println("\nNo se ingreso ningun libro.");
        }
    }
    
}

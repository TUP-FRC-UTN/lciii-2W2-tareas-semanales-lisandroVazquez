import java.util.Scanner;

public class main {

    
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int cantidad;
        System.out.println("Ingrese la cantidad de clientes: ");
        cantidad = sc.nextInt();
        Cliente[] cl = new Cliente[cantidad];
        int acuEdad = 0;
        int contMay = 0;
        
        for(int i = 0; i < cl.length; i++){
            
            int numero;
            System.out.println("Ingrese el numero de cliente: "+(i+1));
            numero = sc.nextInt();
            
            String nombre;
            System.out.println("Ingrese el nombre: ");
            nombre = sc.nextLine();
            
            sc.nextLine();
            
            int antiguedad;
            System.out.println("Ingrese la antiguedad: ");
            antiguedad = sc.nextInt();
            
            String nombreMascota;
            System.out.println("Ingrese el nombre de la mascota: ");
            nombreMascota = sc.nextLine();
            
            int edadMascota;
            System.out.println("Ingrese la edad de la mascota: ");
            edadMascota = sc.nextInt();
            acuEdad += edadMascota;
            
            cl[i] = new Cliente(numero, nombre, antiguedad, nombreMascota, edadMascota);
            
        }
        System.out.println("Clientes registrados: "+cl.length);
        System.out.println("Promedio de edad de las mascotas: "+(double)acuEdad / cl.length + "años");
        
        for(int i = 0; i < cl.length; i++){
            if(cl[i] != null && cl[i].getAntiguedad()>5){
                contMay++;
            }
        }System.out.println("Hay "+contMay+ "clientes con mas de 5 años de antiguedad");
    }
    
}

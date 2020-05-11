
public class Cliente {
    
    int numero;
    String nombre;
    int antiguedad;
    String nombreMascota;
    int edadMascota;
    
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getAntiguedad(){
        return antiguedad;
    }
    public void setAntiguedad(int antiguedad){
        this.antiguedad = antiguedad;
    }
    public String getNombreMascota(){
        return nombreMascota;
    }
    public void setNombreMascota(String nombreMascota){
        this.nombreMascota = nombreMascota;
    }
    public int getEdadMascota(){
        return edadMascota;
    }
    public void setEdadMascota(int edadMascota){
        this.edadMascota = edadMascota;
    }
    
    public Cliente(int numero, String nombre, int antiguedad, String nombreMascota, int edadMascota){
        this.numero = numero;
        this.nombre = nombre;
        this.antiguedad = antiguedad;
        this.nombreMascota = nombreMascota;
        this.edadMascota = edadMascota;
    }
    
    @Override
    public String toString(){
        return "Clientes{"+"Numero de cliente: "+numero+", nombre: "+nombre+
                ", antiguedad: "+antiguedad+", Nombre de la mascota: "+nombreMascota+
                ", Edad de la mascota: "+edadMascota+'}';
    }
}

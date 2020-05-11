
public class Equipo {
    
    private String nombre;
    private int puntos;
    private int ganados;
    private int perdidos;
    private int empatados;
    private int golesFavor;
    private int golesContra;
    private int posicion;
    
    public Equipo(String nombre, int puntos, int ganados, int perdidos, int empatados, int golesFavor, int golesContra, int posicion){
        this.nombre = nombre;
        this.puntos = puntos;
        this.ganados = ganados;
        this.perdidos = perdidos;
        this.empatados = empatados;
        this.golesFavor = golesFavor;
        this.golesContra = golesContra;
        this.posicion = posicion;
    }
    
    public String getNombre(){
    return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getPuntos(){
    return puntos;
    }
    public void getPuntos(int puntos){
        this.puntos = puntos;
    }
    public int getGanados(){
    return ganados;
    }
    public void getGanados(int ganados){
        this.ganados = ganados;
    }
    public int getPerdidos(){
    return perdidos;
    }
    public void getPerdidos(int perdidos){
        this.perdidos = perdidos;
    }
    public int getEmpatados(){
    return empatados;
    }
    public void getEmpatados(int empatados){
        this.empatados = empatados;
    }
    public int getGolesFavor(){
    return golesFavor;
    }
    public void getGolesFavor(int golesFavor){
        this.golesFavor = golesFavor;
    }
    public int getGolesContra(){
    return golesContra;
    }
    public void getGolesContra(int golesContra){
        this.golesContra = golesContra;
    }
    public int getPosicion(){
    return posicion;
    }
    public void getPosicion(int posicion){
        this.posicion = posicion;
    }
    
    @Override
    public String toString(){
        return "Equipo: "+nombre+" "+"Puntos: "+puntos+" "+"Partidos ganados:"+ganados+
                " "+"Partidos perdidos: "+perdidos+" "+"Partidos empatados: "+empatados+
                " "+"Goles a favor: "+golesFavor+" "+"Goles en contra: "+golesContra+
                " "+"Posicion: "+posicion;
    }
}



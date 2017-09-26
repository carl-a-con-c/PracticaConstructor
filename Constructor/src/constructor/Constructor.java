package constructor;
//Autor Carla Gómez
public class Constructor {

    private String boleta;
    private String escuela;
    private String semestre;
    private String grupo;
    private String turno;
    
    public Constructor(String bol, String esc, String sem, String grup, String turn){
        this.boleta=bol;
        this.escuela=esc;
        this.semestre=sem;
        this.grupo=grup;
        this.turno=turn;
    }
}

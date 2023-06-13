public class Persona {
    private String profesion;
    private int edad;

    private String signo_zod;

    public Persona(){

    }

    public Persona(String profesion, int edad, String signo_zod) {
        this.profesion = profesion;
        this.edad = edad;
        this.signo_zod = signo_zod;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSigno_zod() {
        return signo_zod;
    }

    public void setSigno_zod(String signo_zod) {
        this.signo_zod = signo_zod;
    }

    // Metodos

    public void leer(){
        System.out.println("Este es el metodo leer");
    }
}

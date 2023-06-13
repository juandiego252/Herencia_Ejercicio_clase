import java.security.PublicKey;

public class Doctor extends Persona {
    private int horas_laborales;
    public Doctor(String profesion, int edad, String signo_zod, int horas_laborales) {
        super(profesion, edad, signo_zod);
        this.horas_laborales = horas_laborales;
    }

    public int getHoras_laborales() {
        return horas_laborales;
    }

    public void setHoras_laborales(int horas_laborales) {
        this.horas_laborales = horas_laborales;
    }

    public void examinar(){
        System.out.println("Este es el metodo examinar");
    }
}

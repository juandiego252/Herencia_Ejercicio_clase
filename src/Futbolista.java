public class Futbolista extends Persona{

    private int num_horas_entreno;

    public Futbolista(String profesion, int edad, String signo_zod, int num_horas_entreno) {
        super(profesion, edad, signo_zod);
        this.num_horas_entreno = num_horas_entreno;
    }

    public int getNum_horas_entreno() {
        return num_horas_entreno;
    }

    public void setNum_horas_entreno(int num_horas_entreno) {
        this.num_horas_entreno = num_horas_entreno;
    }

    public void correr(){

        System.out.println("Este es el metodo correr");
    }
}

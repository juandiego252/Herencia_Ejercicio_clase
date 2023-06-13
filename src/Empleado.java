public class Empleado extends Persona {
    private int telefono;
    public Empleado(String profesion, int edad, String signo_zod, int telefono) {
        super(profesion, edad, signo_zod);
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void tramitar(){

        System.out.println("Este es el metodo tramitar");
    }
}

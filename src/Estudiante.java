public class Estudiante extends Persona {
    private String semestre;

    public Estudiante(String profesion, int edad, String signo_zod, String semestre) {
        super(profesion, edad, signo_zod);
        this.semestre = semestre;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
}

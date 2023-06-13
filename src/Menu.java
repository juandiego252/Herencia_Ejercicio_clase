public class Menu {
    public static void main(String[] args) {
        Doctor ana = new Doctor("Doctora",33,"leo",8);
        Empleado pablo = new Empleado("Empleado Publico",0,"null",123456);
        Futbolista Maritza = new Futbolista("Futbolista",0,"null",5);
        Estudiante Melani = new Estudiante("Estudiante",0,"null","3er semestre");
        System.out.println("Ana es" + " " +ana.getProfesion());
        System.out.println("Tiene" + " " + ana.getEdad() + " " + "anios");
        ana.examinar();

        System.out.println("--------------------------");
        System.out.println();
        System.out.println("Pablo es" + " " + pablo.getProfesion());
        System.out.println("su telefono es:" + " " + pablo.getTelefono());
        pablo.tramitar();

        System.out.println("--------------------------");
        System.out.println();
        System.out.println("Maritza es" + " " + Maritza.getProfesion());
        System.out.println("Entrena:" + " " + Maritza.getNum_horas_entreno() + "horas" + " " + "diarias");
        Maritza.correr();

        System.out.println("--------------------------");
        System.out.println();
        System.out.println("Melani es" + " " + Melani.getProfesion());
        System.out.println("Esta en" + " " + Melani.getSemestre());
        Melani.leer();

    }
}

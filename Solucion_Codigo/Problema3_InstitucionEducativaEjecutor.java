package taller3poo;

public class Problema3_InstitucionEducativaEjecutor {

    public static void main(String[] args) {
        Problema3_InstitucionEducativaBase colegio = new Problema3_InstitucionEducativaBase();
       colegio.setNombre("Unidad Educativa Nacional");
        colegio.setTipoInstitucion("Fisco");
        colegio.setNumeroAlumnos(1200);
        colegio.setNumeroDocentes(80);
        colegio.setNumeroSedes(2);
        colegio.setGastoPorEstudiante(500);

        colegio.calcularPresupuesto();

        System.out.println(colegio);
    }
    
}

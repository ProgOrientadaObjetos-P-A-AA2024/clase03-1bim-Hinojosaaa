package paquete2;

import paquete1.InstitucionEducativa;

public class Principal {
    public static void main(String[] args) {
        /*Un objeto de tipo InstitucionEducativa*/
        String nombre = "UTPL", tipoInstitucion = "Particular";
        int numeroAlumnos = 10000, numeroDocentes = 8000, numeroSedes = 50;
        
        InstitucionEducativa il = new InstitucionEducativa();
        il.establecerNombre(nombre);
        il.establecerTipoInstitucion(tipoInstitucion);
        il.establecerNumeroAlumnos(numeroAlumnos);
        il.establecerNumeroDocentes(numeroDocentes);
        il.establecerNumeroSedes(numeroSedes);
        // System.out.printf("%s     ", i1.);
        
        System.out.printf("FICHA DE INSTITUCION:\n\nNombre de la Institucion: %s\n"
                + "Tipo de institucion: %s\n"
                +"Numero de alumnos: %d\nNumero de Docentes: %d\n"
                + "Numero de sedes: %d\n", il.obtenerNombre(), 
                il.obtenerTipoInstitucion(), il.obtenerNumeroAlumnos(),
                il.obtenerNumeroDocentes(), il.obtenerNumeroSedes());
    }
}

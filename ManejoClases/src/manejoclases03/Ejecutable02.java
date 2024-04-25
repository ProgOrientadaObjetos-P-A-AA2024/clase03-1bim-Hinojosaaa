/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases03;

/**
 *
 * @author reroes
 */
public class Ejecutable02 {
    
    public static void main(String[] args) {
    
        Hospital h1 = new Hospital();
        Hospital h2 = new Hospital();
        Hospital h3 = new Hospital();
        
        h1.establecerNombre("Vaca Ortíz");
        h2.establecerNombre("Militar");
        h3.establecerNombre("Manuel IM");
        
        /*obtenerNombre va a imptimirse con el String que fue inicializado aunque no se
        ponga nada dentro del parentesis, lo mismo con obtenerNumeroCamas y 
        obtenerPresupuesto que aunque no hayan sido inicializados con nada por defecto
        se inicializan con cero*/
        System.out.printf("%s - %d - %.2f\n", h1.obtenerNombre(),
                h1.obtenerNumeroCamas(), h1.obtenerPresupuesto());
        /*
        h1.establecerNombre("Hospital Vaca Ortíz");
        
        System.out.printf("%s - %d - %.2f\n", h1.obtenerNombre(),
                h1.obtenerNumeroCamas(), h1.obtenerPresupuesto());
        
        System.out.println("------------------");
        
        System.out.printf("%s - %d - %.2f\n", h2.obtenerNombre(),
                h2.obtenerNumeroCamas(), h2.obtenerPresupuesto());
        */
        
    }
}

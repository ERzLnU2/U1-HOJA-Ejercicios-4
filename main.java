/**

Diseña un programa Java de nombre ejercicio4 que cree un tipo enumerado para
los meses del año. El programa debe realizar las siguientes operaciones:

• Crear una variable m del tipo enumerado y asignarle el mes de marzo. 
  Mostrar por pantalla su valor.

• Asignar a la variable m, la cadena de texto "MARZO". 
  Mostrar por pantalla el valor de la variable de tipo enumerado tras realizar la asignación.

  @author Daw120
  
 */
package com.solomongo.ejercicio4_daw120;
public class Ejercicio4_DAW120 {
    public static void main(String[] args) {
     enum Meses {ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, 
     JULIO, AGOSTO,SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE};
     Meses m; 
     m = Meses.MARZO;
     System.out.println("\nLa variable m equivale a: "+m+"\n");
    }
}





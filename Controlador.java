/**
* @author: Karen Jimena Hernández Ortega
* @version: 26-sep-21
* @file: Controlador.java 
*Esta clase controla el programa y se encarga de las operaciones
**/
public class Controlador {
    /**
* Main del programa.
**/
private static Vista vista = new Vista();
    
public static void main(String[] args){
    int opcion;
    Combatiente com = null;

    vista.mensaje("--------------Simulador de luchas --------------");
    vista.mensaje("¿Qué desea hacer?");
   
    opcion = vista.menu();
   
   
       /**
       * Ciclo mientras la opcion no sea 8 que es salir, sigue corriendo.
       **/

    while(opcion != 5){
      switch(opcion)
      {
        case 1:  
        vista.tipoJugador();
        break;

        case 2:
        vista.tipoEnemigo();
        break;

        case 3:
        vista.tipoAtaquejugador();
        break;

        case 4:

        break; 

        case 5:
        //salir
        vista.mensaje("saliendo...");
        System.exit(0);
        break;
        
        //Se le avisa al usuario que no esta ingresando una opción correcta
        default: vista.mensaje("-Opcion invalida, porfavor ingrese una opción valida-");   break;

      } 
      opcion = vista.menu();
    }

}    
}

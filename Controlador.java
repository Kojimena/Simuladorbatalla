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


    vista.mensaje("------(ง •̀ゝ•́)ง--------Simulador de batalla --------(ง •̀ゝ•́)ง------");
    vista.mensaje("Instrucciones:"+ "\n" + " Usted debe elegir un tipo de jugador "+ "\n" + "-Explorador: debil pero más uso de items "+ "\n" +"-Guerrero: fuerte pero menos uso de items "+ "\n" +
                  " Luego de manera aleatoria se le asignará un enemigo "+ "\n" + "El jugador puede tomar el primer turno con la opción 3) y el enemigo con la opción 4)");
   
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
        vista.tipoAtaqueenemigo();
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

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

  //Título e Instrucciones
    vista.mensaje("\n" +"------(ง •̀ゝ•́)ง--------Simulador de batalla --------(ง •̀ゝ•́)ง------");
    vista.mensaje("Instrucciones:"+ "\n" + " Usted debe elegir un tipo de jugador "+ "\n" + "-Explorador: debil pero más uso de items "+ "\n" +"-Guerrero: fuerte pero menos uso de items "+ "\n" +
                  " Luego de manera aleatoria se le asignará un enemigo "+ "\n" + "El jugador puede tomar el primer turno con la opción 3) y el enemigo con la opción 4)");
   
    opcion = vista.menu(); //se llama la opción
   
   
       /**
       * Ciclo mientras la opcion no sea 5 que es salir, sigue corriendo.
       **/

    while(opcion != 5){
      switch(opcion)
      {
        case 1:  
        //tipo de jugador , se muestra el menú
        vista.tipoJugador();
        break;

        case 2:
        //Tipo enemigo que es elegido al azar
        vista.tipoEnemigo();
        break;

        case 3:
        //Turno y tipo de ataque que hará el jugador
        vista.tipoAtaquejugador();
        break;
      
        case 4:
        //Turno y tipo de Ataque del enemigo 
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

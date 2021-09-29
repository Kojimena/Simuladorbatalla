 /**
* @author: Karen Jimena Hernández Ortega
* @version: 26-sep-21
* @file: Guerrero.java 
*Creación de Guerrero y sus propiedades/ hereda de Jugador
**/
public class Guerrero extends Jugador {
    
    public Guerrero(){
        super("Guerrero", 40, 10); //usa el constructor de Jugador
        sonido= "El guerrero soy yo:)";
  
    }

	// Override de método recuperarvida para los Guerreros es de 20
	//* return vida 
    public int recuperarVida(){
		if (vida<0){
			vida = 10;
		}else{
            vida= vida+20;
        }
		return vida; 
	}

}

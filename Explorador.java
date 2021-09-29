 /**
* @author: Karen Jimena Hernández Ortega
* @version: 26-sep-21
* @file: Explorador.java 
*Creación de Explorador y sus propiedades/ hereda de Jugador
**/
class Explorador extends Jugador{
    public Explorador(){
        super("Explorador", 30, 5); //usa el constructor de Jugador
        sonido= "Explorador al ataque!!!";
	
    }

	// Override de método recuperarvida para los exploradores es de 5 
	//* return vida 
    public int recuperarVida(){
		if (vida<0){
			vida = 10;
		}else{
            vida= vida+5;
        }
		return vida; 
	}


}

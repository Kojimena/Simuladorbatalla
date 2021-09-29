 /**
* @author: Karen Jimena Hernández Ortega
* @version: 26-sep-21
* @file: Jugador.java 
*Creación de Jugador y sus propiedades/ hereda de Combatiente
**/
class Jugador extends Combatiente {

    /*Constructor Jugador
	* @param nombre, vida, ataque 
	*/
	public Jugador(String nom, int vida, int ataque){
        super();
        this.nombre = nom;
        this.vida= vida;
		this.ataque = ataque;
		sonido= "hip hip hip!!!";
    }

    // Override de método atacar2 para el jugador el daño es de *2
	public int atacar2() {
		int daño = 0;
		if(ataque > 0){
			daño = ataque * 2;
		}
		
		return daño;
	}

	// Override de método recuperarvida para los jugadores es de 10
	//* return vida 
	public int recuperarVida(){
		if (vida<0){
			vida = 10;
		}else{
            vida= vida+10;
        }
		return vida; 
	}

    
    //Datos
	//Mostrar en pantalla los datos 
	public void mostrar(){
		System.out.println("Nombre: "+nombre+" Ataque: "+ ataque+ " Vida: "+ vida +" "+ "Estado:"+ estado+" "+ "mensaje:"+ sonido);
	}
}

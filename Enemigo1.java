 /**
* @author: Karen Jimena Hernández Ortega
* @version: 26-sep-21
* @file: Enemigo1.java 
*Creación de Enemigo1 y sus propiedades
**/
 class Enemigo1 extends Combatiente{
    
    /*Constructor
	* @param nombre y vida 
	*/
	public Enemigo1(String nom, int vida){
		super();
        this.nombre = nom;
        this.vida =vida;
        sonido = "A LA GUERRAAAA!!";

	
	}

    //metodo atacar Override, se multiplica el ataque *2
	public int atacar2() {
		int daño = 0;
		if(ataque > 0){
			daño = ataque * 2;
		}
		
		return daño;
	}



    //Datos
	//Mostrar en pantalla los datos 
	public void mostrar(){
		System.out.println("Nombre: "+nombre+" Ataque: "+ ataque+ " Vida: "+ vida +" "+ "Estado:"+ estado+" "+ "mensaje:"+ sonido);
	}


}

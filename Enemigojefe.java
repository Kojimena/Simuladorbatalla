 /**
* @author: Karen Jimena Hernández Ortega
* @version: 26-sep-21
* @file: Enemigojefe.java 
*Creación de Enemigojefe y sus propiedades/ hereda de enemigo1
**/
class Enemigojefe extends Enemigo1{

    public Enemigojefe(){
        super("Jefe", 40);
        sonido= "Soy el jefe, y tú quieres pelea??";
    }

    //Override método atacar2, para el jefe el daño es *3
	public int atacar2() {
		int daño = 0;
		if(ataque > 0){
			daño = ataque * 3;
		}
		
		return daño;
	}
	//Override método envenenar, para el jefe el daño es *2
	public int Envenenar(){
		int contador = 0;
		int daño = 0;
		if(ataque > 0 &&  contador!= 3){
			daño = ataque * 2;
			contador= contador+1;
		}
		return daño;
	}


    //Datos
	//Mostrar en pantalla los datos 
	public void mostrar(){
		System.out.println("Nombre: "+nombre+" Ataque: "+ ataque+ " Vida: "+ vida +" "+ "Estado:"+ estado+" "+ "mensaje:"+ sonido);
	}
}

 /**
* @author: Karen Jimena Hernández Ortega
* @version: 26-sep-21
* @file: Enemigojefe2.java 
*Creación de Enemigojefe2 y sus propiedades/ hereda de enemigo2
**/
public class Enemigojefe2 extends Enemigo2 {
   
   public Enemigojefe2(){ 
    super("Jefe2", 50);
    sonido= "Soy el jefe, y tú quieres pelea??";

    }

   //Override método atacar2, para el jefe2 el daño es *4
	public int atacar2() {
		int daño = 0;
		if(ataque > 0){
			daño = ataque * 4;
		}
		
		return daño;
	}

	//Override método magiaobscura, para el jefe2 el daño es *3
	public int Magiaobscura(){
		int daño = 0;
		if(ataque > 0){
			daño = ataque * 3;
		}
		
		return daño;
	}

    //Datos
	//Mostrar en pantalla los datos 
	public void mostrar(){
		System.out.println("Nombre: "+nombre+" Ataque: "+ ataque+ " Vida: "+ vida +" "+ "Estado:"+ estado+" "+ "mensaje:"+ sonido);
	}
}

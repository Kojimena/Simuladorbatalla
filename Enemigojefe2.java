public class Enemigojefe2 extends Enemigo2 {
   
   public Enemigojefe2(){ 
    super("Jefe", 30);
    sonido= "Soy el jefe, y tú quieres pelea??";
    }

    //metodos
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

public class Guerrero extends Jugador {
    
    public Guerrero(){
        super("Guerrero", 40, 10);
        sonido= "El guerrero soy yo:)";
  
    }


    //Datos
	//Mostrar en pantalla los datos 
	public void mostrar(){
		System.out.println("Nombre: "+nombre+" Ataque: "+ ataque+ " Vida: "+ vida +" "+ "Estado:"+ estado+" "+ "mensaje:"+ sonido);
	}
}

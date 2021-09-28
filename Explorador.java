class Explorador extends Jugador{
    public Explorador(){
        super("Explorador", 10, 10);
        sonido= "Explorador al ataque!!!";
    }

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

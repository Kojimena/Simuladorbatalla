class Jugador extends Combatiente {

    /*public Jugador(String nom, int vida){
        super();
        this.nombre = nom;
        this.vida= vida;
    }*/

	public Jugador(String nom, int vida, int ataque){
        super();
        this.nombre = nom;
        this.vida= vida;
		this.ataque = ataque;
		sonido= "hip hip hip!!!";
    }

    //metodos
	public int atacar2() {
		int daño = 0;
		if(ataque > 0){
			daño = ataque * 2;
		}
		
		return daño;
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

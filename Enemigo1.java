 class Enemigo1 extends Combatiente{
    
    //Constructor
	public Enemigo1(String nom, int vida){
		super();
        this.nombre = nom;
        this.vida =vida;
        sonido = "A LA GUERRAAAA!!";

	
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

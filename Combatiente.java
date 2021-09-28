/**
* @author: Karen Jimena Hernández Ortega
* @version: 26-sep-21
* @file: Combatiente.java 
*Clase combatienete
**/

import java.util.Random;

public abstract class Combatiente {
    protected String nombre, sonido;
    protected int ataque, vida;
    protected String estado;
    private Random rand;

    public Combatiente(){   
    rand = new Random();
    ataque = rand.nextInt(5)+1 ;
    estado= "Vivo";
    }

    public String getSonido(){
        return sonido;
    }

    public int getAtaque() {
		return ataque;
	}	

    public int getVida() {
		return vida;
	}	

    public String getNombre(){
		return nombre;
	}

    //metodos
	public int atacar(){
		int daño = 0;
		
		if(ataque > 0){
			daño = ataque;
		}
		
		return daño;
	}

    public int gemaDesastroza(){
		int daño = 0;
		if(ataque > 0){
			daño = ataque -5;
		}
		
		return daño;
	}

    public void recibirdaño(int puntos){
		vida -= puntos;
        if (vida <= 0){
            estado = "derrotado";
        }
	}

    public int recuperarVida(){
		if (vida<0){
			vida = 10;
		}else{
            vida= vida+10;
        }
		return vida; 
	}

    //Sera sobreescrito
	public abstract int atacar2();

    //Datos
	//Mostrar en pantalla los datos 
	public void mostrar(){
		System.out.println("Nombre: "+nombre+" Ataque: "+ ataque+ " Vida: "+ vida +" "+ "Estado:"+ estado+" "+ "Mensaje:"+ sonido);
	}






}

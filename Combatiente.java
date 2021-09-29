/**
* @author: Karen Jimena Hernández Ortega
* @version: 26-sep-21
* @file: Combatiente.java 
*Clase combatienete/clase madre 
**/

import java.util.Random;
import java.util.ArrayList; //imports

public abstract class Combatiente {
	//propiedades protected 
    protected String nombre, sonido;
    protected int ataque, vida;
    protected String estado;
    private Random rand;
	protected ArrayList<String> sonidogolpes = new ArrayList<String>();
	
	//Constructor sin parametros
    public Combatiente(){   
    rand = new Random();
    ataque = rand.nextInt(5)+1 ; //el ataque será un número random para todos los combatientes 
    estado= "Vivo";
    }

   /**
    * getter
    * @return sonido
    */
    public String getSonido(){
        return sonido;
    }

	/**
    * getter
    * @return ataque
    */
    public int getAtaque() {
		return ataque;
	}	

	/**
    * getter
    * @return vida
    */
    public int getVida() {
		return vida;
	}	

	/**
    * getter
    * @return nombre
    */
    public String getNombre(){
		return nombre;
	}

	/**
    * getter de un sonido de Combatiente random al ser golpeado
    * @return String
    */
	public String getSonidogolpe(){
		sonidogolpes.add("Auch");
		sonidogolpes.add("*cries in spanish*");
		sonidogolpes.add("snif snif ");
		sonidogolpes.add("no puede ser");
		sonidogolpes.add("nooooo");
		sonidogolpes.add("necesito vida");
		String r = sonidogolpes.get(rand.nextInt(sonidogolpes.size()));
        return (r);
    }
		

	/**
    * Método atacar, devuelve un daño normal
    * @return int
    */
	public int atacar(){
		int daño = 0;
		
		if(ataque > 0){
			daño = ataque;
		}
		
		return daño;
	}

	/**
    * Método gemaDesastroza, devuelve un daño de -5
    * @return int
    */
    public int gemaDesastroza(){
		int daño = 0;
		if(ataque > 0){
			daño = ataque -5;
		}
		
		return daño;
	}

	/**
    * Método Envenenar, devuelve un daño de *3
    * @return int
    */
	public int Envenenar(){
		int contador = 0;
		int daño = 0;
		if(ataque > 0 &&  contador!= 3){
			daño = ataque * 3;
			contador= contador+1;
		}
		return daño;
	}

	/**
    * Método Magiaobscura, devuelve un daño normal
    * @return int
    */
	public int Magiaobscura(){
		int daño = 0;
		if(ataque > 0){
			daño = ataque * 1;
		}
		
		return daño;
	}

	// método que recibe el daño de los enemigos o combatientes
    public void recibirdaño(int puntos){
		vida -= puntos;
        if (vida <= 0){
            estado = "derrotado";
        }
	}

	/**
    * Método recuperarVida, devuelve la vida + 10 extras
    * @return int
    */
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

/**
* @author: Karen Jimena Hernández Ortega
* @version: 26-sep-21
* @file: Combatiente.java 
*Clase combatienete
**/

import java.util.Random;
import java.util.ArrayList; // 

public abstract class Combatiente {
    protected String nombre, sonido;
    protected int ataque, vida;
    protected String estado;
    private Random rand;
	protected ArrayList<String> sonidogolpes = new ArrayList<String>();
	

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

	public int Envenenar(){
		int contador = 0;
		int daño = 0;
		if(ataque > 0 &&  contador!= 3){
			daño = ataque * 3;
			contador= contador+1;
		}
		return daño;
	}

	public int Magiaobscura(){
		int daño = 0;
		if(ataque > 0){
			daño = ataque * 1;
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

/**
* @author: Karen Jimena Hernández Ortega
* @version: 26-sep-21
* Esta clase es la vista del programa.Imprime resultados y pide datos.
**/

//imports
import java.util.Scanner;
import java.util.InputMismatchException; 
import java.util.Random;

public class Vista {
    Scanner scan = new Scanner(System.in);
    private Combatiente enemigo, jugador;
    private Random rand = new Random();
    int opcion;
	
    /**
    * Despliega el menú de opciones para el usuario. Luego, recibe la opción elegida por el usuario y la devuelve.
    * @return La opción elegida por el usuario
    */

    public int menu(){
		int opcion;
                mensaje("\n" +"¿Qué desea hacer?");
                System.out.println("1. Nuevo Jugador");
                System.out.println("2. Nuevo Enemigo");
                System.out.println("3. Batalla, turno del jugador");
                System.out.println("4. Batalla, turno del enemigo");
                System.out.println("5. Salir del simulador batalla ");

                System.out.print("Seleccion: ");
            try {
                opcion = scan.nextInt();
            
            } catch (InputMismatchException e) {
                mensaje("Porfavor, ingrese una opción válida");
                Scanner scan = new Scanner(System.in);
                opcion = scan.nextInt();
            
            }
        
		scan.nextLine();
		return opcion;
    }

    /**
    * @param: String
    * imprime mensajes
    **/ 
    public void mensaje(String mensaje){
        System.out.println(mensaje);
    }

    public String getName(){
        System.out.printf("\nIngrese el nombre del jugador: ");

        String nombre = scan.nextLine();

        return nombre;
    }

    public Combatiente tipoEnemigo(){		
		int aux = rand.nextInt(3);
		
		switch(aux){
			case 0:
				enemigo = new Enemigo1("Enemigo1",10);
				break;
			case 1:
				enemigo = new Enemigo2("Enemigo1",20);
				break;
			case 2:
				enemigo = new Enemigojefe();
				break;
		}
        mensaje("Se ha generado el siguiente combatiente");
        enemigo.mostrar();
        return enemigo;
    }

    
    public Combatiente tipoJugador(){		
		int opcion;
        mensaje("----OPCIONES----");
        mensaje("1. Explorador");
        mensaje("2. Guerrer@");
        mensaje("Elige tu Jugador: ");
		opcion = scan.nextInt();

		switch(opcion){
			case 1:
				jugador = new Explorador();
				break;
			case 2:
				jugador = new Guerrero();
				break;

		}
        mensaje("Se ha generado el siguiente jugador:");
        jugador.mostrar();
        mensaje("-Agregue un enemigo para batallar con la opción 2-");
        return jugador;
    }

    public void tipoAtaquejugador(){
        boolean disponible = true;
        int opcion;
    do{
        enemigo.mostrar();
		jugador.mostrar();
        
        do{
            System.out.println("Elige que ataque realizar: ");
            System.out.println("1) Item -Gema desastroza-. Poder: "+(jugador.getAtaque()-5));
            System.out.println("2) Item -Rayo laser-. Poder: "+(jugador.getAtaque()*2));
            System.out.println("3) Item -Recuperar vida-");
            System.out.println("4). Pasar turno");
            System.out.println("5). Salir");

        System.out.print("Seleccion: ");
        try {
        opcion = scan.nextInt();
    
        } catch (InputMismatchException e) {
        mensaje("Porfavor, ingrese una opción válida");
        Scanner scan = new Scanner(System.in);
        opcion = scan.nextInt();
        }
    }while(opcion < 0 || opcion > 5);
    switch(opcion){
        case 1:
            enemigo.recibirdaño(jugador.gemaDesastroza());
            mensaje("El enemigo ha dicho:" + enemigo.getSonidogolpe());
            break;
        case 2:
            enemigo.recibirdaño(jugador.atacar2());
            mensaje("El enemigo ha dicho:" + enemigo.getSonidogolpe());
            break;
        case 3:
            jugador.recuperarVida();
            break;
        case 4:
            mensaje("Se le ha pasado el turno al enemigo");
            tipoAtaqueenemigo();
            break;
        case 5:
            mensaje("saliendo de la batalla, adiós");
            System.exit(0);

    }if (enemigo.getVida()<=0){
        mensaje("El enemigo ha muerto, ha finalizado la batalla");
        break;
    }
    }while(jugador.getVida() > 0 && disponible);
    }

    public void tipoAtaqueenemigo(){
        boolean disponible = true;
        int opcion;
    do{
        enemigo.mostrar();
		jugador.mostrar();
        
        do{
            System.out.println("Elige que ataque realizar: ");
            System.out.println("1) Envenenar. Poder de ataque: "+(enemigo.getAtaque()*3));
            System.out.println("2) Magia obscura. Poder de ataque: "+enemigo.getAtaque());
            System.out.println("3) Recuperar vida");
            System.out.println("4). Pasar turno");
            System.out.println("5). Salir");

        System.out.print("Seleccion: ");
        try {
        opcion = scan.nextInt();
    
        } catch (InputMismatchException e) {
        mensaje("Porfavor, ingrese una opción válida");
        Scanner scan = new Scanner(System.in);
        opcion = scan.nextInt();
        }
    }while(opcion < 0 || opcion > 5);
    switch(opcion){
        case 1:
            jugador.recibirdaño(enemigo.Envenenar());
            mensaje("El jugador ha dicho:" + jugador.getSonidogolpe());
            break;
        case 2:
            jugador.recibirdaño(enemigo.Magiaobscura());
            mensaje("El jugador ha dicho:" +jugador.getSonidogolpe());
            break;
        case 3:
            enemigo.recuperarVida();
            break;
        case 4:
            mensaje("Se le ha pasado el turno al Jugador");
            tipoAtaquejugador();
            break;
        case 5:
            mensaje("saliendo de la batalla, adiós");
            System.exit(0);
            break;
    }if (jugador.getVida()<=0){
        mensaje("El Jugador ha muerto, lo han derrotado y ha finalizado la batalla");
        break;
    }
    }while(enemigo.getVida() > 0 && disponible);
    }








}
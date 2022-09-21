package concursantes;
//4. Quiz #6
//Existen participantes de un campeonato de algun deporte de su elección. Dichos participantes poseen un nombre, 
//la cantidad de juegos realizados y la cantidad de puntos obtenidos a la fecha. 
//Si se quiere imprimir un ranking este debe ser en forma ascendente por la cantidad de juegos y segundo, descendente por la cantidad de puntos. 

import java.util.ArrayList;
import java.util.Collections;

public class Participantes implements Comparable<Participantes>{

    private String name;
    private int points;
    private int games;

    public Participantes (String name, int points, int games){
        this.name = name;
        this.points = points;
        this.games = games;

    }

    public int getPoints(){
        return this.points;
    }

    public int getGames(){
        return this.games;
    }

    @Override
    public int compareTo(Participantes o) {

        if (this.getGames()==o.getGames()) return 0;

        else if (this.getGames() > o.getGames()) return 1;

        else return -1;
        
    }

    /**
     * @param args
     */
    public static void main (String[] args) {

        Participantes p1 = new Participantes("maria", 23, 11); 
        Participantes p3 = new Participantes("ana",23 , 13);
        Participantes p4 = new Participantes("maria", 23, 13);
        Participantes p7 = new Participantes("lucia", 25, 15);
        Participantes p5 = new Participantes("laura", 19, 13);
        Participantes p2 = new Participantes("kristel", 21, 11 );
        Participantes p6 = new Participantes("jonny", 27, 15);


        ArrayList<Participantes> array = new ArrayList<Participantes>();
        array.add(p1);
        array.add(p2);
        array.add(p3);
        array.add(p4);
        array.add(p5);
        array.add(p6);
        array.add(p7);

        for (Participantes p: array){
            System.out.println(p.name+ " "+ p.games + " " + p.points);
        }

        Collections.sort(array);

        System.out.println("-----------------------------");
        for (Participantes p: array){
            System.out.println(p.name+ " "+ p.games + " " + p.points);

        }




    
}

}
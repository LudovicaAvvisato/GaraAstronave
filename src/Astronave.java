import java.util.Scanner;

public class Astronave implements Runnable{
    int id;
    GiudiceDiGara giudice;
    int vel;

    public Astronave(int id,GiudiceDiGara giudice, int per, int vel ){
        this.id=id;
        this.giudice=giudice;
        this.vel=vel;
    }


    @Override
    public void run(){
            System.out.println("Sono l'astronave nr: "+ this.id);
            int distPer=0;
            while(distPer<giudice.percorso){

            }

    }

    public void gioca(){

    }


}

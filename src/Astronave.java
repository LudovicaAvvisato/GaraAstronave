import java.util.Scanner;

public class Astronave implements Runnable{
    int id;
    GiudiceDiGara giudice;
    int vel=50;

    public Astronave(int id,GiudiceDiGara giudice ){
        this.id=id;
        this.giudice=giudice;
        this.vel=vel;
    }


    @Override
    public void run() {
        System.out.println("Sono l'astronave nr: " + this.id);
        int distPer = 0;
        while (distPer < giudice.percorso) {
            distPer += vel;
            System.out.println(distPer);
            try {
                Thread.sleep(3600);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }


    }}
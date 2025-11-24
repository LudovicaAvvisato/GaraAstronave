import java.util.Scanner;

public class Astronave implements Runnable{
    int id;
    GiudiceDiGara giudice;
    int per;
    int vel;

    public Astronave(int id,GiudiceDiGara giudice, int per, int vel ){
        this.id=id;
        this.giudice=giudice;
        this.per=per;
        this.vel=vel;
    }
    
    @Override
    public void run(){
            System.out.println("Sono l'astronave nr: "+ this.id);
            gioca();

    }

    public void gioca(){

    }

    /*public int calcoloP(){
        return per*vel;
    }*/
}

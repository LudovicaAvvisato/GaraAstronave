import java.util.Scanner;

public class Astronave implements Runnable{
    int id;
    GiudiceDiGara giudice;
    public Astronave(int id,GiudiceDiGara giudice ){
        this.id=id;
        this.giudice=giudice;
    }
    
    @Override
    public void run(){
            System.out.println("Sono l'astronave nr: "+ this.id);
            gioca();

    }

    public void gioca(){

    }
}

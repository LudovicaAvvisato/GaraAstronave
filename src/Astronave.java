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
            try {
                sleep(3600);
            } catch (InterruptedException e) {
                System.out.println("Errore nella transizione da Running a sleeping");
            }
    }
}

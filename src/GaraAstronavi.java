import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

//Non funziona perdettamente
public class GaraAstronavi {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero partecipanti: ");
        int num = sc.nextInt();

        System.out.print("Lunghezza percorso: ");
        int lunghezza = sc.nextInt();
        sc.nextLine();

        List<String> nomi = new ArrayList<>();
        List<Integer> velocitaList = new ArrayList<>();


        for (int i = 1; i <= num; i++) {
            System.out.print("Nome astronave " + i + " : ");
            String nome = sc.nextLine();
            nomi.add(nome);

            System.out.print("Velocità astronave " + i + " : ");
            int vel = sc.nextInt();
            sc.nextLine();
            velocitaList.add(vel);
        }

        if (nomi.size() == num && velocitaList.size() == num) {
            Percorso percorso = new Percorso(lunghezza);
            Giudice giudice = new Giudice();
            List<Astronave> astronavi = new ArrayList<>();

            for (int i = 0; i < num; i++) {
                Astronave a = new Astronave(nomi.get(i), velocitaList.get(i), percorso, giudice);
                astronavi.add(a);
                a.start();
            }

            giudice.inizioGara();

            for (Astronave a : astronavi) a.join();

            System.out.println(" Gara terminata!");
        }
    }
}

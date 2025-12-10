public class Giudice {
    private boolean garaConclusa = false;

    public synchronized boolean isGaraConclusa() {
        return garaConclusa;
    }

    public synchronized void arrivo(Astronave a) {
        if (!garaConclusa) {
            garaConclusa = true;
            System.out.println( a.getName() + " ha vinto la gara!");
        }
    }

    public void inizioGara() {
        System.out.println("3...2...1...Via!");
    }
}
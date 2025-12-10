class Astronave extends Thread {
    private  Percorso percorso;
    private  Giudice giudice;
    private  int velocita;
    private int distanzaPercorsa = 0;

    public Astronave(String nome, int velocita, Percorso percorso, Giudice giudice) {
        super(nome);
        this.velocita = velocita;
        this.percorso = percorso;
        this.giudice = giudice;
    }

    @Override
    public void run() {
        try {
            while (distanzaPercorsa < percorso.getLunghezza()) {
                Thread.sleep(1000);
                distanzaPercorsa += velocita;
                if (distanzaPercorsa > percorso.getLunghezza()) distanzaPercorsa = percorso.getLunghezza();
                System.out.println(getName() + " ha percorso: " + distanzaPercorsa + "/" + percorso.getLunghezza());
            }
            if (!giudice.isGaraConclusa()) {
                giudice.arrivo(this);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
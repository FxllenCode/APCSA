public class BirdSimulation {
    private int wormCount;
    private double lateBirdOdds;

    public BirdSimulation(int wormCount, double lateBirdOdds) {
        this.wormCount = wormCount;
        this.lateBirdOdds = lateBirdOdds;
    }

    private boolean becomeLate() {
        if (Math.random() < lateBirdOdds) {
            return true;
        }
        return false;
    }

    public boolean simulate() {
        for (int i = 0; i < wormCount; i++) {
            if (becomeLate()) {
                return false;
            }
        }

        return true;
    }

    public double runSimulations(int num) {
        int success = 0;
        for (int i = 0; i < num; i++) {
            success += simulate() ? 1 : 0;
        }

        return (double) success / num;
    }
}

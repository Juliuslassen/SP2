public class DieselCar extends AFuelCar {

    private int registrationFee=0;
    private boolean particelFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, float kmPrLitre, boolean particelFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.particelFilter = particelFilter;
    }

    boolean hasParticleFilter() {
        return particelFilter;
    }

    public void setParticleFilter(boolean particelFilter) {
        this.particelFilter = particelFilter;
    }

    @Override
    public String getFuelType() {
        return "Diesel";
    }

    // UDREGNESEFTER BESKRIVELSEN ØVERST I OPGAVEN
    @Override
    public int getRegistrationFee() {
        float kmPrLitre = super.getKmPrLitre();
        // mellem 20 og 50 = 330kr.
        if (kmPrLitre >= 20) {
            registrationFee = 330 + 130;
        }
        // mellem 15 og 20 = 1050kr.
        else if (kmPrLitre >= 15 ) {
            registrationFee = 1050 + 1390;
        }
        //mellem 10 og 15 = 2340kr.
        else if (kmPrLitre >= 10 ) {
            registrationFee = 2340 + 1850;
        }
        //mellem 5 og 10 = 5500kr.
        else if (kmPrLitre >= 5 ) {
            registrationFee = 5500 + 2770;
        }
        //under 5 = 10470kr.
        else {
            registrationFee = 10470 + 15260;
        }
        if (hasParticleFilter()) {
            registrationFee += 1000;
        }
        return registrationFee;
    }

    @Override
    public String toString() {
        return "Car is a " + make +
                " with a dieselengine.\nThe model: " + model
                + " with " + numberOfDoors + " doors \n" +
                "the licensplate is: " + registrationNumber +
                ". \nThe car goes " + kmPrLitre +
                " km/L. \n" +
                "The registrationfee is " + getRegistrationFee() + "\n";
    }
}


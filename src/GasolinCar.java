public class GasolinCar extends AFuelCar {

    private int registrationFee;

    public GasolinCar(String registrationNumber, String make, String model, int numberOfDoors, float kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.registrationFee = registrationFee;
    }

    @Override
    public String getFuelType() {
        return "Gasolin";
    }



    // VIRKER INTA ""class must either declare abstract or implement abstract method"
    @Override
    public int getRegistrationFee() {
        float kmPrLitre = super.getKmPrLitre();
        // mellem 20 og 50 = 330kr.
        if (kmPrLitre >= 20) {
            registrationFee = 330;
        }
        // mellem 15 og 20 = 1050kr.
        else if (kmPrLitre >= 15) {
            registrationFee = 1050;
        }
        //mellem 10 og 15 = 2340kr.
        else if (kmPrLitre >= 10) {
            registrationFee = 2340;
        }
        //mellem 5 og 10 = 5500kr.
        else if (kmPrLitre >= 5) {
            registrationFee = 5500;
        }
        //under 5 = 10470kr.
        else {
            registrationFee = 10470;
        }
        return registrationFee;
    }

    @Override
    public String toString() {
        return "Car is a " + make +
                " with a benzin engine. The model: " + model + " with " + numberOfDoors + " doors \'" +
                "the licens plate is: " + registrationNumber +
                ". The car goes " + kmPrLitre +
                " km/L. \n" +
                "The registrationfee is " + getRegistrationFee() + "\n";
    }
}

public class ElectricCar extends ACar{

    private int batteryCapacity;
    private int maxRange;
    private float whPrKm;
    private int kmPrLitre;
    private int registrationFee;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity=batteryCapacity;
        this.maxRange=maxRange;
    }

    public int getBatteryCapacityKWh(){
        return batteryCapacity;
    }

    public int getMaxRangeKM(){
        return maxRange;
    }

    public float getWhPrKm(){
        whPrKm = (getBatteryCapacityKWh()*1000) / getMaxRangeKM();
        return whPrKm;
    }

    public int getRegistrationFee() {
        kmPrLitre = (int)Math.floor(100 / (getWhPrKm() / 91.25) );

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
        return  "The car is a " + make +
                " with a electric engine. \nThe model: " + model
                + " with " + numberOfDoors + " doors \n" +
                "the licens plate is: " + registrationNumber +
                ". \nThe car goes " + kmPrLitre + " km/L with batterycapacity of "
                + batteryCapacity +
                " and a max range of " + maxRange + ". \n" +
                "The registrationfee is " + getRegistrationFee() + "\n";
    }
}

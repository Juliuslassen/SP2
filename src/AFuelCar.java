public abstract class AFuelCar extends ACar{

    public float kmPrLitre;

    public int maxRange;

    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, float kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPrLitre=kmPrLitre;
    }

    public abstract String getFuelType();

    public float getKmPrLitre() {
        return kmPrLitre;
    }

    @Override
    public String toString() {
        return  "The car goes " + kmPrLitre +
                " km/L, with a max range of " + maxRange;
    }
}

public class Main {
    public static void main(String[] args) {

    ElectricCar eCar = new ElectricCar("Ejohnny", "Tesla","Den hurtigeste",5,75,430);

    Car dCar = new DieselCar("tyvm","Mercedes","S",3,10,true);

    GasolinCar hurtigbil = new GasolinCar("JacksBil", "mitsubishi","L200",4,7);

    FleetOfCars myGarage = new FleetOfCars();

    myGarage.addCar(dCar);
    myGarage.addCar(eCar);
    myGarage.addCar(hurtigbil);


    //System.out.println(eCar.toString());
    //System.out.println(dCar.toString());

    System.out.println(myGarage);

    }
}
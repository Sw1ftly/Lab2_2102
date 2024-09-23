package c;


public class CarRunner {

    public static void main(String[] args) {
        Hybrid hybridCar = new Hybrid();

        hybridCar.setCostPerGallon(3.50);
        hybridCar.setCostPerKWh(0.24);

        // Gas test:
        hybridCar.setMilesfromGas(120);
        hybridCar.setGallonsfromGas(6);
        double gasMPG = hybridCar.calcGasMPG();
        System.out.println("Gas MPG: " + gasMPG);

        // Electric test:
        hybridCar.setElectricMiles(120);
        hybridCar.setTotalkWh(33.7);
        double electricMPGe = hybridCar.calcMPGe();
        System.out.println("Electric MPGe: " + electricMPGe);

        // Hybrid test:
        double avgMPG = hybridCar.calcAverageMPG();
        System.out.println("Average MPG in hybrid mode: " + avgMPG);
    }
}
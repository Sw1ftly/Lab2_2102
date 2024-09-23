package c;

public class Hybrid implements ElectricInterface, GasolineInterface {

    private double gasMPG;
    private double MpgE;
    private double miles;
    private double gallons;
    private double kWh;
    private double costPerGallon;
    private double costPerKWh;

    private final double MPG_E = 33.7;
    @Override
    public double calcGasMPG() {
        gasMPG = miles / gallons;
        return gasMPG;
    }
    @Override
    public double calcMPGe() {
        MpgE = (miles / kWh) * MPG_E;
        return MpgE;
    }
    @Override
    public void setMilesfromGas(double miles) {
        this.miles = miles;
    }
    @Override
    public void setGallonsfromGas(double gallons) {
        this.gallons = gallons;
    }
    @Override
    public void setElectricMiles(double totalElectricMiles) {
        miles = totalElectricMiles;
    }
    @Override
    public void setTotalkWh(double totalkWh) {
        kWh = totalkWh;
    }
    @Override
    public void setCostPerGallon(double cost) {
        this.costPerGallon = cost;
    }
    @Override
    public double getCostPerGallon() {
        return costPerGallon;
    }
    @Override
    public void setCostPerKWh(double cost) {
        this.costPerKWh = cost;
    }
    @Override
    public double getCostPerKWh() {
        return costPerKWh;
    }

    public double calcAverageMPG() {
        return (calcGasMPG() + calcMPGe()) / 2;
    }
}
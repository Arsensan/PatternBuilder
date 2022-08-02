public class PompBuilder extends IndustrialBuilder {
    @Override
    void buildName() {
industrialUnit.setName("Pomp");
    }

    @Override
    void buildTemperature() {
industrialUnit.setTemperature(100f);
    }

    @Override
    void buildPressure() {
industrialUnit.setPressure(10);

    }

    @Override
    void buildVoltage() {
industrialUnit.setVoltage(220);
    }

    @Override
    void buildSupplierName() {
industrialUnit.setSupplierName("Motors@KO");
    }

    @Override
    void buildOperationStatus() {
industrialUnit.setOperatingStatus(OperatingStatus.OFF);
    }
}

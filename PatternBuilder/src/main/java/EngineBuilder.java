public class EngineBuilder extends IndustrialBuilder {
    @Override
    void buildName() {
        industrialUnit.setName("Engine");
    }

    @Override
    void buildTemperature() {
        industrialUnit.setTemperature(1000f);
    }

    @Override
    void buildPressure() {
        industrialUnit.setPressure(100);

    }

    @Override
    void buildVoltage() {
        industrialUnit.setVoltage(380);
    }

    @Override
    void buildSupplierName() {
        industrialUnit.setSupplierName("Electric Land");
    }

    @Override
    void buildOperationStatus() {
        industrialUnit.setOperatingStatus(OperatingStatus.OFF);
    }
}

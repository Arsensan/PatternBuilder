public class Director {
    IndustrialBuilder industrialBuilder;

    public void setIndustrialBuilder(IndustrialBuilder industrialBuilder) {
        this.industrialBuilder = industrialBuilder;
    }

    IndustrialUnit buildIndustrialUnit() {
        industrialBuilder.createIndustrial();
        industrialBuilder.buildName();
        industrialBuilder.buildTemperature();
        industrialBuilder.buildPressure();
        industrialBuilder.buildVoltage();
        industrialBuilder.buildSupplierName();
        industrialBuilder.buildOperationStatus();
        IndustrialUnit industrialUnit = industrialBuilder.getIndustrialUnit();
        return industrialUnit;
    }

}

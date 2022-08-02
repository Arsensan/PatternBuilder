public class BuilderApp {
    public static void main(String[] args) {
        System.out.println("Start APP");
        System.out.println("**********\n");

        Director director = new Director();
        director.setIndustrialBuilder(new PompBuilder());
        IndustrialUnit pomp = director.buildIndustrialUnit();
        System.out.println(pomp);

        director.setIndustrialBuilder(new EngineBuilder());
        IndustrialUnit engine = director.buildIndustrialUnit();
        System.out.println(engine);


        System.out.println("\n**********");
        System.out.println("Close APP");
    }
}

package EasyBuilder;

public class EasyBuilderApp {
    public static void main(String[] args) {
        System.out.println("EasyBuilder START");
        System.out.println("*****************\n");

        Report report = new Report
                .Builder(" Report I quarter")
                .setTitle("Heavy Industry")
                .setContent("Text")
                .setPageNumber(1)
                .setTable("TABLE")
                .build();

        System.out.println(report);

        System.out.println(report.getTable());


        System.out.println("\n*****************");
        System.out.println("EasyBuilder END");
    }
}

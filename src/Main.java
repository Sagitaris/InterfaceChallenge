public class Main {

    public static void main(String[] args) {

       Mappable sydneyTownHall = new Building("Sydney Town Hall (GOVERNMENT)",
               "RED STAR", "Sydney Town Hall", "GOVERNMENT");

       Mappable.getClassProperty(sydneyTownHall);

        Mappable collegeSt = new UtilityLine("College St (FIBER_OPTIC", "GREEN DOTTED", "College St",
                "utility");
        Mappable.getClassProperty(collegeSt);
    }
}

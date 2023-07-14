public class UtilityLine implements Mappable{

    private String label;
    private String iconType;
    private String name;
    private String utility;

    public UtilityLine(String label, String iconType, String name, String utility) {
        this.label = label;
        this.iconType = iconType;
        this.name = name;
        this.utility = utility;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public GeometryType getGeometryType() {
        return GeometryType.LINE;
    }

    @Override
    public String getIconType() {
        return iconType;
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + "\"name:\": " + name+ ", "
                + "\"utility\": " + utility;
    }
}

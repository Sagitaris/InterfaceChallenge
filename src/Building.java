public class Building implements Mappable{

    private String label;
    private String iconType;

    private String name;
    private String usage;

    public Building(String label, String iconType, String name, String usage) {
        this.label = label;
        this.iconType = iconType;
        this.name = name;
        this.usage = usage;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public GeometryType getGeometryType() {
        return GeometryType.POINT;
    }

    @Override
    public String getIconType() {
        return iconType;
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + "\"name:\": " + name+ ", "
                + "\"usage\": " + usage;
    }
}

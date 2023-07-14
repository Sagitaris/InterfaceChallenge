public interface Mappable {



    enum GeometryType {POINT, LINE}
    String JSON_PROPERTY = "\"properties\": {%s}\n";

    String getLabel();
    GeometryType getGeometryType();
    String getIconType();

    default String toJSON(){

        return "\"type:\": " + getGeometryType()+ ", "
                + "\"label\": " + getLabel() + ", "
                + "\"marker\": " + getIconType();
    }

    static void getClassProperty(Mappable mappable){
        System.out.printf(JSON_PROPERTY, mappable.toJSON());

    }

}

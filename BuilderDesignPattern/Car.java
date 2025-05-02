package BuilderDesignPattern;

public class Car {
    private String modelName;
    private String engineType;
    private String color;
    private String transmission;
    private boolean sunroof;
    private boolean infotainmentSystem;

    public Car(String modelName, String engineType, String color, String transmission, boolean sunroof, boolean infotainmentSystem) {
        this.modelName = modelName;
        this.engineType = engineType;
        this.color = color;
        this.transmission = transmission;
        this.sunroof = sunroof;
        this.infotainmentSystem = infotainmentSystem;
    }

    @Override
    public String toString() {
        return "Car [modelName=" + modelName + ", engineType=" + engineType + ", color=" + color + ", transmission="
                + transmission + ", sunroof=" + sunroof + ", infotainmentSystem=" + infotainmentSystem + "]";
    }
}

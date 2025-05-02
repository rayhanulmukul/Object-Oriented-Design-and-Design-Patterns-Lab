package BuilderDesignPattern;

public class BuilderPattern {
    public static void main(String[] args) {
        Car defaultCar = new CarBuilder().build();
        System.out.println("\nDefault Car Configuration: \n" + defaultCar);

        Car customCar = new CarBuilder()
            .setModel("Tesla Model 3")
            .setEngine("Electric")
            .setColor("Red")
            .setTransmission("Automatic")
            .setSunroof(true)
            .setInfotainmentSystem(true)
            .build();
        System.out.println("\nCustom Car Configuration: \n" + customCar);
    }
}

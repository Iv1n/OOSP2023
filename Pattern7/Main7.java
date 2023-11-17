package Pattern7;

public class Main7 {
    public static void main(String[] args){
        CarBuilder builder = new ConcreteCarBuilder();
        Car car = builder.setBrand("BMW")
                .setModel("F31 ")
                .setColor("Black")
                .addOption("M compitishion")
                .addOption("20' wheels")
                .build();
        System.out.println(car);
    }
}

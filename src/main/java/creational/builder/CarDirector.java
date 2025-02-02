package creational.builder;

public class CarDirector {
    public void configureAventador(CarBuilder builder) {
        builder.brand("Lamborghini")
                .model("Aventador")
                .doors(2);
    }
}

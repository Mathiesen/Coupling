class Car {
    private Engine engine = new Engine();
    private Tire tire = new Tire();

    void prepare() {
        tire.inflate();
        engine.start();
        System.out.println("Car is ready to go!");
    }
}
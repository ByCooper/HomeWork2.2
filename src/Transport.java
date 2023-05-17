public abstract class Transport implements ServiceTransport {
    private final String modelName;
    private final int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    protected String getModelName() {
        return modelName;
    }

    protected int getWheelsCount() {
        return wheelsCount;
    }
    public void updateTyre() {
        for(int i = 1; i <= getWheelsCount(); i++) {
        System.out.println("Меняем покрышку");
        }
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}

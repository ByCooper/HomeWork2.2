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
}

public class Calculator {
    private double value;

    public double add(double valueToBeAdded) {
        this.value += valueToBeAdded;
        return value;
    }

    public double subtract(double valueToBeSubtracted) {
        this.value -= valueToBeSubtracted;
        return value;
    }

    public double multiply(double valueTobeMultiplied) {
        this.value *= valueTobeMultiplied;
        return value;
    }

    public double divide(double valueToBeDivided) {
        this.value/=valueToBeDivided;
        return value;
    }

    public double cancel() {
        value = 0;
        return value;
    }


}

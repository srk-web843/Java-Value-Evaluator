public class Integers {
    public float division(float val1, float val2) {
        return val1 / val2;
    }

    public float multiplication(float val1, float val2) {
        return val1 * val2;
    }

    public float addition(float val1, float val2) {
        return val1 + val2;
    }

    public float subtraction(float val1, float val2) {
        return val1 - val2;
    }

    public float doubleValue(float val1) {
        float val2 = val1 * 2;
        while(val1 < val2) {
            val1++;
        }
        return val1;
    }

    public double halfValue(double val1) {
        double val2 = val1 * 0.5;
        return val2;
    }
}

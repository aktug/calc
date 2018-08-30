public class Math implements IMath {
    @Override
    public int add(int int1, int int2) {
        return int1 + int2;
    }

    @Override
    public int sub(int int1, int int2) {
        return int1 - int2;
    }

    @Override
    public int div(int int1, int int2) {
        return int1 / int2;
    }

    @Override
    public int mult(int int1, int int2) {
        return int1 * int2;
    }
}

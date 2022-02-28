package Day13;

public class GenricUse<T extends Comparable<T>> {
    T x,y,z;

    public GenricUse(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T testMaximum(){
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        } if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        GenricUse genricUse = new GenricUse(1.6, 5.8, 6.2);
        genricUse.testMaximum();
        System.out.println("The Max Number Is : " + genricUse.testMaximum());
    }
}



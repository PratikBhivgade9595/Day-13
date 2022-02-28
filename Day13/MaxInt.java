package Day13;

public class MaxInt {
    private Integer x, y, z;

    public MaxInt(Integer x, Integer y, Integer z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Integer testMaximum() {
        Integer max = x;
        if (y > max) {
            max = y;
        } if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        MaxInt maxInt = new MaxInt(40, 70, 60);
        maxInt.testMaximum();
        System.out.println("The Max Number Is : " + maxInt.testMaximum());
    }
}

package Day13;

public class MaxFloat {
    private Float x,y,z;

    public MaxFloat(Float x, Float y, Float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Float testMaximum() {
        Float max = x;
        if (y > max) {
            max = y;
        } if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        MaxFloat maxFloat = new MaxFloat(90.0f, 70.0f, 60.0f);
        maxFloat.testMaximum();
        System.out.println("The Max Number Is : " + maxFloat.testMaximum());
    }
}

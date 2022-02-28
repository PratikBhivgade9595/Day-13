package Day13;

public class MaxString {
    private String x,y,z;

    public MaxString(String x, String y, String z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String testMaximum(){
        String max = x;
        if (y.length() > max.length()) {
            max = y;
        } if (z.length() > max.length()) {
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        MaxString maxString = new MaxString("Pratik", "Prajwal", "Ganga");
        maxString.testMaximum();
        System.out.println("The Max Number Is : " + maxString.testMaximum());
    }
}

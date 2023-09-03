public class ToyCar {

    public static void main(String[] args) {
        ToyCar toyCar = ToyCar.buy();
        toyCar.drive();
        toyCar.drive();
        toyCar.batteryDisplay();
        toyCar.distanceDisplay();
    }

    /* Add state */

    private ToyCar() {
        /* Init state */
    }

    public static ToyCar buy() {
        /* return a Car full of battery without any distance driven */
    }

    public String distanceDisplay() {
        /* Display the driven meters */
    }

    public String batteryDisplay() {
        /* Display the battery charge */
    }

    public void drive() {
        /* Update Toy Car state after driving */
    }
}

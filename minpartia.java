package Stock.classes;

public class minpartia {
    public static double minpartia;

    public static double getMinpartia() {
        return minpartia;
    }

    public static void setMinpartia(double minpartia) {
        if (minpartia > 0){
            Stock.classes.minpartia.minpartia = minpartia;
        }
        else Stock.classes.minpartia.minpartia = 0;
    }
}

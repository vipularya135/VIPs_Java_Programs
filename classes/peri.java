package classes;

class per{
    double radi;
    public void set(double r){
        radi = r;

    }
    public double calculateVolume() {
        return 2* Math.PI *radi;
    }
}
public class peri {
    public static void main(String args[]){

        per p = new per();

        p.set(5.0);

        double volume = p.calculateVolume();
        System.out.println("perimeter of circle: " + volume);
    }
}
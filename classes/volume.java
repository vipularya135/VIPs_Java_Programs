package classes;

class dime{
    double width;
    double height;
    double length;
    public void set(double w, double h, double l){
        width = w;
        height =h;
        length =l;
    }
    public double calculateVolume() {
        return length * width * height;
    }
}
public class volume {
    public static void main(String args[]){

        dime d = new dime();

        d.set(5.0, 3.0, 2.0);

        double volume = d.calculateVolume();
        System.out.println("Volume of the box: " + volume);
    }
}

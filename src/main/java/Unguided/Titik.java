package Unguided;

// ERNAWATI EKA B SIANIPAR
// 2211103051
public class Titik {
    double x, y;
    public Titik(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void tampil() {
        System.out.print("Point : ["+x+","+y+"]");
    }
    public double hitungJarak(Unguided.Titik t2) {
        return Math.sqrt(Math.pow(t2.x - this.x, 2) + Math.pow(t2.y - this.y,
                2));
    }
}


package Unguided;
// ERNAWATI EKA B SIANIPAR
// 2211103051
public class Persegi extends Unguided.Titik {
    double sisiPSG;
    public Persegi(double x1, double y1, double x2, double y2) {
        super(x1, y1);
        double jarak = hitungJarak(new Unguided.Titik(x2, y2));
        this.sisiPSG = jarak;
    }
    public double hitungLuas() {
        return sisiPSG * sisiPSG;
    }
    @Override
    public void tampil() {
        super.tampil();
        System.out.println();
        System.out.println("Sisi Persegi : " + sisiPSG);
        System.out.println("Luas Persegi : " + hitungLuas());
        System.out.println();
    }
}

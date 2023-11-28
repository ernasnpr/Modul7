package Unguided;
// ERNAWATI EKA B SIANIPAR
// 2211103051
public class SgtSamaSisi extends Unguided.Titik {
    double sisiSGT;
    public SgtSamaSisi(double x1, double y1, double x2, double y2, double x3,
                       double y3) {
        super(x1, y1);
        double jarak = hitungJarak(new Unguided.Titik(x2, y2));
        this.sisiSGT = jarak;
    }
    public double hitungLuas() {
        return 0.5 * sisiSGT * Math.sqrt(3);
    }
    @Override
    public void tampil() {
        super.tampil();
        System.out.println();
        System.out.println("Sisi Segitiga : " + sisiSGT);
        System.out.println("Luas Segitiga : " + hitungLuas());
        System.out.println();
    }
}

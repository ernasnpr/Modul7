package Unguided;
// ERNAWATI EKA B SIANIPAR
// 2211103051
public class Limas {
    Unguided.SgtSamaSisi[] segitigaArray;
    Unguided.Persegi persegi;
    public Limas(double x1, double y1, double x2, double y2, double x3,
                 double y3, double x4, double y4) {
        segitigaArray = new Unguided.SgtSamaSisi[4];
        for (int i = 0; i < 4; i++) {
            segitigaArray[i] = new Unguided.SgtSamaSisi(x1, y1, x2, y2, x3, y3);
        }
        persegi = new Unguided.Persegi(x3, y3, x4, y4);
    }
    public double hitungLuas() {
        double luasSegitiga = segitigaArray[0].hitungLuas();
        double luasPersegi = persegi.hitungLuas();
        return (4 * luasSegitiga) + luasPersegi;
    }
    public void tampil() {
        System.out.println("== Data Segitiga ==");
        segitigaArray[0].tampil();
        System.out.println("== Data Persegi ==");
        persegi.tampil();
        System.out.println();
        System.out.println("Luas Limas : " + hitungLuas());
    }
}

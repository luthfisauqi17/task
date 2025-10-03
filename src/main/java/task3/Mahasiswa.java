package task3;

public class Mahasiswa {

    private String nama;
    private String nim;
    private double nilai;

    public Mahasiswa() {

    }

    public Mahasiswa(String nama, String nim, double nilai) {
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public double getNilai() {
        return nilai;
    }

    public String cekKelulusan() {
        if (nilai > 70) {
            return "LULUS";
        } else {
            return "TIDAK LULUS";
        }
    }

    public void tampilkanInfo() {
        System.out.println("=== Data Mahasiswa ===");
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Nilai : " + nilai);
        System.out.println("Status: " + cekKelulusan());
    }

    public static void main(String[] args) {
        final Mahasiswa mhs1 = new Mahasiswa();
        mhs1.setNama("Budi Santoso");
        mhs1.setNim("12345678");
        mhs1.setNilai(85.5);

        System.out.println("Contoh 1:");
        mhs1.tampilkanInfo();

        System.out.println();

        final Mahasiswa mhs2 = new Mahasiswa("Siti Nurhaliza", "87654321", 65.0);

        System.out.println("Contoh 2:");
        mhs2.tampilkanInfo();
    }
}

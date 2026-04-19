package POSTTEST_5;

public class MahasiswaAktif extends Mahasiswa implements InfoMahasiswa {
    private String status;

    public MahasiswaAktif(String nim, String nama, String jurusan, String status) {
        super(nim, nama, jurusan);
        this.status = status;
    }

    @Override
    public void tampilData() {
        tampilUmum();
        System.out.println("Status : " + status);
        statusMahasiswa();
        infoTambahan();
        System.out.println("----------------------");
    }

    @Override
    public void statusMahasiswa() {
        System.out.println("Kategori : Mahasiswa Aktif");
    }

    @Override
    public void infoTambahan() {
        System.out.println("Mahasiswa masih mengikuti perkuliahan");
    }
}
package Posttest3;

public class Mahasiswa {
    protected String nim;
    protected String nama;
    protected String jurusan;

    public Mahasiswa(String nim, String nama, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
    }

    public String getNim() {
        return this.nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return this.jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void tampilData() {
        System.out.println("NIM     : " + this.nim);
        System.out.println("Nama    : " + this.nama);
        System.out.println("Jurusan : " + this.jurusan);
    }
}

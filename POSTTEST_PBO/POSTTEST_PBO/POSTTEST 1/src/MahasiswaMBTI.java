public class MahasiswaMBTI {

    private String nim;
    private String nama;
    private String jurusan;
    private String tipeMBTI;

    public MahasiswaMBTI(String nim, String nama, String jurusan, String tipeMBTI) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.tipeMBTI = tipeMBTI;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getTipeMBTI() {
        return tipeMBTI;
    }

    public void setTipeMBTI(String tipeMBTI) {
        this.tipeMBTI = tipeMBTI;
    }

    public void tampilData() {
        System.out.println("NIM        : " + nim);
        System.out.println("Nama       : " + nama);
        System.out.println("Jurusan    : " + jurusan);
        System.out.println("Tipe MBTI  : " + tipeMBTI);
        System.out.println("---------------------------");
    }
}


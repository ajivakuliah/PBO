package POSTTEST_5;

public class MahasiswaMBTI extends Mahasiswa implements InfoMahasiswa {
    private String tipeMBTI;

    public MahasiswaMBTI(String nim, String nama, String jurusan, String tipeMBTI) {
        super(nim, nama, jurusan);
        this.tipeMBTI = tipeMBTI;
    }

    @Override
    public void tampilData() {
        tampilUmum();
        System.out.println("Tipe MBTI : " + tipeMBTI);
        statusMahasiswa();
        infoTambahan();
        System.out.println("----------------------");
    }

    @Override
    public void statusMahasiswa() {
        System.out.println("Kategori : Mahasiswa MBTI");
    }

    @Override
    public void infoTambahan() {
        System.out.println("Kepribadian mahasiswa terdeteksi");
    }
}
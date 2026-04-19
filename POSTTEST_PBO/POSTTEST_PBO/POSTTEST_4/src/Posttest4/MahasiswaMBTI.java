package Posttest4;

public class MahasiswaMBTI extends Mahasiswa {
    private String tipeMBTI;

    public MahasiswaMBTI(String nim, String nama, String jurusan, String tipeMBTI) {
        super(nim, nama, jurusan);
        this.tipeMBTI = tipeMBTI;
    }

    public String getTipeMBTI() { return tipeMBTI; }
    public void setTipeMBTI(String tipeMBTI) { this.tipeMBTI = tipeMBTI; }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Tipe MBTI : " + tipeMBTI);
        System.out.println("----------------------");
    }
}
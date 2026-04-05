package Posttest3;

public class MahasiswaAktif extends Mahasiswa {
    private String status;

    public MahasiswaAktif(String nim, String nama, String jurusan, String status) {
        super(nim, nama, jurusan);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Status : " + status);
        System.out.println("----------------------");
    }
}

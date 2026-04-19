import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<MahasiswaMBTI> dataMahasiswa = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int pilihan;

        do {

            System.out.println("\n===== SISTEM MANAJEMEN MBTI MAHASISWA =====");
            System.out.println("1. Tambah Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Update Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Exit");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    tambahData();
                    break;

                case 2:
                    lihatData();
                    break;

                case 3:
                    updateData();
                    break;

                case 4:
                    hapusData();
                    break;

                case 5:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }

        } while (pilihan != 5);

    }

    static void tambahData() {

        System.out.println("\n=== Tambah Data Mahasiswa ===");

        System.out.print("NIM: ");
        String nim = input.nextLine();

        System.out.print("Nama: ");
        String nama = input.nextLine();

        System.out.print("Jurusan: ");
        String jurusan = input.nextLine();

        System.out.print("Tipe MBTI: ");
        String mbti = input.nextLine();

        MahasiswaMBTI mhs = new MahasiswaMBTI(nim, nama, jurusan, mbti);
        dataMahasiswa.add(mhs);

        System.out.println("Data berhasil ditambahkan.");
    }

    static void lihatData() {

        System.out.println("\n=== Data Mahasiswa ===");

        if (dataMahasiswa.isEmpty()) {
            System.out.println("Belum ada data.");
        } else {

            for (int i = 0; i < dataMahasiswa.size(); i++) {
                System.out.println("Data ke-" + (i + 1));
                dataMahasiswa.get(i).tampilData();
            }
        }
    }

    static void updateData() {

        lihatData();

        if (dataMahasiswa.isEmpty()) return;

        System.out.print("Pilih nomor data yang ingin diupdate: ");
        int index = input.nextInt();
        input.nextLine();

        index--;

        if (index >= 0 && index < dataMahasiswa.size()) {

            System.out.print("Nama baru: ");
            String nama = input.nextLine();

            System.out.print("Jurusan baru: ");
            String jurusan = input.nextLine();

            System.out.print("MBTI baru: ");
            String mbti = input.nextLine();

            dataMahasiswa.get(index).setNama(nama);
            dataMahasiswa.get(index).setJurusan(jurusan);
            dataMahasiswa.get(index).setTipeMBTI(mbti);

            System.out.println("Data berhasil diupdate.");
        } else {
            System.out.println("Data tidak ditemukan.");
        }
    }

    static void hapusData() {

        lihatData();

        if (dataMahasiswa.isEmpty()) return;

        System.out.print("Pilih nomor data yang ingin dihapus: ");
        int index = input.nextInt();

        index--;

        if (index >= 0 && index < dataMahasiswa.size()) {
            dataMahasiswa.remove(index);
            System.out.println("Data berhasil dihapus.");
        } else {
            System.out.println("Data tidak ditemukan.");
        }
    }
}
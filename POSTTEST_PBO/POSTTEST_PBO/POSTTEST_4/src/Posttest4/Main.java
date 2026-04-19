package Posttest4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Mahasiswa> dataMahasiswa = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\n===== SISTEM MANAJEMEN MBTI =====");
            System.out.println("1. Tambah Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Exit");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1 -> tambahData();
                case 2 -> lihatData();
                case 3 -> System.out.println("Program selesai");
            }
        } while (pilihan != 3);
    }

    static void tambahData() {
        System.out.print("NIM: ");
        String nim = input.nextLine();

        System.out.print("Nama: ");
        String nama = input.nextLine();

        System.out.print("Jurusan: ");
        String jurusan = input.nextLine();

        System.out.println("Pilih jenis mahasiswa:");
        System.out.println("1. Mahasiswa MBTI");
        System.out.println("2. Mahasiswa Aktif");
        System.out.print("Pilihan: ");
        int pilih = input.nextInt();
        input.nextLine();

        if (pilih == 1) {
            System.out.print("Tipe MBTI: ");
            String mbti = input.nextLine();
            dataMahasiswa.add(new MahasiswaMBTI(nim, nama, jurusan, mbti));

        } else if (pilih == 2) {
            System.out.print("Status: ");
            String status = input.nextLine();
            dataMahasiswa.add(new MahasiswaAktif(nim, nama, jurusan, status));
        }

        System.out.println("Data berhasil ditambahkan");
    }

    static void lihatData() {
        System.out.println("\n=== DATA MAHASISWA ===");

        for (Mahasiswa m : dataMahasiswa) {
            m.tampilData();
        }
    }
}
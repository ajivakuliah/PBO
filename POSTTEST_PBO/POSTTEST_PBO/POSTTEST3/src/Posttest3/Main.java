package Posttest3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<MahasiswaMBTI> dataMahasiswa = new ArrayList<>();
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

        System.out.print("MBTI: ");
        String mbti = input.nextLine();

        dataMahasiswa.add(new MahasiswaMBTI(nim, nama, jurusan, mbti));
        System.out.println("Data berhasil ditambahkan");
    }

    static void lihatData() {
        for (MahasiswaMBTI m : dataMahasiswa) {
            m.tampilData();
        }
    }
}

package model;

import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.npm = "19630404";
        mahasiswa.nama = "Hasanur";
        mahasiswa.tanggalLahir = new Date();

        System.out.println("Nama \t\t\t : " + mahasiswa.npm);
        System.out.println("Npm \t\t\t : " + mahasiswa.nama);
        System.out.println("Tanggal Lahir \t : " + mahasiswa.tanggalLahir);
    }
}

package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[] args) {
        public static void main(String[] args) throws ParseException {

            String polaTanggal = "dd-MM-yyyy";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(polaTanggal);

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.npm = "19630404";
        mahasiswa.nama = "Hasanur";
        mahasiswa.tanggalLahir = new Date();
        mahasiswa.tanggalLahir = simpleDateFormat.parse("12-10-2000");

        System.out.println("Nama \t\t\t : " + mahasiswa.npm);
        System.out.println("Npm \t\t\t : " + mahasiswa.nama);
        System.out.println("Tanggal Lahir \t : " + mahasiswa.tanggalLahir);

    }
}

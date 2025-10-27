import Modul2.HospitalIntroduce;
import Modul2.HospitalSystem;

/**
 * Kelas Main digunakan untuk menjalankan simulasi sistem rumah sakit.
 *
 * <p>Contoh ini menunjukkan inisialisasi pasien, menampilkan status awal,
 * melakukan perubahan durasi menginap dan biaya dokter, serta menampilkan
 * status akhir pasien.</p>
 *
 * <p>Simulasi ini menggunakan kelas {@link HospitalSystem} dan record
 * {@link HospitalIntroduce}.</p>
 *
 * Author: Mahligai Arsya
 * Version: 1.0
 */
public class Main {

    /**
     * Metode utama program.
     *
     * @param args Argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        // (Nama, ID Ruangan, Penyakit, Biaya Awal, Durasi, Biaya Dokter Harian)
        HospitalSystem patient = new HospitalSystem(
                new HospitalIntroduce("Arsya", "R201", "Fever", 1500.0, 5, 200.0)
        );

        System.out.println("--- INITIAL STATUS ---");
        patient.dFI();

        patient.cS();
        patient.dD();

        System.out.println("\n--- SIMULATING CHANGE ---");
        patient.addDays(3);        // Tambah 3 hari menginap
        patient.updateDrFee(50.0); // Tambah biaya dokter 50.0

        System.out.println("\n--- FINAL STATUS ---");
        patient.dFI();
    }
}

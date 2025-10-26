import Modul2.HospitalIntroduce;
import Modul2.HospitalSystem;

public class Main {
    // Metode Utama (Main)
    public static void main(String[] args) {
        // (Nama, ID Ruangan, Penyakit, Biaya Awal, Durasi, Biaya Dokter Harian)
        HospitalSystem patient = new HospitalSystem(new HospitalIntroduce("Arsya", "R201", "Fever", 1500.0, 5, 200.0));

        System.out.println("--- INITIAL STATUS ---");
        patient.dFI();

        patient.cS();
        patient.dD();

        System.out.println("\n--- SIMULATING CHANGE ---");
        patient.addDays(3);      // Tambah 3 hari menginap
        patient.updateDrFee(50.0); // Tambah biaya dokter 50.0

        System.out.println("\n--- FINAL STATUS ---");
        patient.dFI();
    }
}

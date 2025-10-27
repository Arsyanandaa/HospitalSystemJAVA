package Modul2;

/**
 * Kelas abstrak Operational berfungsi sebagai dasar untuk semua operasi terkait pasien.
 * Kelas ini menyimpan informasi dasar pasien seperti nama, ID ruangan, diagnosa, dan biaya.
 * Subkelas harus mengimplementasikan metode {@link #dFI()} untuk menampilkan info lengkap pasien.
 *
 * <p>Kelas ini dirancang agar dapat diwariskan oleh kelas yang membutuhkan informasi
 * operasional pasien dan biaya rumah sakit.</p>
 *
 * @author Mahligai Arsya
 * @version 1.0
 */
public abstract class Operational {

    /** Nama pasien */
    public String pasienName;

    /** ID ruangan tempat pasien dirawat */
    public String roomID;

    /** Diagnosa atau penyakit pasien */
    public String illness;

    /** Total biaya yang harus dibayar pasien */
    public double totalFee;

    /**
     * Konstruktor untuk inisialisasi informasi dasar pasien.
     *
     * @param patientName Nama pasien
     * @param roomIdentifier ID ruangan
     * @param diagnosis Diagnosa penyakit
     * @param fee Total biaya pasien
     */
    public Operational(String patientName, String roomIdentifier, String diagnosis, double fee) {
        this.pasienName = patientName;
        this.roomID = roomIdentifier;
        this.illness = diagnosis;
        this.totalFee = fee;
    }

    /**
     * Metode abstrak untuk menampilkan info lengkap pasien.
     * Subkelas wajib mengimplementasikan metode ini sesuai kebutuhan.
     */
    public abstract void dFI();
}

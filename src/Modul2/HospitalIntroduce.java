package Modul2;

/**
 * HospitalIntroduce adalah record yang menyimpan data dasar pasien
 * dan informasi biaya terkait rumah sakit.
 *
 * <p>Record ini digunakan untuk mempermudah inisialisasi kelas {@link HospitalSystem}.</p>
 *
 * Fields mencakup nama pasien, ID ruangan, diagnosa, biaya dasar, durasi menginap,
 * dan biaya dokter per hari.</p>
 *
 * @author Mahligai
 * @version 1.0
 */
public record HospitalIntroduce(
        /** Nama pasien */
        String patientName,

        /** ID ruangan tempat pasien dirawat */
        String roomIdentifier,

        /** Diagnosa atau penyakit pasien */
        String diagnosis,

        /** Biaya dasar pasien */
        double fee,

        /** Durasi menginap pasien dalam hari */
        int stayDuration,

        /** Biaya dokter per hari */
        double doctorDailyFee
) {
}

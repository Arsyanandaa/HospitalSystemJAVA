package Modul2;

/**
 * HospitalSystem adalah kelas yang mengatur informasi pasien, biaya rumah sakit,
 * dan durasi menginap pasien. Kelas ini merupakan turunan dari kelas Operational
 * dan mengimplementasikan interface HospitalMethod.
 *
 * <p>Kelas ini juga menyediakan metode untuk menampilkan info pasien, menghitung
 * biaya akhir termasuk pajak, menambah durasi menginap, dan memperbarui biaya dokter.</p>
 *
 * @author Mahligai Arsya Nanda
 * @version 1.0
 */
public class HospitalSystem extends Operational implements HospitalMethod {

    /** Tarif pajak atau administrasi sebesar 15% */
    public static final double TAX_RATE = 0.15;

    /** Durasi menginap pasien */
    private int daysStay;

    /** Biaya dokter per hari */
    private double drFee;

    /** Biaya minimum */
    private static final double MIN_FEE = 50.0;

    /** Biaya maksimum */
    private static final double MAX_FEE = 50000.0;

    /**
     * Konstruktor untuk inisialisasi HospitalSystem.
     * Mengambil data pasien dari objek HospitalIntroduce.
     *
     * @param hospitalIntroduce Objek yang menyediakan data pasien dan biaya
     */
    public HospitalSystem(HospitalIntroduce hospitalIntroduce) {
        super(hospitalIntroduce.patientName(), hospitalIntroduce.roomIdentifier(), hospitalIntroduce.diagnosis(), hospitalIntroduce.fee());
        this.daysStay = hospitalIntroduce.stayDuration();
        this.drFee = hospitalIntroduce.doctorDailyFee();
    }

    /**
     * Menampilkan status pasien, yaitu nama pasien dan nomor kamar.
     */
    @Override
    public void cS() {
        System.out.println("Patient " + pasienName + " is in Room " + roomID);
    }

    /**
     * Menampilkan estimasi durasi pasien akan keluar dari rumah sakit.
     */
    @Override
    public void dD() {
        System.out.println("Estimated discharge in: " + daysStay + " days");
    }

    /**
     * Menampilkan info dasar pasien termasuk nama, kamar, diagnosa, biaya dasar,
     * dan biaya akhir setelah pajak.
     */
    @Override
    public void dI() {
        System.out.println("--- Patient Basic Info ---");
        System.out.println("Name: " + pasienName);
        System.out.println("Room ID: " + roomID);
        System.out.println("Diagnosis: " + illness);
        System.out.println("Base Fee: $" + totalFee);
        System.out.println("Final Fee: $" + calculateFinalPrice());
    }

    /**
     * Menghitung biaya akhir pasien termasuk pajak.
     *
     * @return Biaya total setelah ditambahkan pajak
     */
    private double calculateFinalPrice() {
        return totalFee + (totalFee * TAX_RATE);
    }

    /**
     * Menambah durasi menginap pasien dan menyesuaikan biaya total.
     *
     * @param addedDays Jumlah hari tambahan
     */
    public void addDays(int addedDays) {
        daysStay += addedDays;
        totalFee += (addedDays * drFee);

        System.out.println("Stay extended by " + addedDays + " days.");
        System.out.println("New estimated discharge: " + daysStay + " days.");
    }

    /**
     * Memperbarui biaya dokter per hari dan memastikan tidak melewati batas maksimum.
     *
     * @param feeIncrease Jumlah kenaikan biaya dokter
     */
    public void updateDrFee(double feeIncrease) {
        drFee += feeIncrease;

        if (drFee > MAX_FEE) {
            drFee = MAX_FEE;
        }

        System.out.println("Doctor fee updated. Current daily fee: $" + drFee);
    }

    /**
     * Menampilkan info lengkap pasien, termasuk info dasar, durasi menginap,
     * dan biaya dokter per hari.
     */
    @Override
    public void dFI() {
        dI();
        System.out.println("Days Stayed: " + daysStay + " days");
        System.out.println("Daily Doctor Fee: $" + drFee);
    }

}

package Modul2;

public class HospitalSystem extends Operational implements HospitalMethod {
    public static final double TAX_RATE = 0.15;

    private int daysStay;   // Durasi menginap (dulu duration)
    private double drFee;   // Biaya dokter per hari (dulu speed)

    // Variabel Konstan
    private static final double MIN_FEE = 50.0;    // Biaya minimum
    private static final double MAX_FEE = 50000.0; // Biaya maksimum

    // Konstruktor
    public HospitalSystem(HospitalIntroduce hospitalIntroduce) {
        super(hospitalIntroduce.patientName(), hospitalIntroduce.roomIdentifier(), hospitalIntroduce.diagnosis(), hospitalIntroduce.fee());
        this.daysStay = hospitalIntroduce.stayDuration();
        this.drFee = hospitalIntroduce.doctorDailyFee();
    }

    // Metode untuk mengecek status pasien (dulu cs())
    @Override
    public void cS() {
        System.out.println("Patient " + pasienName + " is in Room " + roomID);
    }

    // Metode untuk menampilkan durasi menginap (dulu dED())
    @Override
    public void dD() {
        System.out.println("Estimated discharge in: " + daysStay + " days");
    }

    // Metode untuk menampilkan info dasar dan biaya (dulu di())
    @Override
    public void dI() {
        System.out.println("--- Patient Basic Info ---");
        System.out.println("Name: " + pasienName);
        System.out.println("Room ID: " + roomID);
        System.out.println("Diagnosis: " + illness);
        System.out.println("Base Fee: $" + totalFee);
        // Perhitungan biaya total (Base Fee + 15% Tax/Admin)
        System.out.println("Final Fee: $" + calculateFinalPrice());
    }

    private double calculateFinalPrice() {
        return totalFee + (totalFee * TAX_RATE);
    }

    // Metode untuk menambah hari menginap (dulu slowDown())
    public void addDays(int addedDays) {
        daysStay += addedDays;

        // Simulasikan biaya bertambah jika menginap lama
        totalFee += (addedDays * drFee);

        System.out.println("Stay extended by " + addedDays + " days.");
        System.out.println("New estimated discharge: " + daysStay + " days.");
    }

    // Metode untuk update biaya dokter (dulu speedUp())
    public void updateDrFee(double feeIncrease) {
        drFee += feeIncrease;

        // Cek batasan
        if (drFee > MAX_FEE) {
            drFee = MAX_FEE;
        }

        System.out.println("Doctor fee updated. Current daily fee: $" + drFee);
    }

    // Metode untuk menampilkan info lengkap (dulu detailedInfo())
    @Override
    public void dFI() {
        dI();
        System.out.println("Days Stayed: " + daysStay + " days");
        System.out.println("Daily Doctor Fee: $" + drFee);
    }

}
package Modul2;

public abstract class Operational {
    // Variabel Pasien (dulu pName, slocation, dest)
    public String pasienName;      // Nama pasien
    public String roomID;   // ID ruangan
    public String illness;  // Penyakit (Destination)
    // Variabel Biaya dan Durasi
    public double totalFee; // Total biaya (dulu prc)

    public Operational(String patientName, String roomIdentifier, String diagnosis, double fee) {
        this.pasienName = patientName;
        this.roomID = roomIdentifier;
        this.illness = diagnosis;
        this.totalFee = fee;
    }

    // Metode untuk menampilkan info lengkap (dulu detailedInfo())
    public abstract void dFI();
}

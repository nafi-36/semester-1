import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class tugas_beforedays {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan tanggal : ");
            int day = scanner.nextInt();

            System.out.print("Masukkan bulan : ");
            int month = scanner.nextInt();

            System.out.print("Masukkan tahun : ");
            int year = scanner.nextInt();

            String tanggalString = String.format("%04d-%02d-%02d", year, month, day);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate tanggalAwal = LocalDate.parse(tanggalString, formatter);

            DateTimeFormatter hasilFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

            System.out.print("Tanggal awal: " + tanggalAwal.format(hasilFormatter));

            if (tanggalAwal.getDayOfWeek() == java.time.DayOfWeek.MONDAY) {
                System.out.println(" (Senin)");
            } else if (tanggalAwal.getDayOfWeek() == java.time.DayOfWeek.TUESDAY) {
                System.out.println(" (Selasa)");
            } else if (tanggalAwal.getDayOfWeek() == java.time.DayOfWeek.WEDNESDAY) {
                System.out.println(" (Rabu)");
            } else if (tanggalAwal.getDayOfWeek() == java.time.DayOfWeek.THURSDAY) {
                System.out.println(" (Kamis)");
            } else if (tanggalAwal.getDayOfWeek() == java.time.DayOfWeek.FRIDAY) {
                System.out.println(" (Jumat)");
            } else if (tanggalAwal.getDayOfWeek() == java.time.DayOfWeek.SATURDAY) {
                System.out.println(" (Sabtu)");
            } else if (tanggalAwal.getDayOfWeek() == java.time.DayOfWeek.SUNDAY) {
                System.out.println(" (Minggu)");
            } else {
                System.out.println();
            }

            LocalDate tanggalSebelumnya = tanggalAwal.minusDays(1);

            System.out.print("Tanggal sebelumnya: " + tanggalSebelumnya.format(hasilFormatter));
            System.out.print(" (");

            if (tanggalSebelumnya.getDayOfWeek() == java.time.DayOfWeek.MONDAY) {
                System.out.println("Senin)");
            } else if (tanggalSebelumnya.getDayOfWeek() == java.time.DayOfWeek.TUESDAY) {
                System.out.println("Selasa)");
            } else if (tanggalSebelumnya.getDayOfWeek() == java.time.DayOfWeek.WEDNESDAY) {
                System.out.println("Rabu)");
            } else if (tanggalSebelumnya.getDayOfWeek() == java.time.DayOfWeek.THURSDAY) {
                System.out.println("Kamis)");
            } else if (tanggalSebelumnya.getDayOfWeek() == java.time.DayOfWeek.FRIDAY) {
                System.out.println("Jumat)");
            } else if (tanggalSebelumnya.getDayOfWeek() == java.time.DayOfWeek.SATURDAY) {
                System.out.println("Sabtu)");
            } else if (tanggalSebelumnya.getDayOfWeek() == java.time.DayOfWeek.SUNDAY) {
                System.out.println("Minggu)");
            } else {
                System.out.println(")");
            }
        }
    }
}

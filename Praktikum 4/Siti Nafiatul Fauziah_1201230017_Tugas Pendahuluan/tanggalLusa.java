import java.util.Scanner;

public class tanggalLusa {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("===== This Day =====");
        System.out.print("Tanggal : ");
        int tanggal = inp.nextInt() + 2;
        System.out.print("Bulan   : ");
        int bulan = inp.nextInt();
        System.out.print("Tahun   : ");
        int tahun = inp.nextInt();

        int maxDay = cekMaxDay(bulan, tahun);
        
        if(tanggal > maxDay){
            tanggal = tanggal % maxDay;
            bulan = bulan + 1;
        }
        if (bulan > 12){
            bulan = bulan % 12;
            tahun = tahun + 1;
        }

        System.out.println("\n===== The Day After Tomorrow =====");
        System.out.println("Tanggal : " + tanggal);
        System.out.println("Bulan   : " + bulan);
        System.out.println("Tahun   : " + tahun);
    }

    static int cekMaxDay(int bln, int thn) {
        int temp = 0;

        switch (bln) {
            case 1, 3, 5, 7, 8, 10,12:
                temp = 31;
                break;
            case 4, 6, 9, 11:
                temp = 30;
                break;
            case 2:
                if ((thn % 4) == 0) {
                    temp = 29;
                } else {
                    temp = 28;
                }
                break;
        }
        return temp;
    }
}

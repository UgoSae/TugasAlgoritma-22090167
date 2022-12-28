public class GuestRecord {
    public static void main(String[] args) {
        menu();
    }

    private static void absenkuota() {
        Scanner InputUser = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Tamu: ");
        int inputan = InputUser.nextInt();
        EventOrganizer[] tamuanda = new EventOrganizer[inputan];
        infotamuyangada(tamuanda);
    }
    public static void infotamuyangada(eventorganizer[] tamulobi) {
        Scanner inputtamu = new Scanner(System.in);
        for (int index = 0; index < tamulobi.length; index++) {
            tamulobi[index] = new EventOrganizer();
            System.out.println("1. masukan nomor ID :");
            int inputid = inputtamu.nextInt();
            System.out.print("2. Masukkan  Nama: ");
            String inputNama = inputtamu.next();
            System.out.print("3. Masukkan alamat tamu: ");
            String inputAlamat = inputtamu.next();
            System.out.print("4. Masukkan Email: ");
            String inputEmail = inputtamu.next();
            System.out.print("5. Masukkan no handPhone: ");
            int inputnohp = inputtamu.nextInt();
            System.out.print("=======terima kasih sudah mengisi======");
            String pilih = inputtamu.nextLine();
            if (pilih.contains("1")) {
            } else {
              
            }
        }
    }

    private static void menu() {
        Scanner inputtamudatang = new Scanner(System.in);
        System.out.println("1.\tmasuk :");
        System.out.println("2.\tkeluar :");
        System.out.println("silahkan pilih :");
        String input = inputtamudatang.next();
        switch (input) {
            case "1" -> absenkuota();
            case "2" -> System.exit(0);
        }

    }
}

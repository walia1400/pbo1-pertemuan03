package percabangan;

public class Switch {
    public static void main(String[] args) {
        char nilai='D';
        switch (nilai){
            case 'A':
                System.out.println("Mhs   : \"Terima kasih Pak\"");
                System.out.println("Dosen : \"Selamat ya !!\"");
                break;
            case 'B':
                System.out.println("Mhs   : \"Kenapa nilai ulun kada dapat A, Pak?\"");
                System.out.println("Dosen : \"!@#$%\"");
                break;
            case 'C':
                System.out.println("Mhs   : \"Ulun turun pul Pak ai, tugas pul jua?\"");
                System.out.println("Dosen : \"Tapi bisa lah menjawab ujian?\"");
                System.out.println("Mhs   : \"Hihihi\"");
                break;
            default:
                System.out.println("Mhs   : \"ulun turun pul Pak ai, tugas pul jua\"");
                System.out.println("Dosen : \"Bujur jua kah?\"");
                System.out.println("Mhs   : \"*memeriksa bekas*\"");
                System.out.println("Dosen : \"*menceleng*\"");
                System.out.println("Mhs   : \"Kabur..\"");
                break;
        }
    }
}

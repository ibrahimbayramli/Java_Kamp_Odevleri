public class MultiDimensionalArray {
    public static void main(String[] args) {
        String[][] sehirler=new String[3][3];
        sehirler[0][0]="istanbul";
        sehirler[0][1]="bursa";
        sehirler[0][2]="bilecik";
        sehirler[1][0]="ankara";
        sehirler[1][1]="konya";
        sehirler[1][2]="kayseri";
        sehirler[2][0]="diyarbakir";
        sehirler[2][1]="sanliurfa";
        sehirler[2][2]="gaziantep";

        for(String[] i:sehirler){
            for(String j:i){
                System.out.print(j+ "  ");
            }
            System.out.println("");
        }

    }
}

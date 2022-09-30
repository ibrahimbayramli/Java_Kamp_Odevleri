public class RecapDemo2 {
    public static void main(String[] args) {
        double[] myArr = {1.2, 1.3, 6.3, 5.6};
        double total = 0;
        double max=myArr[0];
        for (double item : myArr) {
            if(item>max){
                max=item;
            }
            total += item;
            System.out.println(item);
        }
        System.out.println("Toplam: " + total);
        System.out.println("Max: "+max);

    }
}

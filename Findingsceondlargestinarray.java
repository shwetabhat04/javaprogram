public class Findingsceondlargestinarray {
    public static void main(String[] args) {
        int a[] = {19, 40, 58, 60, 49};
        int max = Integer.MIN_VALUE; 
        int sl = Integer.MIN_VALUE; 

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                sl = max; 
                max = a[i]; 
            } else if (a[i] > sl && a[i] != max) {
                sl = a[i];
            }
        }
        if (sl == Integer.MIN_VALUE) {
            System.out.println("No second largest element");
        } else {
            System.out.println("Second Largest is " + sl);
        }
    }
}

import java.util.Arrays;

public class Findingcommonelementsinarray {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        int b[] = {1,2,6,9};
        Arrays.toString(a);
        Arrays.toString(b);
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    System.out.println("Common Elements are  "+a[i]);
                }
            }
        }
    }
}

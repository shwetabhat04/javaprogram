public class Tocheckifarraysortedornot {
    public static void main(String[] args) {
        int a[]={10,20,30,50,80};
        boolean issorted=true;
        for(int i=1;i<a.length;i++){
            if(a[i]<a[i-1]){
                issorted=false;
                break;
            }
        }
        if(issorted){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }
}

public class Findthelargestelemnt {
    public static void main(String[] args) {
       int a[]={10,68,49,80,49};
       int max=a[0];
       for(int i=0;i<a.length;i++){
        if(a[i]>max){
            max=a[i];
        }
       }
       System.out.println("Largest Element in the array is "+max);
    }
}

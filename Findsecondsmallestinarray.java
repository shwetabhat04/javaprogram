public class Findsecondsmallestinarray {
 public static void main(String[] args) {
    int a[]={23,49,50,28,48};
    int smallest=a[0];
    int ssmallest=Integer.MAX_VALUE;
    for(int i=1;i<a.length;i++){
        if(a[i]<smallest){
            ssmallest=smallest;
            smallest=a[i];
        }
        else if(a[i]!=smallest && a[i]<ssmallest){
            ssmallest=a[i];
        }
    }
    System.out.println("Second Smallest Element in an array is "+ssmallest);
 }   
}

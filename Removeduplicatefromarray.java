public class Removeduplicatefromarray {
    public static void main(String[] args) {
        int a[]={1,33,66,88,99,99,56};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    a[i]=-1;
                }
            }
        }   
        for(int i=0;i<a.length;i++){
            if(a[i]!=-1){
                System.out.println(a[i]);
            }
        }
    }
}

public class RemoveOccurenceofanelementinarray {
    public static void main(String[] args) {
        int a[]={3,4,6,5,8,9};
        int temp=-1;
        for(int i=0;i<a.length;i++){
            int key=3;
            if(a[i]==key){
                key=temp;
            }
            else{
                if(a[i]!=temp){
                    System.out.println(a[i]);
                }
            }
        }
    }
}

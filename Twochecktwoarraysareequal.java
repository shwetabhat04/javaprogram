public class Twochecktwoarraysareequal {
    public static void main(String[] args) {
        int [] a ={1,2,3,4};
        int [] b ={1,2,3,4};
        boolean flag=true;
        if(a.length == b.length){
            for(int i=0;i<a.length;i++){
                if(a[i]!=b[i]){
                    flag=false;
                }
            }
        }
        else{
            flag=false;
        }
        if(flag==true){
            System.out.println("Arrays are equal");
        }
        else{
            System.out.println("Arrays are not equal");
        }
    }
}

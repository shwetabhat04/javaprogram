import java.util.Scanner;
class Tocheckvaluepresentinarray{
    public static void main(String[] args) {
        System.out.println("Enter the Element");
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int a[]={1,3,4,5};
        boolean found=false;
        for(int i=0;i<a.length;i++){
            if(a[i]==m){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("The given number is present in the array");
        }
        else{
            System.out.println("The given array is not present in the array");
        }
        s.close();
    }
}
import java.util.*;
class cricketers{
    int[] cricketer;
    void findCricketerId(int [] arr, int size, int score){
        cricketer=new int[size];
        int c=0;
        for(int i=1;i<size;i+=2){
            if(arr[i]>score){
                cricketer[c]=arr[i-1];
                System.out.println(cricketer[c]);
                c++;
            }
        }
    }
    public static void main(String[] args) {
        cricketers c= new cricketers();
        int e=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n+1];
        for(int i=0; i<=n; i++ )
        {
            arr[i]=sc.nextInt();
            if(arr[i]<0){
                e=1;
                break;
            } 
        }
        if(n<0 && n%2!=0){
            System.out.println("Invalid array size");
        }
        else if(arr[n]<0){
            System.out.println("Invalid score"); 
        }
        else if(e==1){
            System.out.println("Invalid input");
        }
        else{
        c.findCricketerId(arr, n, arr[n]);
        }
    }
}

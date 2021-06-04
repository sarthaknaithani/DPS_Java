import java.util.*;
class findcount{
public int findElementCount(int [] arr, int size,int x){
    int count=0;
    for(int i=0;i<size;i++){
        if(arr[i]==x){
            count++;
        }
    }
    return count;
}
public static void main(String[] args) {
    findcount f=new findcount();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array");
    int n=sc.nextInt();
    int arr[]=new int[n+1];
    for(int i=0; i<=n; i++ ){
        arr[i]=sc.nextInt();
        if(arr[i]<0){
            e=1;
            break;
        } 
    }
    if(e==1){
        System.out.println("Invalid input");
    }
    else{
  int c= f.findElementCount(arr, n, arr[n]); 
    
  System.out.println("Number "+arr[n]+" occurs "+c+" times");
    }
}
}

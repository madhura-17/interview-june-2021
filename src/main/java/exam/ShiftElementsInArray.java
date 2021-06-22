package exam;

public class ShiftElementsInArray {

  public void shift(int[] arr) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    
    int n=arr.length;
      int temp=arr[n-1];
     for(int i=n-1;i>0;i--)
     {
       arr[i]=arr[i-1];
     }
     arr[0]=temp;
 
    
    for(int i=0;i<n;i++)
     {
       System.out.print(arr[i]+" ");
     }

  }

}

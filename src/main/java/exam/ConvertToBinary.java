package exam;

class MyException extends Exception{
   String a;
   MyException(String b) {
     a=b;
   }
}

public class ConvertToBinary {

  public String toBinary(final int n1) {
try {
          if (n1 < 0){
          throw new MyException(" It doesn't still supports to convert the negative number into binary");
      }
      }catch(MyException e){
    System.out.println(e.a) ;
 }

    String res = "";
    int n = n1;
    for(int i=0;n>0;i++)    
   {    
     res= res + n%2;    
     n=n/2;    
   } 
   
   String reverse = "";
   
   for (int i = res.length()-1 ; i >= 0 ; i--){
       reverse= reverse + res.charAt(i);
   }
   
   return reverse;
 }
}

// Type conversion happen when: 
// a type campatible , b. destination type > source type . 
// byte  > short > int > float > long> double . 
public  class Type{
  public static void main (String args [] ) {
    int a = 4; 
    long b = a; 
  System.out.println(b);
    float fv = 5;
    long adc = (long)fv; 
    System.out.println(adc);
    
  }
}
// type casting(it mean manually change ) 1 part (Narrowing casting )> small to big but it loose some data , 
//long to float automatic ,
//float to long use type  convertion 
 /*  long av = 55; 
    float bd = av; 
    System.out.println(bd); */

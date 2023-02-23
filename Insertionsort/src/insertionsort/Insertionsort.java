package insertionsort;

import java.util.Scanner;

public class Insertionsort {
  public static void main(String[] args){
    Scanner ent = new Scanner(System.in);
    int B[]= new int [20];
    int i,j,aux;
     System.out.print("Ingrese los números para el arreglo: ");
     int numero=ent.nextInt();
   
     for(i=1 ; i<=numero; i++){
         System.out.print("A["+i+"]= ");
         B[i]=ent.nextInt();
     }
   
     for(i=2;i<=numero;i++){
  aux=B[i];
  j=i-1;
         while((j>=1) && (aux<B[j])){
            B[j+1]=B[j];
            j=j-1;
            }
   
   B[j+1]=aux;
 }
 
     System.out.println("ORDEN");
     for(i=1 ; i<=numero; i++){
         System.out.print("\t"+B[i]);
        }
 
 
    }
}
        
    


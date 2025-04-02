/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.espoch.edu.clase2programacion;

/**
 *
 * @author KARLA
 */
public class Clase2Programacion {

    public static void main(String[] args) {
     
        /*double base=2;
        double altura =4;
        double area=0;
        
        
        area=base*altura;
        
        System.out.println("La altura del rectangulo es:" +area);*/
        
      /* int num=3;
       
       if (num>0){
          System.out.println(" El numero es positivo: "+ num); 
       }
       else{
           System.out.println("Error, el numero es negativo");
       }*/
         /* int num = 5; 
          int operacion =num%2;
 
          if (num%2==0){
              System.out.println("El numero:"+num+" es PAR,");
            
          }else{
              System.out.println("El numero:"+num+" es IMPAR");
          }*/
         
         
         
         int nota = -70;
         
         if ((nota>=0) && (nota<=100 ) ){
            if (nota>=90){          
             System.out.println("Excelente");
              
        } else if ((nota>=70) && (nota<=89))   {    
              System.out.println("Aprobado");   
        } else if(nota<70)  { 
            System.out.println("Reprobado");
            
        }
        }else{
            System.out.println("Su nota es invalida");

          
    }
}
}
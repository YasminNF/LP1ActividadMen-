
package lp1actividadmenu;

//@author NIOUX

import Utils.Leer;
import java.util.Scanner;


public class LP1ActividadMenu {
    public static void suma(){
    System.out.println("* SUMA *");  
    double num1, num2, resultado;
        Scanner teclado = new Scanner(System.in);
       System.out.println("ingrese el primer numero: ");
       num1=teclado.nextDouble();
       System.out.println("ingrese el segundo numero: ");
       num2=teclado.nextDouble();
       resultado=num1+num2;
       System.out.println("El resultado es: "+resultado);
   }
   public static void factorial(){
    System.out.println("* FACTORIAL *");
        System.out.print("Ingrese el Numero: ");
        int numero =Leer.entero();
        int fac =1;
        for (int i = 0; i <=numero; i++) {
           fac*=i;
        }
        System.out.println(numero + "! = " + fac);   
   }
   public static void radical(){
        System.out.println("* RAIZ CUADRADA *");
       double numero, raiz;
       System.out.println("Ingrese el Numero: ");
       Scanner cap = new Scanner(System.in);
       numero = cap.nextDouble();
       raiz = Math.sqrt(numero);
       System.out.println("La raiz cuadra de "+numero+" es "+raiz);
   }
   public static void primo(){
        System.out.print("Ingrese un número: ");
        int numero, c=0;
        numero = Leer.entero();
        for(int i=1; i<=numero; i++){
            if(numero%i==0){
                c++;
            }
        }
        if( c==2 ){
            System.out.println("El número "+numero+" es primo");
        }
        else{
            System.out.println("El número "+numero+" no es primo");
        }
    }
   public static void error(){
        System.out.println("Error. Opcion incorrecta");
    }
    public static void salir(){
        System.out.println("Gracias por visitarnos");
    }
    public static void menu(){
        System.out.println("MENU PRINCIPAL"); 
        System.out.println("1. suma");
        System.out.println("2. factorial");
        System.out.println("3. raiz cuadrada");
        System.out.println("4. numero primo");
        System.out.println("5. Salir");
        System.out.print("Ingrese opcion [1-5]");
    }
    public static void inicio(){
       int opcion;
       do{
           menu();
           opcion = Leer.entero();
           switch(opcion){
               case 1: suma();
               break;
               case 2: factorial();
               break;
               case 3: radical();
               break;
               case 4: primo();
               break;
               case 5: salir();
               break;
               default:error();
           }
       }while(opcion!=5);
    }
    //Método principal
    public static void main(String[] args) {
      inicio();
    }
    
}

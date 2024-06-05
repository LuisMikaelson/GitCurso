package Abstracto;
import java.util.Scanner;



public class Holamundo{
        static int suma;
        static int opc;
        public static int getSuma(){ // Cambia el nombre del método a getSuma para seguir las convenciones de nomenclatura
            return suma;
        }
        public static int sumar(int numero1, int numero2){
            suma = numero1+numero2;
            return suma;
        }
        public static int restar(int r1, int r2){
            int resta = r1-r2;
            return resta;
        }

        public static int Multiplicar (int n1, int n2){
            int multi = n1 * n2;
            return multi;
        }
        public static float Dividir ( float n1, float n2){
           float division = n1/n2;
           return division;
        }
    
    public static void main (String [] args){
            Scanner entrar = new Scanner(System.in);
        // System.out.print("Ingrese numero 1 ");
        // int numero = entrar.nextInt();
        // System.out.prin{tln(numero);
        //Declarar arreglo
    //     int[] edad = new int[3];
    //     edad[0] = 2;
    //     edad[2] = 1;
    //    for (int i=0;i<edad.length; i++) {
    //     System.out.println(i);
    //    }


        //Declaración de la matriz

        //  int matriz[][] = {{1,2,3},{4,5,6},{7,8,9}};

        //     for(int i= 0 ; i<3; i++){
        //         for(int j=0; j<3; j++){
        //             System.out.print(matriz[i][j]);
        //         }
        //         System.out.println("");
        //     }
            // System.out.println("Ingresa de cuantas columnas deseas la matriz");
            // int Ncol = entrar.nextInt();
            // System.out.println("Ingresa el numero de filas que deseas para la matriz ");
            // int nFil = entrar.nextInt();
            // int matriz[][] = new int[Ncol][nFil];

            // for(int i=0; i<Ncol; i++){
            //     System.out.println("Ingresa los titulos para tu matriz");
            //     int Datos = entrar.nextInt();
            //     matriz[0][i]= Datos;
            // }
            // for(int i=0; i<Ncol; i++){
            //     for(int j=0; j<nFil; j++){
            //         System.out.print(matriz[i][j]);
            //     }
            //     System.out.println("");
            // }
       
        // do{
        //     System.out.println("Este es un sistema para hacer operacionas matemáticas básicas, ¿qué deseas hacer?  \n 1. Sumar \n 2. Restar  \n 3. Multiplicar \n 4. Dividir \n 5. Salir del sistema ");
        //     opc = entrar.nextInt();
        //     switch (opc) {
        //         case 1:
        //         System.out.println("Vamos a sumar dos numeros.  ");
        //         int numer1 = entrar.nextInt();
        //         System.out.println("ingresa el numero dos ");
        //         int numer2 = entrar.nextInt();
        //         System.out.println("El resultado final es: ");
        //         System.out.println(Holamundo.sumar(numer1,numer2));
        //         System.out.println("OBTENER SUMA DESDE EL GET");
        //         System.out.println(Holamundo.getSuma());
        //             break;
        //         case 2:
        //             System.out.println("Vamos a restar ");
        //             System.out.println("Ingresa el numero 1 ");
        //             int r1 = entrar.nextInt();
        //             System.out.println("Ingresa el número 2");
        //             int r2  = entrar.nextInt();
        //             System.out.println("El resultado de tu resta es :");
        //             System.out.println(Holamundo.restar(r1, r2));
        //             break;
        //         case 3:
        //             System.out.println("Vamos a multiplicar :) ");
        //             System.out.println("Ingresa el primer número ");
        //             int m1 = entrar.nextInt();
        //             System.out.println("Ingresa el numero  2: ");
        //             int m2 = entrar.nextInt();
        //             System.out.println("El resultado de tu multiplicación sería");
        //             System.out.println(Holamundo.Multiplicar(m1, m2));
        //             break;
        //         case 4:
        //             System.out.println("Vamos a dividir :) ");
        //             System.out.println("Ingresa el dividendo ");
        //             float dividendo =  entrar.nextFloat();
        //             System.out.println("Ingresa el divisor ");
        //             float divisor = entrar.nextFloat();
        //             System.out.println("Este es el resultado de tu división ");
        //             System.out.println(Holamundo.Dividir(dividendo, divisor));
        //             break;
        //             case 5:
        //                 break;
        //         default:
        //             System.out.println("Opción Incorrecta");
        //             break;
        //     }
        // }while(opc<5 && opc>0);
        // System.out.println("Feliz día :) ");



        Plantas plantas = new Plantas();
        Animal animal = new Animal();
        System.out.println("La planta se alimenta así :");
        plantas.alimentarse();

        System.out.println("Animal ");
        animal.alimentarse();
    }

    }


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2pooi;

/**
 *
 * @author Alumno
 */
public class Lab2POOI {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        long n = sc.nextLong();
        
        System.out.println(n + " puede ser almacenado en:");
        
        if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
            System.out.println("(*) byte");
        }
        
        if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
            System.out.println("(*) short");
        }
        
        if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
            System.out.println("(*) int");
        }
        
        System.out.println("(*) long");
        
        if (n < Byte.MIN_VALUE || n > Long.MAX_VALUE) {
            System.out.println(n + " no se puede almacenar en ningún tipo de dato primitivo.");
        }
        
        sc.close();
                   
    }
}

import java.util.Scanner;

public class AccionesCondicionales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();
        
        if (n % 2 == 1) {
            System.out.println("Luna");
        } else {
            if (n >= 2 && n <= 5) {
                System.out.println("Sol");
            } else if (n >= 6 && n <= 20) {
                System.out.println("Tierra");
            } else {
                System.out.println("Galaxia");
            }
        }
        
        sc.close();
    }
}

public class AumentoSalarioEmpleado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Pedir el salario anual actual del empleado
        System.out.print("Ingrese el salario anual actual del empleado: ");
        double salarioActual = sc.nextDouble();
        
        // Pedir la calificación de desempeño del empleado (1=excelente, 2=bueno, 3=malo)
        System.out.print("Ingrese la calificación de desempeño (1=excelente, 2=bueno, 3=malo): ");
        int calificacion = sc.nextInt();
        
        double aumento = 0.0; // Variable para almacenar el aumento
        
        // Calcular el aumento según la calificación
        if (calificacion == 1) {
          
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Por favor, ingrese un año como argumento.");
            return;
        }

        try {
            int year = Integer.parseInt(args[0]);
            int remainder = year % 12;
            
            String zodiacSign;

            switch (remainder) {
                case 0:
                    solution = "Mono";
                    break;
                case 1:
                    solution = "Gallo";
                    break;
                case 2:
                    solution = "Perro";
                    break;
                case 3:
                    solution = "Cerdo";
                    break;
                case 4:
                    solution = "Rata";
                    break;
                case 5:
                    solution = "Buey";
                    break;
                case 6:
                    solution = "Tigre";
                    break;
                case 7:
                    solution = "Conejo";
                    break;
                case 8:
                    solution = "Dragón";
                    break;
                case 9:
                    solution = "Serpiente";
                    break;
                case 10:
                    solution = "Caballo";
                    break;
                case 11:
                    solution = "Cabra";
                    break;
                default:
                    solution = "Año no válido";
                    break;
            }

            System.out.println(year + " es el año del " + zodiacSign + ".");
        } catch (NumberFormatException e) {
            System.out.println("Por favor, ingrese un año válido como argumento.");
        }
    }
}

package javalista1;

import java.util.Scanner;

public class DiaADia {
        private static Scanner input = new Scanner(System.in);

        public static void main(String[] args) {
            int a;

            System.out.println("digite um horario:");
            a = input.nextInt();
            if (a >= 0 && a < 24) {
                if (a < 12) {
                    System.out.println("bom dia!");
                } else {
                    if (a < 18) {
                        System.out.println("boa tarde!");
                    } else {
                        System.out.println("boa noite!");
                    }
                }
            } else {
                System.out.println("insira um horario valido");
            }
        }
    }


    

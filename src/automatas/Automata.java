package automatas;

import java.util.Scanner;

public class Automata {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        char respuesta;
        
        do {
            int estado = 0;
            int indice = 0;
            String lexema = "";
            boolean aceptacion = false;

            System.out.print("Ingresa la cadena a evaluar: ");
            String cadena = leer.nextLine();
            
            System.out.println("___________________________________");
            System.out.printf("| %-7s | %-9s | %-10s |\n", "Índice", "Carácter", "Aceptación");
            System.out.println("|---------|-----------|------------|");
            
            for (indice = 0; indice < cadena.length(); indice++) {
                char caracter = cadena.charAt(indice);
                aceptacion = false;
                
                if (caracter != 'a' && caracter != 'b' && caracter != 'c' && caracter != ' ' ) {
                    System.out.println("Caracter invalido");
                    break;
                }
                
                switch (estado) {
                case 0:
                    if (caracter == 'a') {
                        estado = 1;
                        lexema += caracter;
                    } else if (caracter == 'b') {
                        estado = 7;
                        lexema += caracter;
                        
                    } else if (caracter == 'c') {
                        lexema += caracter;
                    } else {
                        System.out.println("Error lexico");
                    }
                    break;
                    
                case 1:
                    if (caracter == 'a') {
                        estado = 2;
                        lexema += caracter;
                    } else if (caracter == 'b') {
                        estado = 3;
                        lexema += caracter;
                    } else if (caracter == 'c') {
                        lexema += caracter;
                    } else {
                        System.out.println("Error lexico");
                    }
                    break;
                    
                case 2:
                    if (caracter == 'a') {
                        estado = 1;
                        lexema += caracter;
                    } else if (caracter == 'b') {
                        estado = 4;
                        lexema += caracter;
                    } else if (caracter == 'c') {
                        lexema += caracter;
                    } else {
                        System.out.println("Error lexico");
                    }
                    break;
                    
                case 3:
                    if (caracter == 'a') {
                        estado = 4;
                        lexema += caracter;
                    } else if (caracter == 'b') {
                        estado = 5;
                        lexema += caracter;
                    } else if (caracter == 'c') {
                        lexema += caracter;
                    } else {
                        System.out.println("Error lexico");
                    }
                    break;
                    
                case 4: 
                    if (caracter == 'a') {
                        estado = 3;
                        lexema += caracter;
                    } else if (caracter == 'b') {
                    	aceptacion = true;
                        estado = 6;
                        lexema += caracter;
                    } else if (caracter == 'c') {
                        lexema += caracter;
                    } else {
                        System.out.println("Error lexico");
                    }
                    break;
                    
                case 5:
                    if (caracter == 'a') {
                    	aceptacion = true;
                        estado = 6;
                        lexema += caracter;
                    } else if (caracter == 'b') {
                        estado = 3;
                        lexema += caracter;
                    } else if (caracter == 'c') {
                        lexema += caracter;
                    } else {
                        System.out.println("Error lexico");
                    }
                    break;
                    
                case 6:
                    aceptacion = true;
                    if (caracter == 'a') {
                    	aceptacion = false;
                        estado = 5;
                        lexema += caracter;
                    } else if (caracter == 'b') {
                    	aceptacion = false;
                        estado = 11;
                        lexema += caracter;
                    } else if (caracter == 'c') {
                        lexema += caracter;
                    } else if (caracter == ' ') {
                        
                    } else
                        System.out.println("Error lexico");
                    
                    break;
                    
                case 7:
                    if(caracter == 'b') {
                        estado = 8;
                        lexema += caracter;
                    } else if (caracter == 'a') {
                        estado = 9;
                        lexema += caracter;
                    } else if (caracter == 'c') {
                        lexema += caracter;
                    } else {
                        System.out.println("Error lexico");
                    }
                    break;
                    
                case 8:
                    if (caracter == 'b') {
                        estado = 7;
                        lexema += caracter;
                    } else if (caracter == 'a') {
                        estado = 10;
                        lexema += caracter;
                    } else if (caracter == 'c') {
                        lexema += caracter;
                    } else {
                        System.out.println("Error lexico");
                    }
                    break;
                case 9:
                    if (caracter == 'b') {
                        estado = 10;
                        lexema += caracter;
                    } else if (caracter == 'a') {
                        estado = 11;
                        lexema += caracter;
                    } else if (caracter == 'c') {
                        lexema += caracter;
                    } else {
                        System.out.println("Error lexico");
                    }
                    break;
                case 10:
                    if (caracter == 'b') {
                        estado = 9;
                        lexema += caracter;
                    } else if (caracter == 'a') {
                    	aceptacion = true;
                        estado = 6;
                        lexema += caracter;
                    } else if (caracter == 'c') {
                        lexema += caracter;
                    } else {
                        System.out.println("Error lexico");
                    }
                    break;
                case 11:
                    if (caracter == 'b') {
                    	aceptacion = true;
                        estado = 6;
                        lexema += caracter;
                    } else if (caracter == 'a') {
                        estado = 9;
                        lexema += caracter;
                    } else if (caracter == 'c') {
                        lexema += caracter;
                    } else {
                        System.out.println("Error lexico");
                    }
                    break;  
                }

                String aceptacionStr = aceptacion ? "Sí" : "No";
                System.out.printf("| %-7d | %-9s | %-10s |\n", indice, caracter, aceptacionStr);
            }
            
            System.out.println("|_________|___________|____________|\n");
            
            if (aceptacion) {
                System.out.print(lexema);
                System.out.println("\nCadena valida\n");
            } else {
                System.out.print(lexema);
                System.out.println("\nCadena no valida\n");
            }
            
            System.out.print("¿Deseas evaluar otra cadena? (s/n): ");
            respuesta = leer.next().charAt(0);
            
            leer.nextLine(); 
            System.out.println();
        
        } while(respuesta == 's' || respuesta == 'S');
        
        System.out.println("Programa finalizado.");
        leer.close();
    }
}

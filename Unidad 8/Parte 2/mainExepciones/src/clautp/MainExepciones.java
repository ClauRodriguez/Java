package clautp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Programa principal que demuestra el manejo de excepciones en Java
 * 
 * @author Rodriguez
 */
public class MainExepciones {
    
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("========== EJERCICIOS EXCEPCIONES ==========\n");
        
        // Ejercicio 1: Division segura
        ejercicio1_DivisionSegura();
        
        // Ejercicio 2: Conversion de cadena a numero
        ejercicio2_ConversionCadena();
        
        // Ejercicio 3: Lectura de archivo
        ejercicio3_LecturaArchivo();
        
        // Ejercicio 4: Excepcion personalizada
        ejercicio4_ExcepcionPersonalizada();
        
        // Ejercicio 5: Try-with-resources
        ejercicio5_TryWithResources();
        
        scanner.close();
    }
    
    private static void ejercicio1_DivisionSegura() {
        System.out.println("--- EJERCICIO 1: Division Segura ---");
        
        try {
            System.out.print("Ingrese el dividendo: ");
            double dividendo = scanner.nextDouble();
            
            System.out.print("Ingrese el divisor: ");
            double divisor = scanner.nextDouble();
            
            if (divisor == 0) {
                throw new ArithmeticException("Error: No se puede dividir por cero");
            }
            
            double resultado = dividendo / divisor;
            System.out.println("Resultado de la division: " + resultado);
            
        } catch (ArithmeticException e) {
            System.out.println("Excepcion capturada: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
        
        System.out.println();
    }
    
    private static void ejercicio2_ConversionCadena() {
        System.out.println("--- EJERCICIO 2: Conversion de Cadena a Numero ---");
        
        try {
            System.out.print("Ingrese un numero entero: ");
            String texto = scanner.next();
            
            int numero = Integer.parseInt(texto);
            System.out.println("Numero convertido exitosamente: " + numero);
            
        } catch (NumberFormatException e) {
            System.out.println("Excepcion capturada: El texto ingresado no es un numero entero valido");
            System.out.println("Detalle: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
        
        System.out.println();
    }
    
    private static void ejercicio3_LecturaArchivo() {
        System.out.println("--- EJERCICIO 3: Lectura de Archivo ---");
        
        try {
            System.out.print("Ingrese el nombre del archivo a leer (ej: ejemplo.txt): ");
            String nombreArchivo = scanner.next();
            
            FileReader fileReader = new FileReader(nombreArchivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            System.out.println("Contenido del archivo:");
            System.out.println("----------------------");
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
            }
            System.out.println("----------------------");
            
            bufferedReader.close();
            fileReader.close();
            
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Excepcion capturada: El archivo no existe o no se puede encontrar");
            System.out.println("Detalle: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
        
        System.out.println();
    }

    private static void ejercicio4_ExcepcionPersonalizada() {
        System.out.println("--- EJERCICIO 4: Excepcion Personalizada ---");
        
        try {
            System.out.print("Ingrese una edad: ");
            int edad = scanner.nextInt();
            
            validarEdad(edad);
            System.out.println("Edad valida: " + edad + " anos");
            
        } catch (EdadInvalidaException e) {
            System.out.println("Excepcion personalizada capturada: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
        
        System.out.println();
    }
    
    private static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0) {
            throw new EdadInvalidaException("La edad no puede ser menor a 0 anos");
        }
        if (edad > 120) {
            throw new EdadInvalidaException("La edad no puede ser mayor a 120 anos");
        }
    }
    
    private static void ejercicio5_TryWithResources() {
        System.out.println("--- EJERCICIO 5: Try-With-Resources ---");
        
        try {
            System.out.print("Ingrese el nombre del archivo a leer (ej: archivo.txt): ");
            String nombreArchivo = scanner.next();
            
            // Try-with-resources: los recursos se cierran automaticamente
            try (FileReader fileReader = new FileReader(nombreArchivo);
                 BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                
                System.out.println("Contenido del archivo (usando try-with-resources):");
                System.out.println("----------------------");
                String linea;
                int numeroLinea = 1;
                while ((linea = bufferedReader.readLine()) != null) {
                    System.out.println(numeroLinea + ": " + linea);
                    numeroLinea++;
                }
                System.out.println("----------------------");
                System.out.println("Archivo leido exitosamente.");
                
            } // Los recursos se cierran automaticamente aqui, incluso si ocurre una excepcion
            
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Excepcion capturada: El archivo no existe o no se puede encontrar");
            System.out.println("Detalle: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error de E/S al leer el archivo: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
        
        System.out.println();
    }
}

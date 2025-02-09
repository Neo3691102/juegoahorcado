import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String palabraSecreta= "inteligencia";
        int intentosMaximos = 10;
        int intento = 0;
        boolean palabraAdivinada = false;

        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        for(int i= 0; i < letrasAdivinadas.length; i++){
            letrasAdivinadas[i] = '_';
        }

       

        boolean letraCorrecta = false;

        while(!palabraAdivinada && intento <= intentosMaximos){
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " letras: (" + palabraSecreta.length() + ")" );
            System.out.println("Introduce una letra porfavor...");
    
            char letra = Character.toLowerCase(scanner.next().charAt(0)); //pide una letra y si usuario escribe una palabra toma la 1er letra

            for(int i = 0; i < palabraSecreta.length(); i++){
                if(palabraSecreta.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                    System.out.println("adivinaste una letra!");
                }
            }

            if(!letraCorrecta){
                
                intento++;
                System.out.println("La letra no coincide, te quedan " + (intentosMaximos - intento) + "intentos");
            }

            if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabraAdivinada = true;
                System.out.println("Felicidades has adivinado la palabra secreta: " + palabraSecreta);
            }
        }
        
        System.out.println("Que pena, te has quedado sin intentos. GAME OVER");



        scanner.close();
    }
}

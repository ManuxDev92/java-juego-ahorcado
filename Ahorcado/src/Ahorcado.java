import java.util.Scanner; 
public class Ahorcado {
    public static void main(String[] args) throws Exception {

        // La clase scanner que nos permite que el usuario escriba
        Scanner scanner = new Scanner(System.in); 

        // Declaramos y asignamos 
        String palabraSecreta = "inteligencia"; 
        int intentosMaximos = 10;
        int intentos = 0; 
        boolean palabraAdivinada = false; 

        // Arreglos: 
        char[] letrasAdivinadas = new char[palabraSecreta.length()]; 

        // un bucle para que lo que hace es iterar en la palabra secreta segun su tamaño indicara la cantidad de "_"
        for(int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_'; 
        
        }

        // Otro bucle, mintras la palabra no sea correcta seguira preguntando 
        while(!palabraAdivinada && intentos < intentosMaximos) {
            // EL Srring valueof se usa cuanod tenemos una palabra de chars 
            System.out.println("Palabra a adivinar: " +  String.valueOf(letrasAdivinadas) + " (" + palabraSecreta.length() + " letras)"); 
            System.out.println("intriduce una letra, por favor"); 
            char letra = Character.toLowerCase(scanner.next().charAt(0)); 

            boolean letraCorrecta = false; 
            
            for(int i = 0; i < palabraSecreta.length(); i++) {
                // El charAt recorre letra por letra
                if(palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra; 
                    letraCorrecta = true; 
                }

            }

            if(!letraCorrecta) {
                intentos++; 
                System.out.println("¡Incorrecto! te quedan " + (intentosMaximos - intentos) + " intentos");                 
            }

            if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true; 
                System.out.println("Felicidades has adivinado la palabra secreta: " + palabraSecreta); 
            }

        }

        if(!palabraAdivinada) {
            System.out.println("Buuu! Te quedaste sin intentos! *****GAME OVER*****"); 
        }

        scanner.close();      
    }
}

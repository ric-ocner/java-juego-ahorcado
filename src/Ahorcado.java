import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in); //clase Scanner que nos permite que el usuario escriba:

        //Declaraciones y asignaciones:
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        //Arreglos:
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        //Estructuras de control: iteractiva (Bucles)
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        while (!palabraAdivinada && intentos < intentosMaximos) {
                                                        //Estos se usa cuando tengo una palabra de un array de chars
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " (" + palabraSecreta.length() + " letras)");
            System.out.println("Introduce una letra por favor: ");
            char letra = Character.toLowerCase(scanner.next().charAt(0)); //usamos la clase scanner para pedir una letra en minúsculas
            boolean letraCorrecta = false;
            
            for (int i = 0; i < palabraSecreta.length(); i++) {
                //Estructuras de control: Condicional
                if(palabraSecreta.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;                    
                }
            }

            if(!letraCorrecta){
                intentos++;
                System.out.println("Letra incorrecta! Te quedan " + (intentosMaximos - intentos) + " intentos.");
            }

            if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabraAdivinada = true;
                System.out.println("Palabra adivinada! " + palabraSecreta);
            }
        }

        if(!palabraAdivinada){
            System.out.println("Te quedaste sin intentos!");
        }

        scanner.close();
    }    

}

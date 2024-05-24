import java.util.Random;

public class CalculoMedia {
    public static void main(String[] args) {
        float[] notas = new float[4];
        float media, soma;
        soma = 0;
        Random random = new Random();
        for(int cont = 0; cont < notas.length; cont++){
            notas[cont] =  random.nextInt(10) + 1;
            System.out.println(notas[cont]);
            soma += notas[cont];
        }
        media = soma / notas.length;
        System.out.printf("Media das notas: %.2f\n", media);

    }
}

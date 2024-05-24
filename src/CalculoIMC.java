import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args){
        double peso, altura, imc;
        String estado;
        Scanner scan = new Scanner(System.in);

        System.out.println("Peso: ");
        peso = scan.nextDouble();
        System.out.println("Altura: ");
        altura = scan.nextDouble();

        imc = peso / (java.lang.Math.pow(altura, 2));

        if (imc >= 40){
            estado = "obesidade mórbida";
        }
        else if(imc >= 35 && imc <= 39.9){
            estado = "obesidade grau II";
        }
        else if(imc >= 30 && imc <= 34.9){
            estado = "obesidade grau I";
        }
        else if(imc >= 25 && imc <= 29.9){
            estado = "levemente acima do peso";
        }
        else if(imc >= 18.6 && imc <= 24.9){
            estado = "levemente acima do peso";
        }
        else{
            estado = "abaixo do peso";
        }

        System.out.println(estado);
    }

}

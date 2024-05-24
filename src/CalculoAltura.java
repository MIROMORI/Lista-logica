public class CalculoAltura {
    public static void main(String[] args) {
        double alturaFrancisco = 1.50;
        double alturaSara = 1.10;
        double aumentoAlturaSara = 0.03;
        double aumentoAlturaFrancisco = 0.02;
        int anos = 0;

        System.out.printf("Francisco: %.2fm\n",alturaFrancisco);
        System.out.printf("Sara: %.2fm\n",alturaSara);
        while(alturaFrancisco > alturaSara){
            alturaFrancisco += aumentoAlturaFrancisco;
            alturaSara += aumentoAlturaSara;
            System.out.printf("Francisco: %.2fm\n",alturaFrancisco);
            System.out.printf("Sara: %.2fm\n",alturaSara);
            anos++;
        }
        System.out.printf("Francisco: %.2fm\n",alturaFrancisco);
        System.out.printf("Sara: %.2fm\n",alturaSara);
        System.out.println(anos);
    }
}

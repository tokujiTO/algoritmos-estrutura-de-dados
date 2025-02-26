import java.util.Random;

public class NossoTesteVetor {
    public static void main(String[] args) {
        NossoVetor v1 = new NossoVetor(4);
        // for (int i = 0; i<=100; i++){
        //     v1.inserir(i);
        //     System.out.println("inseriu " + i + " tamanho: " + v1.getTamanho());
        //     if (i%10==0){
        //         System.out.println(v1);
        //     }
        // }
        // for (int i = 1; i <= 80; i++){
        //     v1.remover();
        // }
        // System.out.println(v1);
        // System.out.println("Tamanho = " + v1.getTamanho());

        Random r = new Random();

        for (int i = 1; i<=200; i++){
            if (r.nextBoolean()){
                v1.inserir(i);
            } else {
                v1.remover();
            }
            System.out.println(v1);
            System.out.println("Tamanho = " + v1.getTamanho());
        }
    }
}

package introducao.AOlaDevDojo;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        long counter = 0L;

        for (long i = 1; i <= 10000 ; i++) {
            if (i % 2 == 0){
                counter=i;
                System.out.println("Pares " + counter);
            } else {
                counter = i;
                System.out.println("Não é um número par ->  " + counter);
            }

        }
//        while (counter < 10) {
//
//            counter += 1;
//            System.out.println(counter);
//        }
//        do {
//            System.out.println(counter + " --- Do while ---");
//            counter++;
//
//        } while (counter < 12);
//        int contador = 0;
//        for (int i = 1; i <= 250; i++) {
//            contador += i;
//            System.out.println(contador);
//        }
    }
}

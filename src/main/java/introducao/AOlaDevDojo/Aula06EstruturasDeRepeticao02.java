package introducao.AOlaDevDojo;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // primeiros 25 números de um dado valor

        int counter = 50;
        for (int i = 0; i < counter; i++) {

            System.out.println(i);
            if (i > 25)
                break;
            System.out.println("i " + i);
        }

    }
}

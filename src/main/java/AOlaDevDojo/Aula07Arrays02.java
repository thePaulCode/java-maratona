package AOlaDevDojo;

public class Aula07Arrays02 {
    public static void main(String[] args) {

        // local - inicialização
        // byte short int long float double 0
        //char ' \\u000 ' ' '
        // boolean false
        // String null

        // tipo reference [] - Objects
        int[] ages = new int[3];
        ages[0] = (int) 12.0f;
        ages[1] = 22;
        ages[2] = 32;
        for (int i = ages.length-1; i >=0 ; i--) {
            System.out.println("Idades -- " + ages[i]);
        }

        String[] nomes = new String[3];
        System.out.println(nomes);
        nomes[0] = "Stella";
        nomes[1] = "Anna";
        nomes[2] = "Paul";
        nomes = new String[4];
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nomes: " + nomes[i]);
        }
        System.out.println(nomes);

    }
}

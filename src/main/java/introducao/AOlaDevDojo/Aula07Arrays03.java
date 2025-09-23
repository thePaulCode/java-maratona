package introducao.AOlaDevDojo;

public class Aula07Arrays03 {
    public static void main(String[] args) {

        // local - inicialização
        // byte short int long float double 0
        //char ' \\u000 ' ' '
        // boolean false
        // String null

        // tipo reference [] - Objects
        int[] ages = new int[3];

        int[] numeros = new int[]{2,4,6,8,10};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("fori "+numeros[i]);
        }

        for(int num:numeros){
            System.out.println("foreach" + num);
        }



    }
}

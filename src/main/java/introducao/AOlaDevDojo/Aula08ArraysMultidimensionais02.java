package introducao.AOlaDevDojo;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        executar();
    }

    private static void executar() {
        int[][] arrayInt = new int[2][];

        int[] arrayBase2 = {1, 2, 3, 4, 5, 6};
        arrayInt = new int[][]{{10,20,30}, arrayBase2};

        for (int[] arrayBase : arrayInt) {
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
            System.out.println("\n---");
        }
    }
}

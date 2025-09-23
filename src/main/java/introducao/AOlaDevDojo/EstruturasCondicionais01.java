package introducao.AOlaDevDojo;

public class EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 11;
        boolean isAutorizadoComprarBegida = idade >= 18;
        if(isAutorizadoComprarBegida){
            System.out.println("Venda de bebida alcóolica autorizada.");
        } else {
            System.out.println("Venda de bebida alcóolica proibida para menores.");
        }
        if(!isAutorizadoComprarBegida){
            System.out.println("Venda de bebida alcóolica proibida para menores.");
        }
        
    }
}

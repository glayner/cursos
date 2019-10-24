
package TratamentoExcecoes;


public class ExecDemo1 {
    public static void main(String[] args) {
        int nums [] = new int[4];
        try{
        nums[3] = 10;
            System.err.println("Erros não exibidos");
        }catch(ArrayIndexOutOfBoundsException exex)   {
            System.out.println("Fora dos limites");
        }
        System.err.println("Aqui estamos fora doa catch");
    }
}


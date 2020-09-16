package TratandoErros;

public class Finally {
        public static void main(String[] args) {
            int[] numeros = {4, 8, 16, 32, 64, 128};
            int[] deno = {2, 0, 4, 8, 0};

            for (int i = 0; i < numeros.length; i++) {
                try {
                    System.out.println (numeros[i] + "/" + deno[i] + " = " + (numeros[i] / deno[i]));
                } catch (ArithmeticException e){
                    System.out.println ("Erro ao dividir por 0" );
                    System.exit (0);
                } catch(ArrayIndexOutOfBoundsException exception){
                    System.out.println ("Posição do array inválida" );
                    System.exit (0);
                } finally {
                    System.out.println ("Essa linha é impressa sempre após o try ou catch" );
                    System.out.println ( );
                }
            }
        }
}

package TratandoErros;

public class MultiplosCatchFamilia {
    public static void main(String[] args) {

        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] deno = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println (numeros[i] + "/" + deno[i] + " = " + (numeros[i] / deno[i]));
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
                System.out.println ("Aconteceu um erro");
            }
        }
    }
}


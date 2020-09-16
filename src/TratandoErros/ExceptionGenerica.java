package TratandoErros;

public class ExceptionGenerica {
        public static void main(String[] args) {

            int[] numeros = {4, 8, 16, 32, 64, 128};
            int[] deno = {2, 0, 4, 8, 0};

            for (int i = 0; i < numeros.length; i++) {
                try {
                    System.out.println (numeros[i] + "/" + deno[i] + " = " + (numeros[i] / deno[i]));
                } catch (Exception e) {
                    System.out.println (e.getMessage ());
                    e.printStackTrace ();
                }
            }
        }
    }

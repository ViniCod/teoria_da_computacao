/* Um autômato que reconhece o conjunto das palavras w
sobre os dígitos 0 e 1 tais que P|w| i=1 2|w|−iwi mod 3 = 1. 
Ou seja, w, quando interpretado como um número na base 2, 
tem resto 1 se dividido por 3. */

public class AfdExe7 {

    public static void main (String[] args) {
        String entrada = "111";
        int estado = 0;
        int posicao = 0;

        while (posicao < entrada.length()) {

            char elemento = entrada.charAt(posicao);

            System.out.println(
                entrada.substring(0, posicao)+"|q"+estado +"|"+entrada.substring(posicao)
            );

            if (estado == 0 && elemento == '0') {
                estado = 0;
            } else if (estado == 0 && elemento == '1') {
                estado = 1;
            } else if (estado == 1 && elemento == '0') {
                estado = 2;
            } else if (estado == 1 && elemento == '1') {
                estado = 0;
            } else if (estado == 2 && elemento == '0') {
                estado = 1;
            } else if (estado == 2 && elemento == '1') {
                estado = 2;
            }
            posicao++;
        }

        System.out.println(
            entrada.substring(0, posicao)+"|q"+estado+"|"+entrada.substring(posicao)
        );
        if (estado == 1) System.out.println("aceita");
        else System.out.println("rejeitada");

    }

}
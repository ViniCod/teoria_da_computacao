public class AfdExe6 {

    public static void main (String[] args) {
        String entrada = "abaabab";
        int estado = 0;
        int posicao = 0;

        while (posicao < entrada.length()) {

            char elemento = entrada.charAt(posicao);

            System.out.println(
                entrada.substring(0, posicao)+"|q"+estado +"|"+entrada.substring(posicao)
            );

            if (estado == 0 && elemento == 'a') {
                estado = 1;
            } else if (estado == 0 && elemento == 'b') {
                estado = 3;
            } else if (estado == 1 && elemento == 'a') {
                estado = 0;
            } else if (estado == 1 && elemento == 'b') {
                estado = 2;
            } else if (estado == 2 && elemento == 'a') {
                estado = 3;
            } else if (estado == 2 && elemento == 'b') {
                estado = 1;
            } else if (estado == 3 && elemento == 'a') {
                estado = 2;
            } else if (estado == 3 && elemento == 'b') {
                estado = 0;
            }
            posicao++;
        }

        System.out.println(
            entrada.substring(0, posicao)+"|q"+estado+"|"+entrada.substring(posicao)
        );
        if (estado == 3) System.out.println("aceita");
        else System.out.println("rejeitada");

    }

}
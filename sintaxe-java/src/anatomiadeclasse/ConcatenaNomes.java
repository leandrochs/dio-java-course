package anatomiadeclasse;

public class ConcatenaNomes {
    public static void main(String[] args) throws Exception {
        String nome = "Leandro";
        String sobrenome = "Silva";

        String nomeCompleto = concatenaNomes(nome, sobrenome);
        System.out.println(nomeCompleto);
    }

    public static String concatenaNomes(String nome, String Sobrenome) {
        return nome.concat(" ").concat(Sobrenome);
    }
}

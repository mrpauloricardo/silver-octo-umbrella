import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        Livro livro1 = new Livro("Aprendendo Java", "John Doe");
        Livro livro2 = new Livro("Programação em C++", "Jane Smith");

        Usuario usuario1 = new Usuario("Paulo", 1);
        Usuario usuario2 = new Usuario("Maria", 2);

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        biblioteca.adicionarUsuario(usuario1);
        biblioteca.adicionarUsuario(usuario2);

        biblioteca.emprestarLivro(usuario2, livro1);
        biblioteca.devolverLivro(usuario1, livro2);

        List<Livro> livrosEncontrados = biblioteca.pesquisarLivroPorTitulo("Aprendendo Java");
        for (Livro livro : livrosEncontrados) {
            System.out.println("Livro encontrado: " + livro.getTitulo() + " de " + livro.getAutor());
        }
    }
}
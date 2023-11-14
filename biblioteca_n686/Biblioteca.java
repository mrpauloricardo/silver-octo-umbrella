import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> acervo;
    private List<Usuario> usuarios;

    public Biblioteca() {
        acervo = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        acervo.add(livro);
    }

    public void emprestarLivro(Usuario usuario, Livro livro) {
        if (usuarios.contains(usuario) && acervo.contains(livro)) {
            System.out.println(usuario.getNome() + " emprestou o livro: " + livro.getTitulo());
        } else {
            System.out.println("Usuário ou livro não encontrado na biblioteca.");
        }
    }

    public void devolverLivro(Usuario usuario, Livro livro) {
        if (usuarios.contains(usuario) && acervo.contains(livro)) {
            System.out.println(usuario.getNome() + " devolveu o livro: " + livro.getTitulo());
        } else {
            System.out.println("Usuário ou livro não encontrado na biblioteca.");
        }
    }

    public List<Livro> pesquisarLivroPorTitulo(String titulo) {
        List<Livro> resultados = new ArrayList<>();
        for (Livro livro : acervo) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                resultados.add(livro);
            }
        }
        return resultados;
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
}
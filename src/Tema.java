import java.util.List;

public class Tema {
    String titulo;
    List<Documento>documento;
    List<Tema>subtema;

    public Tema(){

    }

    public Tema(String titulo, List<Documento> documento, List<Tema> subtema) {
        this.titulo = titulo;
        this.documento = documento;
        this.subtema = subtema;
    }
}

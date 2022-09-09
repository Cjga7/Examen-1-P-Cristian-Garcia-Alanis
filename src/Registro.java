import java.util.List;

public class Registro {
    Integer registro;
    List<Documento>documeto;

    public Registro (){

    }

    public Registro(Integer registro, List<Documento> documeto) {
        this.registro = registro;
        this.documeto = documeto;
    }
}

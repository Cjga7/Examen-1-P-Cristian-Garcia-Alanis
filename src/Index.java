import java.util.Date;

public class Index {
    Boolean hash;
    Integer tamaño;
    Date fecha;
    Documento documento;
    public Index(){

    }
    public Index(Boolean hash, Integer tamaño, Date fecha, Documento documento) {
        this.hash = hash;
        this.tamaño = tamaño;
        this.fecha = fecha;
        this.documento = documento;
    }
}

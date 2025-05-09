package register;
import java.util.ArrayList;
import java.util.List;
public class Registro<T> {
    private List<T> registros;

    public Registro() {
        registros = new ArrayList<>();
    }

    public void add(T simulacao) {
        registros.add(simulacao);
    }

    public int size() {
        return registros.size();
    }

    public List<T> getRegistros() {
        return new ArrayList<>(registros);
    }

    public boolean isEmpty() {
        return registros.isEmpty();
    }

    @Override
    public String toString() {
        return "registros = " + getRegistros();
    }
}

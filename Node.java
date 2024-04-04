public class Node<E> {
    Paciente data;


    public Node(Paciente data) {
        this.data = data;
    }

    public Paciente getKey() {
        return data;
    }
}
public class Binarytree<E> {
    Node<Paciente> association;
    Binarytree<E> left;
    Binarytree<E> right;
    // Constructor
    public Binarytree(Node<Paciente> association) {
        this.association = association;
        this.left = null;
        this.right = null;
    }

    public Node<Paciente> getAssociation() {
        return this.association;
    }

    public void setAssociation(Node<Paciente> association) {
        this.association = association;
    }

    public Binarytree<E> getLeft() {
        return this.left;
    }

    public void setLeft(Binarytree<E> left) {
        this.left = left;
    }

    public Binarytree<E> getRight() {
        return this.right;
    }

    public void setRight(Binarytree<E> right) {
        this.right = right;
    }


}

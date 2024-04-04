public class ArbolTipoNoBinario<E> {
    private Binarytree<E> root;
    public ArbolTipoNoBinario() {
        this.root = null;
    }

    public void insert(Paciente paciente) {
        Node<Paciente> newAssociation = new Node<Paciente>(paciente);
        
        if (root == null) {
            root=new Binarytree<E>(newAssociation);
        } else {
            insertNode(root, newAssociation);
        }
    }
    
    private Binarytree<E> insertNode(Binarytree<E> current, Node<Paciente> associaton) {
        if (current == null) {
            return new Binarytree<E>(associaton);
        }
    
        if (associaton.getKey().getPrioridad().compareTo(current.association.getKey().getPrioridad()) > 0) {
            current.left=insertNode(current.left, associaton);
        } else if (associaton.getKey().getPrioridad().compareTo(current.association.getKey().getPrioridad()) < 0) {
           current.right=insertNode(current.right, associaton);
        } else {
            current.right=insertNode(current.right, associaton);
            
        }
        
        return current;
}

    
public void eliminarRaizYReemplazar() {
    if (root == null) {
        System.out.println("El árbol está vacío.");
        return;
    }

    System.out.println("Cliente " + root.association.getKey().getNombre() + " fue atendido. Pase al siguiente:");

    if (root.left == null && root.right == null) {

        root = null; // Si la raíz no tiene hijos, simplemente la eliminamos
    } else if (root.right != null) {

        Binarytree<E> siguiente = encontrarMasDerecha(root); // Buscamos el nodo más a la izquierda del subárbol derecho
        eliminarRaizYReemplazar(root); // Llamada recursiva para eliminar el siguiente nodo en el subárbol derecho
    } else {

        Binarytree<E> siguiente = encontrarMasIzquierda(root); // Buscamos el nodo más a la izquierda del subárbol izquierdo

        eliminarRaizYReemplazar(root); // Llamada recursiva para eliminar el siguiente nodo en el subárbol izquierdo
    }
}
public Binarytree<E> encontrarMasIzquierda(Binarytree<E> current) {
    if (current.left != null) {
        current.left = encontrarMasIzquierda(current.left); // Buscamos el nodo más a la izquierda en el subárbol izquierdo
        return current;
    } else {
        root.association = current.association; // Reemplazamos la raíz con el nodo encontrado más a la izquierda
        return null; // Dejamos esa hoja como nula
    }
}

public Binarytree<E> encontrarMasDerecha(Binarytree<E> current) {
    if (current.right != null) {
        current.right = encontrarMasDerecha(current.right); // Buscamos el nodo más a la derecha en el subárbol derecho
        return current;
    } else {
        root.association = current.association; // Reemplazamos la raíz con el nodo encontrado más a la derecha
        return null; // Dejamos esa hoja como nula
    }
}
private void eliminarRaizYReemplazar(Binarytree<E> current) {
    if (current.right == null) {
        if (current.left == null) {

            
        } else if (current.association.getKey().getPrioridad().compareTo(current.left.association.getKey().getPrioridad()) > 0){
            Node<Paciente>xd=null;
            xd=current.association ;
            current.association=current.left.association;
            current.left.association=xd;
            eliminarRaizYReemplazar(current.left);
           
        }else{

        }
    } else if(current.association.getKey().getPrioridad().compareTo(current.right.association.getKey().getPrioridad()) > 0) {
        Node<Paciente>xd=null;
        xd=current.association ;
        current.association=current.right.association;
        current.right.association=xd;
        eliminarRaizYReemplazar(current.right);
    }else{

    }
    
}

private void inOrder(Binarytree<E> node) {
    // In order the node s left and right side of the node.
    if (node != null) {
        inOrder(node.left);
        System.out.println("(" + node.association.getKey().getNombre() + " " + node.association.getKey().getPrioridad() + ")");
        inOrder(node.right);
    }
}
}


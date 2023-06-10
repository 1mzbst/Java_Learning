package org.example.algrs.lectures;

public class Tree {
    Node root;

    public boolean exist (int value) {
        if (root != null) {
            Node node = find(root, value);
            if (node != null) {
                return true;
            }
        }
        return false;
    }

    /**
     * Обход в глубину
     * @param node
     * @param value
     * @return возвращает ноду соответсвующую значениею
     */
    private Node find(Node node, int value){
        if (node.value == value){
            return node;
        }else{
            for (Node child : node.children ) {
                Node result = find(child, value);
                if (result != null){
                    return result;
                }
            }
        }
        return null;
    }

    /**
     * Обход  в ширину
     * @param value
     * @return
     */
    private Node find(int value){
        list<Node> Line = new ArrayList<>();
        Line.add(root);
        while(Line.size() > 0) {
            list<Node> nextLine = new ArrayList<>();
            for (Node node : line) {
                if (node.value == value) {
                    return node;
                }
                nextLine.addAll(node.children);
            }
            line = nextLine;
        }
        return null;
    }

    public class Node {
        int value;
        List<Node> children;

    }
}

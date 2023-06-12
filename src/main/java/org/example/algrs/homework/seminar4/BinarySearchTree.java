package org.example.algrs.homework.seminar4;


public class BinarySearchTree {
    private TreeNode head;
    private class TreeNode {
        int value;
        private Color color;
        private TreeNode left;
        private TreeNode right;
        private TreeNode parent;

        @Override
        public String toString() {
            return "TreeNode{" +
                    "value=" + value +
                    ", color=" + color +
                    '}';
        }
    }

    /**
     * @apiNote Добовление "головной" ноды
     * @param value
     * @return
     */
    public boolean add (int value) {
        if (head !=null) {
            boolean result = addNode(head, value);
            head = rebalance(head);
            head.color = Color.BLACK;
            return result;

        }else {
            head = new TreeNode();
            head.color = Color.BLACK;
            head.value = value;
            return true;
        }
    }

    /**
     * @apiNote Добовление ноды в КЧ дерево
     * @param node
     * @param value
     * @return boolean
     */
    private boolean addNode (TreeNode node, int value){
        if (node.value == value) {
            return false;
        }else {
            if (node.value>value){
                if (node.left != null) {
                    boolean result = addNode(node.left, value);
                    node.left = rebalance(node.left);
                    return result;
                }else {
                    node.left= new TreeNode();
                    node.left.color = Color.RED;
                    node.left.value = value;
                    return true;
                }
            }else{
                if (node.right !=null){
                    boolean result = addNode(node.right, value);
                    node.right = rebalance(node.right);
                    return result;
                }else {
                    node.right = new TreeNode();
                    node.right.color = Color.RED;
                    node.right.value = value;
                    return true;
                }
            }
        }
    }

    /**
     * @apiNote Ребаланс
     * @param node
     * @return result (ноду)
     */
    private TreeNode rebalance(TreeNode node) {
        TreeNode result = node;
        boolean needRebalance;
        do {
            needRebalance = false;
            if (result.right != null && result.right.color == Color.RED &&
                    (result.left ==null || result.left.color == Color.BLACK)) {
                needRebalance = true;
                result = rightSwap(result);
            }
            if (result.left != null && result.left.color == Color.RED &&
                    result.left.left != null && result.left.left.color == Color.RED) {
                needRebalance = true;
                result = leftSwap(result);
            }
            if (result.left != null && result.left.color == Color.RED &&
                    result.right!=null && result.right.color == Color.RED) {
                needRebalance = true;
                colorSwap(result);
            }
        }
        while (needRebalance);
        return result;
    }

    /**
     * @apiNote Правый поворот
     * @param node
     * @return rightChild
     */
    private TreeNode rightSwap(TreeNode node) {
        TreeNode rightChild = node.right;
        TreeNode betweenChild = rightChild.left;
        rightChild.right = node;
        node.left = betweenChild;
        rightChild.color = node.color;
        node.color = Color.RED;
        return rightChild;
    }

    /**
     * @apiNote Левый поворот
     * @param node
     * @return leftChild
     */
    private TreeNode leftSwap(TreeNode node) {
        TreeNode leftChild = node.left;
        TreeNode betweenChild = leftChild.right;
        leftChild.right = node;
        node.left = betweenChild;
        leftChild.color = node.color;
        node.color = Color.RED;
        return leftChild;

    }

    /**
     * @apiNote Смена цвета
     * @param node
     */
    private void colorSwap(TreeNode node) {
        node.right.color = Color.BLACK;
        node.left.color = Color.BLACK;
        node.color = Color.RED;
    }

    /**
     * @apiNote Поиск
     * @param value
     * @return
     */
    public boolean find(int value){
        TreeNode currentNode = head;
        while(currentNode != null){
            if (currentNode.value == value) return true;
            else if (value > currentNode.value){
                currentNode = currentNode.right;

            }else {
                currentNode = currentNode.left;
            }
        }
        return false;
    }

    /**
     * @apiNote Цветовая маркировка
     */
    private enum Color{
        RED, BLACK
    }

}

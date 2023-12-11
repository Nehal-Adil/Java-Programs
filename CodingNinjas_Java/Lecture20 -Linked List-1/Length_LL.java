package CodingNinjas_DSA;

public class Length_LL {
    //Length of LinkedIn List
    static int length(CN_Node<Integer> head) {
        CN_Node<Integer> temp = head;

        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        CN_Node<Integer> head = CN_Node.takeInput();
        System.out.println(length(head));
    }

}

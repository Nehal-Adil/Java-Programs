package CodingNinjas_DSA;

public class Length_LL {
    //Length of LinkedIn List
    static int length(CodingNinjasNode<Integer> head) {
        CodingNinjasNode<Integer> temp = head;

        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        CodingNinjasNode<Integer> head = CodingNinjasNode.takeInput();
        System.out.println(length(head));
    }

}

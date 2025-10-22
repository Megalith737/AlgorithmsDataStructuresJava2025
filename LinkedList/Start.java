import java.lang.reflect.Array;
import java.security.cert.CollectionCertStoreParameters;
import java.util.*;

public class Start {
    public static void main(String[] args){
        Solution opt = new Solution();

        ListNode l1_node3 = new ListNode(4, null); //example1
        ListNode l1_node2 = new ListNode(2, l1_node3);
        ListNode list1 = new ListNode(1, l1_node2);

        ListNode l2_node3 = new ListNode(4, null);
        ListNode l2_node2 = new ListNode(3, l2_node3);
        ListNode list2 = new ListNode(1, l2_node2);

        System.out.print("List 1: " );
        printList(list1);
        System.out.print("List 2: ");
        printList(list2);

        ListNode result1 = opt.mergeTwoLists(list1, list2);
        System.out.print("Result: ");
        printList(result1);


        ListNode list3= null; //example2
        ListNode list4 = null;

        System.out.print("\n\nList 1: " );
        printList(list3);
        System.out.print("List 2: ");
        printList(list4);

        ListNode result2 = opt.mergeTwoLists(list3, list4);
        System.out.print("Result: ");
        printList(result2);


        ListNode list5 = null; //example3
        ListNode list6 = new ListNode(0, null);

        System.out.print("\n\nList 1: " );
        printList(list5);
        System.out.print("List 2: ");
        printList(list6);

        ListNode result3 = opt.mergeTwoLists(list5, list6);
        System.out.print("Result: ");
        printList(result3);

        System.out.println("-----------------------");

        List<Integer> list7 = new LinkedList<>(Arrays.asList(1, 2, 4));
        List<Integer> list8 = new LinkedList<>(Arrays.asList(1, 3, 4));;
        System.out.println("Result:" + mergeWithCollections(list7, list8) + "\n\n");

        List<Integer> list9 = new LinkedList<>();
        List<Integer> list10 = new LinkedList<>();;
        System.out.println("Result:" + mergeWithCollections(list9, list10) + "\n\n");

        List<Integer> list11 = new LinkedList<>();
        List<Integer> list12 = new LinkedList<>(List.of(0));
        System.out.println("Result:" + mergeWithCollections(list11, list12));

    }


    public static void printList(ListNode head) {
        System.out.print("[");
        ListNode current = head;

        while (current != null) {
            System.out.print(current.val);

            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next; // Переходимо до наступного елемента
        }
        System.out.println("]");
    }

    public static List<Integer> mergeWithCollections(List<Integer> list1, List<Integer> list2) {
        List<Integer> merged = new LinkedList<>(list1);

        merged.addAll(list2);

        Collections.sort(merged);

        return merged;
    }
}

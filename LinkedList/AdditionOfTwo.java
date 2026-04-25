import java.util.Scanner;

public class AdditionOfTwo {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    // Function to add two linked lists
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
        }

        return dummy.next;
    }

    // Function to create linked list from user input
    public static ListNode createList(Scanner sc, int n) {
        System.out.println("Enter digits (in reverse order):");

        ListNode head = new ListNode(sc.nextInt());
        ListNode current = head;

        for (int i = 1; i < n; i++) {
            current.next = new ListNode(sc.nextInt());
            current = current.next;
        }

        return head;
    }

    // Function to print list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    // 🔥 MAIN METHOD
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First list
        System.out.print("Enter number of nodes for first list: ");
        int n1 = sc.nextInt();
        ListNode l1 = createList(sc, n1);

        // Second list
        System.out.print("Enter number of nodes for second list: ");
        int n2 = sc.nextInt();
        ListNode l2 = createList(sc, n2);

        // Add lists
        ListNode result = addTwoNumbers(l1, l2);

        // Output
        System.out.print("Result: ");
        printList(result);

        sc.close();
    }
}
import java.util.*;

public class Driver {


    public static void main(String[] args) {
        Bank b = Bank.makeDefaultBank();
        /**
         * 3. Create a map of strings to balances, that is <String, Double>
         */
        Map<String, Double> balances =
                new HashMap<>();


        for (CustomCheckingAccount a : b.accounts) {
            /**
             * 4. if a's account owner isn't in the map, add a balance of 0
             */
            if (balances.containsKey(a.getOwnerName())) {
            } else
            {
                balances.put(a.getOwnerName(), 0.0);
            };


            /**
             * 5. Update the balance in balances of user a to their balance + a's balance
             */
            balances.put(a.getOwnerName(),a.getBalance() + balances.get(a.getOwnerName()));
        }

        SortedSet<Integer> int_set = new TreeSet<>();
        List<Integer> int_list = new ArrayList<>();

        for (int i = 0; i != 5; i = (i + 2) % 7) {
            /**
             * 6. Add i to int_set
             */
            int_set.add(i);

            /**
             * 7. Add i to int_list
             */
            int_list.add(i);
        }

        System.out.println("List output:");
        printIterator(int_list.iterator());
        System.out.println("\nSet output:");
        printIterator(int_set.iterator());


    }

    public static void printIterator(Iterator<Integer> iter) {
        iter.forEachRemaining(System.out::println);
    }
}

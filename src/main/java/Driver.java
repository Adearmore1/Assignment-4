import java.util.Map;

public class Driver {
    public static void main(String[] args){
        Bank b = Bank.makeDefaultBank();
        /**
         * 3. Create a map of strings to balances, that is <String, Double>
         */
        Map<String, Double> balances = null;

        for(CustomCheckingAccount a: b.accounts){
            /**
             * 4. if a's account owner isn't in the map, add a balance of 0
             */

            /**
             * 5. Update the balance in balances of user a to their balance + a's balance
             */
        }
    }
}

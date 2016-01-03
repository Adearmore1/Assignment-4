import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import static util.Enhanced.Assert;
/**
 * Created by jstanton on 11/23/15.
 */
public class Bank {

    /**
     * 1. Pick one of the following code snippets and insert it in the appropriate place
     * - new ArrayList<>()
     * - new HashSet<>()
     * - new HashMap<>()
     */

    public List<CustomCheckingAccount> accounts = new ArrayList<>();

    public static Bank makeDefaultBank(){
        Bank b = new Bank();
        List<CustomCheckingAccount> accounts = b.accounts;

        CustomCheckingAccount alice1 = new CustomCheckingAccount("alice", 300.0);
        CustomCheckingAccount bob1 = new CustomCheckingAccount("bob", 200.0);
        CustomCheckingAccount alice2 = new CustomCheckingAccount("alice", 700.0);

        /**
         * 2. Add alice1, bob1, and alice2 to accounts
         */
        accounts.add(alice1);
        accounts.add(bob1);
        accounts.add(alice2);


        Assert(accounts.get(0).getOwnerName().equals("alice")
                        && accounts.get(1).getOwnerName().equals("bob")
                        && accounts.get(2).getOwnerName().equals("alice")
        );

        return b;
    }
}

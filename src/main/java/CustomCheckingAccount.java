import com.stantonj.hca.java2015.assignment5.CheckingAccount;

public class CustomCheckingAccount extends CheckingAccount {
    private String owner;

    public CustomCheckingAccount(String owner, Double balance){
        super(balance);
        this.owner = owner;
    }

    public String getOwnerName(){
        return owner;
    }
}

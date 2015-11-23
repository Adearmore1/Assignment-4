package util;

public class Enhanced {
    public static void Assert(boolean result){
        if(!result)
            throw new AssertionError();
    }
}

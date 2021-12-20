package Examplejunit;

public class AccountTest {
	public static final int MINIMUMBALANCE=500;
	public static final int MIN_SCORE=5;
	int accountbalance=1000;
    public boolean widCheck(int widAmount){

        if((accountbalance-widAmount)<MINIMUMBALANCE)
            return false;
        else
            return true;
    }

    public boolean checkCardEligibl(int accountBalance, int loanAmount){

        if((accountBalance/loanAmount)>=MIN_SCORE){
            return true;
        }else {
            return false;
        }
    }
}




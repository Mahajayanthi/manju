package ExamplejunitTest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runners.Parameterized.Parameter;

import Examplejunit.AccountTest;

public class AccountTestTest {
	private AccountTest atest;
	@BeforeClass
	public static void beforeall()
	{
		System.out.println("starting test");
	}
@AfterClass
public static void afterall()
{
	System.out.println("ending test");
}
@Before
public void  setup()
{
	atest=new AccountTest();
	System.out.println("starting a test");
}
@After 
public void aftersetup()
{
	System.out.println("ending a test");
}

  @Test public void returnTrueifwidamountgreaterthanminbalance() { int
  accountbalance=1000; int widamount=900; boolean result=atest.widCheck(20);
  assertTrue(result); } 

  @ParameterizedTest(name = "amont = {0}, loan = {1}")
  
  @Test public void returnfalseifwidamountgreaterthanminbalance() { int
  accountbalance=700; int widamount=400; boolean result=atest.widCheck(400);
  assertFalse(result); } 
 
  
  @ParameterizedTest
  
  @ValueSource(ints = {300, 400,350, 600, 100})
  
  public void eligibleToWidArr(int widAmount){ int widAmt = widAmount; boolean
  result = atest.widCheck(widAmt); assertTrue(result); }

  @CsvSource(value = {"100000, 20000","350000, 40000", "500000, 70000"}) public
  void eligibleForCard1(int accountBalance, int loanAmount){
  
  
  int amount = accountBalance; int loan = loanAmount;
  
  boolean result = atest.checkCardEligibl(amount, loan);
  
  assertTrue(result); }
  
  
  @ParameterizedTest(name = "amont = {0}, loan = {1}")
  
  @CsvFileSource(resources = "/check.csv", numLinesToSkip = 1) public void
  eligibleForCard2(int accountBalance, int loanAmount){ int amount =
  accountBalance; int loan = loanAmount;
  
  boolean result = atest.checkCardEligibl(amount, loan);
  
  assertTrue(result);
  
  }
  
  }
  
  
  
 
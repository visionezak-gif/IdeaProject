import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

        @Test
       public void testThatAccountIsZero(){

       AcccountCreation account = new AcccountCreation();

      assertEquals(0, account.getBalance());

   }

       @Test
    public void testThatICanDeposit5KTMyAccountBalance(){
        AcccountCreation account = new AcccountCreation();
        assertEquals(0, account.getBalance());


           account.deposit(5000);
           assertEquals(5000, account.getBalance());

       }


       @Test
    public void testThatIwithdrew2K_balanceIs3K(){
           AcccountCreation account = new AcccountCreation();
           account.deposit(5000);
           assertEquals(5000, account.getBalance());


           account.withdrawal(2000);
           assertEquals(3000, account.getBalance());


       }


    @Test
    public void testThatYouCannotWithdrawMoneyLowerThanZero(){
        AcccountCreation account = new AcccountCreation();

        assertEquals(0, account.getBalance());

        account.deposit(5000);
        assertEquals(5000, account.getBalance());


        account.smallWithdrawal(-5000);
        assertEquals(0, account.getBalance());


    }



}

import org.example.exerciceBonus01.BankAccount;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    void testDepositShouldReturnValeurDuCompteFinal() {
        // Arrange
        BankAccount account = new BankAccount(100, 0.05);

        // Act
        account.deposit(50);

        // Assert
        assertEquals(150, account.getBalance());
    }

    @Test
    void testWithdrawSufficientBalanceShouldReturnValeurDuCompteFinal() {
        // Arrange
        BankAccount account = new BankAccount(100, 0.05);

        // Act
        account.withdraw(50);

        // Assert
        assertEquals(50, account.getBalance());
    }

    @Test
    void testWithdrawInsufficientBalanceShouldThrowException() {
        // Arrange
        BankAccount account = new BankAccount(100, 0.05);

        // Act & Assert
        assertThrows(IllegalStateException.class, () -> {
            account.withdraw(150);
        });
    }

    @Test
    void testTransferShouldReturnValeurDesComptesFinals() {
        // Arrange
        BankAccount sourceAccount = new BankAccount(100, 0.05);
        BankAccount targetAccount = new BankAccount(50, 0.05);

        // Act
        sourceAccount.transfer(30, targetAccount);

        // Assert
        assertEquals(70, sourceAccount.getBalance());
        assertEquals(80, targetAccount.getBalance());
    }

    @Test
    void testAddInterestShouldReturnValeurDuCompteFinal() {
        // Arrange
        BankAccount account = new BankAccount(100, 0.05);

        // Act
        account.addInterest();

        // Assert
        assertEquals(105, account.getBalance());
    }

    @Test
    void testGetBalanceShouldReturnValeurDuCompte() {
        // Arrange
        BankAccount account = new BankAccount(100, 0.05);

        // Act
        double balance = account.getBalance();

        // Assert
        assertEquals(100, balance);
    }
}
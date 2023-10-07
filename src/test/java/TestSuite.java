import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        WebSearchAutomator.class,
        WebLoginLogoutTester.class,
        FlightBookingCheckpoint.class
})
public class TestSuite {
    // Этот класс не имеет методов, он служит только для агрегации тестовых классов
}

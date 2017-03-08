import utility.Currency;

/**
 * Created by Administrator on 08/03/2017.
 */
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertthat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.number.IsCloseTo.closeTo;
public class CurrencyTest {
    @Test
    Currency currency = new Currency();
    assertThat(currency.exchange("USD",1.0,"USD"),closeTo(1.0,0.001));
}

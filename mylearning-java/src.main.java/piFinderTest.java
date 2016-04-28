import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;


/**
 *
 */

/**
 * @author enomoha
 *
 */
public class piFinderTest {

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void generatePITest() {

        // Tests the ENterprise method
        piFinder _generatePI = new piFinder();
        BigDecimal _outputValue = new BigDecimal(238);
        double _inputValue = 76;
        assertEquals(_outputValue, _generatePI.generatePIEnterprise(_inputValue));

        // Tests the Scientific version
        double _oValue = 238.76104167282426;
        assertEquals(_oValue, _generatePI.generatePIScientific(_inputValue), 0.001 );//with Delta

    }

}

import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MenstrualAppTest{


	@Test
    	void testtGetDateOfCurrentMenstrualPeriodEndWorks() {
	
        LocalDate actualDate = MenstrualApp.getDateOfCurrentMenstrualPeriodEnd(LocalDate.of(2025, 8, 3), 26);
        LocalDate expectedDate = LocalDate.of(2025, 8, 28);

        assertEquals(expectedDate, actualDate);
    }

	@Test
    	void testtGetFlowDayEnd() {
	
        LocalDate actualDate = MenstrualApp.getFlowDayEnd(LocalDate.of(2025, 8, 3), 7);
        LocalDate expectedDate = LocalDate.of(2025, 8, 10);

        assertEquals(expectedDate, actualDate);
    }

	@Test
    	void testtGetDateOfPredictFetileDayMiddle() {
	
        LocalDate actualDate = MenstrualApp.getDateOfPredictFetileDayMiddle(LocalDate.of(2025, 8, 28));
        LocalDate expectedDate = LocalDate.of(2025, 8, 14);

        assertEquals(expectedDate, actualDate);
    }













}
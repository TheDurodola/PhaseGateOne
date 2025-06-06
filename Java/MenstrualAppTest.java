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
    	void testtGetDateOfCurrentMenstrualPeriodEndRejectsNegativeValues() {
	
        LocalDate actualDate = MenstrualApp.getDateOfCurrentMenstrualPeriodEnd(LocalDate.of(2025, 8, 3), -5);
        LocalDate expectedDate = null;

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


	@Test
    	void testtGetStartDayFertile() {
	
        LocalDate actualDate = MenstrualApp.getStartDayFertile(LocalDate.of(2025, 8, 28));
        LocalDate expectedDate = LocalDate.of(2025, 8, 26);

        assertEquals(expectedDate, actualDate);
    }


	@Test
    	void testtGetEndDayFertile() {
	
        LocalDate actualDate = MenstrualApp.getEndDayFertile(LocalDate.of(2025, 8, 28));
        LocalDate expectedDate = LocalDate.of(2025, 8, 30);

        assertEquals(expectedDate, actualDate);
    }



	@Test
    	void testtGetSafeDayEnd() {
	
        LocalDate actualDate = MenstrualApp.getSafeDayEnd(LocalDate.of(2025, 8, 28));
        LocalDate expectedDate = LocalDate.of(2025, 8, 27);

        assertEquals(expectedDate, actualDate);
    }


	@Test
    	void testgetDateOfCurrentMenstrualPeriodEnd() {
	
        LocalDate actualDate = MenstrualApp.getDateOfCurrentMenstrualPeriodEnd(LocalDate.of(2025, 8, 28));
        LocalDate expectedDate = LocalDate.of(2025, 8, 29);

        assertEquals(expectedDate, actualDate);
    }







}
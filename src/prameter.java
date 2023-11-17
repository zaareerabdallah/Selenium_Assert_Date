import java.time.LocalDate;

import org.testng.asserts.SoftAssert;

public class prameter {
    
	
	
	static LocalDate today = LocalDate.now();
	static int today_Date= today.getDayOfMonth();
	SoftAssert myAssert = new SoftAssert();
	static int expectedF= today_Date +1;
	static int expectedR= today_Date +2;
}

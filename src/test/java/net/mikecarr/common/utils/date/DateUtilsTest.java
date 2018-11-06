package net.mikecarr.common.utils.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.datatype.XMLGregorianCalendar;

import org.junit.Assert;
import org.junit.Test;

/**
 * 
 * @author mcarr1
 *
 */
public class DateUtilsTest 
{

	@Test
    public void testConvertDateToXmlGregorian()
    {
    	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
    	Date testDate = null;
		try {
			testDate = sdf.parse("12/25/2018 18:00:00");
		} catch (ParseException e) {
			e.printStackTrace();
		}
    	
		XMLGregorianCalendar gc = DateUtils.convertDateToXmlGregorian(testDate);
		Assert.assertNotNull(gc);
    	
    }
}

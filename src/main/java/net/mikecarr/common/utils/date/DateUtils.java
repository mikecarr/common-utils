package net.mikecarr.common.utils.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * Hello world!
 *
 */
public class DateUtils 
{
	public static String convertXmlGregorianToString(XMLGregorianCalendar xc){
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy hh:mm a z");
 
        GregorianCalendar gCalendar = xc.toGregorianCalendar();
 
        //Converted to date object
        Date date = gCalendar.getTime();
 
        //Formatted to String value
        String dateString = df.format(date);
 
        return dateString;
    }
	
	public static XMLGregorianCalendar convertDateToXmlGregorian(Date date){
		
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		gregorianCalendar.setTime(date);
		XMLGregorianCalendar xmlGrogerianCalendar = null;
		try {
			xmlGrogerianCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return xmlGrogerianCalendar;
		
		
	}
}

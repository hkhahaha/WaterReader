package util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

public class DateChange extends StrutsTypeConverter {
	private DateFormat dateformate;
	{
		dateformate=new SimpleDateFormat("yyyy-MM-dd");
	}
	
	@Override
	public Object convertFromString(Map arg0, String[] arg1, Class arg2) {
		// TODO 自动生成的方法存根
		if (arg2==Date.class) {
			try {
				return dateformate.parse(arg1[0]);
			} catch (ParseException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public String convertToString(Map arg0, Object arg1) {
		// TODO 自动生成的方法存根
		if (arg1 instanceof Date) {
			return dateformate.format((Date)arg1);
		}
		return null;
	}

}

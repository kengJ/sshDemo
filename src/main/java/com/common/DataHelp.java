package com.common;

import java.text.MessageFormat;
import java.util.List;

public class DataHelp {
	public static String ListToHql(List<Object> data,String hql){
		Object[] dataArray = data.toArray(new Object[data.size()]);
		return MessageFormat.format(hql, dataArray);
	}
	
	public static String ArrayToHql(Object[] data,String hql){
		return MessageFormat.format(hql, data);
	}
}

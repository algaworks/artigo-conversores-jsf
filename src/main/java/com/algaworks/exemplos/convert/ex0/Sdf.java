package com.algaworks.exemplos.convert.ex0;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Sdf {
	
	public static void main(String[] args) {
		
		Date date = new Date();
		
		Locale locale = new Locale("pt", "BR");//Locale.getDefault();
		
		System.out.println(new SimpleDateFormat("yyyy.MM.dd G 'às' hh:mm:ss z", locale).format(date));
		System.out.println(new SimpleDateFormat("EEE, MMM d, ''yy", locale).format(date));
		System.out.println(new SimpleDateFormat("h:mm a", locale).format(date));
		System.out.println(new SimpleDateFormat("K:mm a,z", locale).format(date));
		System.out.println(new SimpleDateFormat("yyyy.MMMMM.dd GGG hh:mm aaa", locale).format(date));
	}

}

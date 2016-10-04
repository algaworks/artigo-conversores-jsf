package com.algaworks.exemplos.convert.ex0;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import javax.faces.application.FacesMessage;

public class Df {
	
	public static void main(String[] args) {
		
		Double d = 1500.0;
		Locale locale = new Locale("pt", "BR");
		
		//new FacesMessage(severity, summary, detail)
		
		DecimalFormatSymbols dfs = new DecimalFormatSymbols(locale);
		
		System.out.println(new DecimalFormat("###,###.00", dfs).format(d));
		System.out.println(new DecimalFormat("000000.##", dfs).format(d));
		
	}

}

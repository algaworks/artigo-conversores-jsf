package com.algaworks.exemplos.jsf.conversores.util;

public class StringUtils {
	
	public static String deixarSomenteDigitos(String str) {
		if (str == null) {
			return null;
		}
		
		return str.replaceAll("[^0-9]", "");
	}
}

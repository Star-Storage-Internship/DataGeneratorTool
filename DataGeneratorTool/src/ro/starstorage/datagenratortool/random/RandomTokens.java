package ro.starstorage.datagenratortool.random;

import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RandomTokens {

	private static final Logger LOG = LogManager.getLogger(RandomTokens.class);

	public static int generateRandomInt() {

		int nrInt;

		LOG.debug("Am intrat in generateRandomInt.. ");
		Random randInt = new Random();
		nrInt = randInt.nextInt();
		LOG.debug("Returnez un int random.. ");
		return nrInt;
	}

	public static int generateRandomIntP() {
		int nrIntP;

		Random randInt = new Random();
		nrIntP = randInt.nextInt(Integer.MAX_VALUE) + 1;

		return nrIntP;
	}

	public static double generateRandomReal() {
		double nrReal;

		Random randReal = new Random();
		nrReal = randReal.nextDouble();

		return nrReal;
	}

	public static double generateRandomRealP() {
		double nrRealP;

		Random randRealP = new Random();
		nrRealP = 1 + (Double.MAX_VALUE - 1) * randRealP.nextDouble();

		return nrRealP;
	}

	public static char generateRandomGender() {
		char ranGender;

		Random Gender = new Random();
		ranGender = Gender.nextBoolean() ? 'M' : 'F';
		return ranGender;
	}

	public static String generateRandomName() {

		String ranName = null;
		String ranCap = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String ranNCap = "abcdefghijklmnopqrstuvwxyz";
		String[] special = { "", "-", "'" };
		Random rnd = new Random();
		Random rnd1 = new Random();
		Random rnd2 = new Random();
		Random rnd3 = new Random();
		int ranLength = rnd1.nextInt(20) + 3;
		int select = rnd3.nextInt(special.length);

		StringBuilder sbNCap = new StringBuilder(ranLength);
		for (int i = 0; i < ranLength; i++) {
			sbNCap.append(ranNCap.charAt((rnd.nextInt(ranNCap.length()))));
		}
		String x = sbNCap.toString();

		StringBuilder sbCap = new StringBuilder(1);
		sbCap.append(ranCap.charAt((rnd2.nextInt(ranCap.length()))));
		String y = sbCap.toString();

		StringBuilder sbNCap1 = new StringBuilder(ranLength);
		for (int i = 0; i < ranLength; i++) {
			sbNCap1.append(ranNCap.charAt((rnd.nextInt(ranNCap.length()))));
		}
		String z = sbNCap1.toString();

		StringBuilder sbCap1 = new StringBuilder(1);
		sbCap1.append(ranCap.charAt((rnd2.nextInt(ranCap.length()))));
		String w = sbCap1.toString();

		
		
		
//		if (special[select] == "-") {
//			ranName = y + x + special[select] + w + z;
//		} else {
//			ranName = y + x + special[select] + " " + w + z;
//		}

		return ranName;
	}

	public static String generateRandomCNP() {
		String CNP = "";
		String CNPtwelvechars = "";
		String sString = "";
		String yearString = "";
		String monthString = "";
		String dayString = "";
		String orderString = "";
		String judString = "";
		int[] stdCNP = new int[] { 2, 7, 9, 1, 4, 6, 3, 5, 8, 2, 7, 9 };
		Random sChar = new Random();
		int controlNumber = 0;

		int s = 1 + sChar.nextInt(11 - 5 + 2 - 1);
		if (s > 2) {
			s += (5 - 3);
		}

		Random yearChar = new Random();
		int year = yearChar.nextInt(99) + 1;

		Random monthChar = new Random();
		int month = monthChar.nextInt(12) + 1;

		Random dayChar = new Random();
		int day = dayChar.nextInt(28) + 1;

		Random judChar = new Random();
		int jud = judChar.nextInt(52) + 1;

		Random orderNum = new Random();
		int order = orderNum.nextInt(999) + 1;

		sString = sString + String.valueOf(s);

		if (year < 10) {
			yearString = "0";
			yearString = yearString + String.valueOf(year);
		} else {
			yearString = yearString + String.valueOf(year);
		}

		if (month < 10) {
			monthString = "0";
			monthString = monthString + String.valueOf(month);
		} else {
			monthString = monthString + String.valueOf(month);
		}

		if (day < 10) {
			dayString = "0";
			dayString = dayString + String.valueOf(day);
		} else {
			dayString = dayString + String.valueOf(day);
		}

		if (jud < 10) {
			judString = "0";
			judString = judString + String.valueOf(jud);
		} else {
			judString = judString + String.valueOf(jud);
		}

		if (order < 10) {
			orderString = "00";
			orderString = orderString + String.valueOf(order);
		} else if (order < 100) {
			orderString = "0";
			orderString = orderString + String.valueOf(order);
		} else {
			orderString = orderString + String.valueOf(order);
		}

		CNPtwelvechars = sString + yearString + monthString + dayString
				+ judString + orderString;

		for (int i = 0; i <= 11; i++) {
			controlNumber += Character
					.getNumericValue(CNPtwelvechars.charAt(i)) * stdCNP[i];
		}
		controlNumber = controlNumber % 11;
		CNP = CNP + CNPtwelvechars + String.valueOf(controlNumber);

		return CNP;
	}

	public static boolean generateRandomBool() {
		boolean boo = (Math.random() < 0.5);

		return boo;
	}
}

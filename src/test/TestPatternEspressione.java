package test;

import java.util.Scanner;

public class TestPatternEspressione {

	private final static String P_VAR = "([A-Za-z][A-Za-z0-9]*|[01])";
	private final static String P_CONST = "[01]";
	private final static String P_OP = "[\\|\\+&\\*\\^]";
	private final static String PATTERN_ESPRESSIONE = "[!\\(]*[(" + P_VAR + "|"
			+ P_CONST + ")[\\)]*([\\^\\|\\&\\+\\*]){1}[!\\(]*]+(" + P_VAR + "|"
			+ P_OP + ")[\\)]*";

	private static final String ESPR1 = "[\\!\\(]*[(" + P_VAR + "|" + P_CONST
			+ ")[\\)]*[\\^\\|\\&\\+\\*][\\!\\(]*]+";

	private static final String ESPR_V = "[!\\(]*(([A-Za-z][A-Za-z0-9]*|[01])[\\|\\+&\\*\\^]([!\\(]*))*([A-Za-z][A-Za-z0-9]*|[01])\\)*";

	private static final String ESPR_V1 = "[!\\(]*(" + P_VAR + P_OP
			+ "([!\\(]*))*" + P_VAR + "\\)*";

	private static final String ESPR_G = "[[\\!\\]*[v][[o][\\!\\(]*[v][\\)]*]*[\\)]*]";

	private static final String ESPR_D = "[!]*(" + P_VAR + "(" + P_OP
			+ "[!]*){0,1}|[\\(]+(" + P_VAR + "(" + P_OP
			+ "[!]*){0,1})+[\\)]+)+";

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Test pattern espressione");
		String pattern1 = ESPR_D;
		String pattern2 = ESPR_V;
		String s = null;
		do {
			System.out.print(">> ");
			s = sc.nextLine();
			// sc.next();
			System.out.println("Match D: " + s.matches(pattern1));
			System.out.println("Match V: " + s.matches(pattern2));
		} while (true);
	}
}

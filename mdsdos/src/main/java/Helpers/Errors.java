package Helpers;

public class Errors {
	public static void LogBDError(Exception e) {
		System.out.println(">>>>>>>> ERROR EN BD  <<<<<<<<");
		e.printStackTrace();
		System.out.println(e.getMessage());
		System.out.println(e.getCause());
		System.out.println(">>>>>>>> ERROR EN BD  <<<<<<<<");
	}
}

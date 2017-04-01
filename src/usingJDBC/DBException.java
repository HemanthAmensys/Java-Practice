package usingJDBC;

public class DBException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DBException(Exception e) {
        super(e);  // handling exception from super method of the exception class
    }
}

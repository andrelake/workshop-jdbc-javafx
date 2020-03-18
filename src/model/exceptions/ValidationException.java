package model.exceptions;

import java.util.HashMap;
import java.util.Map;

public class ValidationException extends RuntimeException{  // carrega erros dos fomulários, caso existam

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Map<String, String> errors = new HashMap<>();  //primeiro item para nome do campo, segundo o erro
	
	public ValidationException(String msg) {
		super(msg);
	}
	
	public Map<String, String> getErrors(){
		return errors;
	}
	
	public void addError(String fieldName, String errorMsg) {
		errors.put(fieldName, errorMsg);
	}
}

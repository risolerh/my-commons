package mx.risolerh.commons.models;

import mx.risolerh.commons.utils.MessagesEnum;

/**
 * @author FSW CEyC
 * 
 * Clase de excepción genérica para lanzar los errores
 * que se presentan en el aplicativo.
 */

public class BusinessException extends Exception {

    /**
     * Serial de la excepción
     */
    private static final long serialVersionUID = 1303454450535514738L;

    
    private MessagesEnum errorEnum;
    
    
    /**
     * Constructor
     * @param message Mensaje de error
     */
    public BusinessException(String message) {
        super(message);
    }
    
    /**
     * Constructor
     * @param message Mensaje de error
     * @param causa Causa completa del error
     */
    public BusinessException(String message, Throwable causa) {    	
        super(message, causa);
        
        // Catch eception
    }
    
    /**
     * Constructor que la interfaz del enumerador de error
     * @param errorEnum Interfaz de enumerador de error
     */
    public BusinessException( MessagesEnum errorEnum) {
        super(errorEnum.getMessage());
        this.errorEnum = errorEnum; 
    }
    
    /**
     * Constructor que la interfaz del enumerador de error
     * @param errorEnum Interfaz de enumerador de error
     * @param causa Causa completa del error
     */
    public BusinessException(MessagesEnum errorEnum, Throwable causa) {
        super(errorEnum.getMessage(), causa);
        this.errorEnum = errorEnum; 

    }

	/**
	 * @return the errorEnum
	 */
	public MessagesEnum getErrorEnum() {
		return errorEnum;
	}

	/**
	 * @param errorEnum the errorEnum to set
	 */
	public void setErrorEnum(MessagesEnum errorEnum) {
		this.errorEnum = errorEnum;
	}
    
    

}

package mx.risolerh.commons.models;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 
 * @author José Ricardo Soler Hernandez
 *  
 */
public class ResponseBase<T> implements Serializable{
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -8352921105999772254L;
	
	
	private boolean ok;
	private String code;
	private String message; 
	private T payload;
	private Timestamp timestamp;
	
	
	/**
	 * @param payload
	 */
	public ResponseBase(T payload) {
		
		this.ok = true;
		this.message = "success!";
		this.payload = payload;
		this.code = "0"; 
		this.timestamp = new Timestamp(System.currentTimeMillis());
	}
	
	public ResponseBase(T payload, String message) {
		
		this.ok = true;
		this.message = message;
		this.payload = payload;
		this.code = "0"; 
		this.timestamp = new Timestamp(System.currentTimeMillis());
	}

	/**
	 * @param response
	 */
	public ResponseBase(String response, String code) {

		this.ok = false;
		this.message = response;
		this.code = code;
		this.timestamp = new Timestamp(System.currentTimeMillis());
	}

	
	
	/**
	 * @return the timestamp
	 */
	public Timestamp getTimestamp() {
		return timestamp;
	}

	/**
	 * @return the ok
	 */
	public boolean isOk() {
		return ok;
	}

	/**
	 * @param ok the ok to set
	 */
	public void setOk(boolean ok) {
		this.ok = ok;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the payload
	 */
	public T getPayload() {
		return payload;
	}

	/**
	 * @param payload the payload to set
	 */
	public void setPayload(T payload) {
		this.payload = payload;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	
	
}

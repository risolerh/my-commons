package mx.risolerh.commons.utils;

/**
 * @author FSW CEyC
 * 
 * The Enum MessagesEnum.
 * 
 * Esta clase permite la enumeracion de diferentes mensajes de excepcion
 * utilizados en los cuerpos de respuesta HTTP arrojados por el servicio
 * 
 * Es posible agregar nuevos mensajes personalizados
 * para permitir que el servicio sea mas explicito,
 * recordando siempre que es importante evitar arrojar informacion sensible
 * 
 */
public enum MessagesEnum {

	/**
	 * Excepción generica
	 */
	EXC_GENERICO("EXC.000", "Error generico", "Error generico de servidor", Constantes.ERROR, ""),

	/**
	 * Excepción de parámetros invalidos 
	 */
	EXC_ERROR_PARAMS("EXC.001", "Parametros invalidos", "Parametros invalidos de consumo", Constantes.WARNING, ""),
	
	/**
	 * Excepción de duplicidad de guardado
	 */
	EXC_DUPLICADO("EXC.100", "Inserto duplicado", "Inserto ya existe, no puede ser sobrescrita", Constantes.WARNING, ""),
	
	/**
	 * Excepción de consulta no encontrada
	 */
	EXC_INEXISTENTE("EXC.101", "Inserto inexistente", "Inserto no existe, intente con otro valor", Constantes.WARNING, ""),
	
	/**
	 * Excepción de operación no exitosa
	 */
	EXC_OPER_NO_EXITOSA("EXC.102", "Operacion no exitosa", "Operacion no exitosa", Constantes.ERROR, ""),

	/**
	 * Excepción de operación con errores
	 */
	EXC_OPER_CON_ERRORES("EXC.103", "Operacion con errores", "Operacion con errores", Constantes.ERROR, ""),
	
	/**
	 * Excepción de insertos inexistentes
	 */
	EXC_INEXISTENTES("EXC.104", "Insertos inexistentes", "No existen registros que coincidan con la consulta, favor de validar", Constantes.WARNING, ""),

	/**
	 * Excepción de archivo invalido
	 */
	EXC_ARCHIVO("EXC.105", "Archivo invalido", "Archivo no valido, favor de validar", Constantes.ERROR, ""),
	
	/**
	 * Excepción de servicio inexistente
	 */
	EXC_SERV_INEXISTENTES("EXC.106", "Server inexistentes", "No existen registros que coincidan con la consulta, favor de validar", Constantes.WARNING, ""),
	
	/**
	 * Excepción de servicio inexistente
	 */
	EXC_ERROR_DB("EXC.107", "Error de DB", "Problemas con interaccion de Base de datos.", Constantes.WARNING, ""),
	
	/**
	 * Sin autorizacion 
	 */
	EXC_UNAUTHORIZED("EXC.108", "Unautorizado", "Usuario sin permisos", Constantes.WARNING, ""),
		
	/**
	 *  Error de microservicios
	 */
	EXC_ERROR_MS("EXC.109", "Error en Micorservicio", "Error interno en microservicio.", Constantes.WARNING, ""),
	
	
	
	
	
	/**
	 * Ya existe usuario   
	 */
	EXC_USER_PASS_DUPLICADO("EXC.201", "Usuario ya existente", "Ya existe el número o email registrado ...", Constantes.WARNING, "");
	
	

	
	
	
    /**
     * Código de error
     */
    private final String code;
    
    /**
     * Mensaje de error
     */
    private final String message;

	/**
	 * Descripción del error
	 */
	private final String description;

    /**
     * Nivel del tipo de error
     */
    private final String level;

    /**
     * Más información a consultar a cerca del error
     */
    private final String moreInfo;
    
    /**
     * Constructor con error
     * 
     * @param code Código de error
     * @param message Mensaje de error
     * @param description Descripción del error
     * @param level Nivel del tipo de error
     * @param moreInfo Información adicional al error
     */
    MessagesEnum(final String code, final String message, 
    		final String description, final String level, final String moreInfo ) {
        this.code = code;
        this.message = message;
        this.description = description;
        this.level = level;
        this.moreInfo = moreInfo;
    }

	/**Getter (String)
	 * @return code
	 */
	public String getCode() {
		return code;
	}

	/**Getter (String)
	 * @return message
	 */
	public String getMessage() {
		return message;
	}

	/**Getter (String)
	 * @return description
	 */
	public String getDescription() {
		return description;
	}

	/**Getter (String)
	 * @return level
	 */
	public String getLevel() {
		return level;
	}

	/**Getter (String)
	 * @return moreInfo
	 */
	public String getMoreInfo() {
		return moreInfo;
	}

}

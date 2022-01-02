package com.example.exceptions;
//package com.example.STSandMONGOdb.guardandoexcptions;
//
//import java.util.Date;
//import java.util.Set;
//import java.util.stream.Collectors;
//
//import org.springframework.context.MessageSource;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.MethodArgumentNotValidException;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseStatus;
//
//@ControllerAdvice
//public class ExceptionHandlerAdvice {
//    
//	//private static final String UNKNOWN_ERROR_KEY = "unknown.error";
//
//    //private static final Logger logger = LoggerFactory.logger(ExceptionHandlerAdvice.class);
//    private final MessageSource messageSource;
//
//    public ExceptionHandlerAdvice(MessageSource messageSource) {
//        this.messageSource = messageSource;
//    }
//
//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    public ResponseEntity<ApiErrorDTO> handlerMethodArgumentNotValid(MethodArgumentNotValidException exception) {
//        //logger.error( exception.getClass().getName(), exception.getMessage(), exception);
//        Set<ErrorDTO> errors = exception.getBindingResult().getFieldErrors().stream().map(error -> buildError(error.getCode(), error.getDefaultMessage())).collect(Collectors.toSet());
//        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(baseErrorBuilder(HttpStatus.BAD_REQUEST, errors));
//    }
//
//	
//	
////	  @ExceptionHandler(BaseRuntimeException.class) public
////	  ResponseEntity<ApiErrorDTO> handlerBaseException(Throwable exception) {
////	  //logger.error(exception.getClass().getName()); MessageException
////	  messageException = (MessageException) exception; ErrorDTO error =
////	  buildError(messageException.getExceptionKey(),
////	  bindExceptionKeywords(messageException.getMapDetails(),messageException.
////	  getExceptionKey()));
////	  
////	  Set<ErrorDTO> errors = Set.of(error); ApiErrorDTO apiErrorDto =
////	  baseErrorBuilder(getResponseStatus(exception), errors);
////	  
////	  return ResponseEntity.status(getResponseStatus(exception)).body(apiErrorDto);
////	  }
//	 
//	
//	@ExceptionHandler(Throwable.class) 
//	public ResponseEntity<ApiErrorDTO> handlerMethodThrowable(Throwable exception) { 
//		//logger.error(exception.getClass().getName(), exception.getMessage(), exception);
//		Set<ErrorDTO> errors = Set.of(buildError("birthDate" , "The date format must be dd/MM/yyyy")); 
//		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(baseErrorBuilder(HttpStatus.BAD_REQUEST, errors)); 
//	}
//	  
//    private ErrorDTO buildError(String code, String message) {
//        return new ErrorDTO(code, message);
//    }
//
//    private ApiErrorDTO baseErrorBuilder(HttpStatus httpStatus, Set<ErrorDTO> errorList) {
//        return new ApiErrorDTO(new Date(), httpStatus.value(), httpStatus.name(), errorList);
//    }
//
//    //private String bindExceptionKeywords(Map<String, Object> keywords, String exceptionKey) { 
//    	//String message = messageSource.getMessage(exceptionKey, null, LocaleContextHolder.getLocale()); 
//    	//return Objects.nonNull(keywords) ? new StrSubstitutor(keywords).replace(message) : message; //importar apache lang3 for strSu...
//    //}
//    		  
//    private HttpStatus getResponseStatus(Throwable exception) { 
//    	ResponseStatus responseStatus = exception.getClass().getAnnotation(ResponseStatus.class); 
//    	if (exception.getClass().getAnnotation(ResponseStatus.class) == null) {
//    		return HttpStatus.INTERNAL_SERVER_ERROR; 
//    	} 
//    	return responseStatus.value(); 
//    }	 
//}

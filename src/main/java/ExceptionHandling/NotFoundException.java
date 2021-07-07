package ExceptionHandling;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException{	
	
		public NotFoundException(String errorMsg) {
			
			super(errorMsg);
			// TODO Auto-generated constructor stub
		}

	

}

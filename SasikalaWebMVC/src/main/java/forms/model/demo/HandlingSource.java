package forms.model.demo;

import java.util.InputMismatchException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class HandlingSource 
{
	@ExceptionHandler(NumberFormatException.class)
	public String first(Exception e)
	{return "numeric";}
	@ExceptionHandler(InputMismatchException.class)
	public String second(Exception e)
	{return "inputs";}
	@ExceptionHandler(SasikalaException.class)
	public String third(Exception e)
	{return "users";}
}

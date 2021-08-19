package br.com.gerenciamentopessoasspringbootdio.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author RubioAlves
 * Created 19/08/2021 at 07:03
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class PersonNotFoundException extends Exception{

    public PersonNotFoundException(Long id){
        super("Person not found with ID " + id);
    }
}

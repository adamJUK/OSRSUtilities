package app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException(String message) {
        super(message);
    }

    public static EntityNotFoundException Of(Class<?> clazz, int id) {
        return new EntityNotFoundException(clazz.getSimpleName() + " with id " + id + " does not exist.");
    }

}

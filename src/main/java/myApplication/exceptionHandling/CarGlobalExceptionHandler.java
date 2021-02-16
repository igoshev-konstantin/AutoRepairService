package myApplication.exceptionHandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice           /*Глобальный контроллер исключений*/
public class CarGlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<CarIncorrectData> handleException(
            NoSuchCarException exception) {
        /*Метод реагирует только на NoSuchEmployeeException*/
        CarIncorrectData data = new CarIncorrectData();
        data.setInfo(exception.getMessage());
        return new ResponseEntity<>(data, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<CarIncorrectData> handleException(
            Exception exception) {
        /*Метод реагирует только на Все Exception*/
        CarIncorrectData data = new CarIncorrectData();
        data.setInfo(exception.getMessage());
        return new ResponseEntity<>(data, HttpStatus.BAD_REQUEST);
    }
}

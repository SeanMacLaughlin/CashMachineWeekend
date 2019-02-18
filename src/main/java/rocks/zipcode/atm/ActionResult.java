package rocks.zipcode.atm;

import javafx.scene.control.Alert;

import javax.swing.*;

/**
 * @author ZipCodeWilmington
 */
public class ActionResult<T> {
    //private Alert overdrawnMessage;
    private T data;
    private String errorMessage;

    private ActionResult(T data) {
        this.data = data;
    }

    private ActionResult(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    //private ActionResult(Alert overdrawnMessage) {this.overdrawnMessage = overdrawnMessage;}




    public T getData() {
        return data;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

   /* public Alert getOverdrawnMessage() {
        return overdrawnMessage;
    } */



    public boolean isSuccess() {
        return data != null;
    }

    public static <E> ActionResult<E> success(E data) {
        return new ActionResult<E>(data);
    }

    public static <E> ActionResult<E> fail(String errorMessage) {
        return new ActionResult<E>(errorMessage);
    }

    /*public static <E> ActionResult<E> overdrawn(Alert overdrawnMessage) {
        return new ActionResult<E>(overdrawnMessage);
    } */
}

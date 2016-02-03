package net.hendrikjander;

/**
 * Created by jah on 2/3/16.
 */
public class AbstractManagedBean {

    private ManagedService sms;
    private ManagedService jms;

    private String message;


    public AbstractManagedBean(String message, SpringManagedService sms, JsfManagedService jms) {

        this.message = message;

        this.sms = sms;
        this.jms = jms;
    }

    public String getMessage() {
        return message;
    }

    public String getSpringMessage() {
        return sms.getMessage();
    }

    public String getJsfMessage() {
        return jms.getMessage();
    }
}

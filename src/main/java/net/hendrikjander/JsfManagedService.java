package net.hendrikjander;


import javax.inject.Named;

/**
 * Created by jah on 2/3/16.
 */


@Named
public class JsfManagedService implements ManagedService {

    public String getMessage() {
        return "Jsf injection";
    }
}

package net.hendrikjander;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.bean.RequestScoped;

/**
 * Created by jah on 2/3/16.
 */


@Component
@RequestScoped
public class SpringManagedBean extends AbstractManagedBean {

    @Autowired
    public SpringManagedBean(SpringManagedService sms, JsfManagedService jms) {
        super("Spring", sms, jms);
    }

}

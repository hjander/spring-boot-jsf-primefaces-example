package net.hendrikjander;

import org.springframework.stereotype.Component;

/**
 * Created by jah on 2/3/16.
 */

@Component
public class SpringManagedService implements ManagedService {

    public String getMessage() {
        return "Spring injection";
    }
}

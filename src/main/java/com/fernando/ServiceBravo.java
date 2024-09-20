package com.fernando;

import io.quarkus.arc.lookup.LookupIfProperty;
import jakarta.enterprise.context.ApplicationScoped;

@LookupIfProperty(name = "service", stringValue = "bravo")
@ApplicationScoped
class ServiceBravo implements Service {

    public String ping() {
        return "bravo";
    }

}

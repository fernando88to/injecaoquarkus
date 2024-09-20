package com.fernando;
import io.quarkus.arc.lookup.LookupIfProperty;
import jakarta.enterprise.context.ApplicationScoped;

@LookupIfProperty(name = "service", stringValue = "alpha")
@ApplicationScoped
class ServiceAlpha implements Service {

    public String ping() {
        return "alpha";
    }
}

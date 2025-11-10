package en.unideb.inf.demo;

import en.unideb.inf.demo.frontend.BackendManager;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class SpringBackendManager implements BackendManager {
    private ConfigurableApplicationContext ctx;

    @Override
    public void start() {
        ctx = SpringApplication.run(SpringDataFxApplication.class);
    }

    @Override
    public void stop() {
        ctx.stop();
    }

    @Override
    public void print() {
        ((SpringDataFxApplication)ctx.getBean(SpringDataFxApplication.class))
                .printPersons();
    }
}

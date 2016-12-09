package lh.world.config;

import org.glassfish.jersey.server.ResourceConfig;

/**
 * Created by lh on 2016/12/9.
 */
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        packages("lh.world.ws");
    }
}

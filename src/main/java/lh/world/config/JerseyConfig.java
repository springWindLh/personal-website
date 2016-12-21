package lh.world.config;

import lh.world.filter.CORSResponseFilter;
import org.glassfish.jersey.server.ResourceConfig;

/**
 * Created by lh on 2016/12/9.
 */
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(CORSResponseFilter.class);
        packages("lh.world.ws");
    }
}

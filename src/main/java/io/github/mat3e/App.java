package io.github.mat3e;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws Exception {
        var webapp = new WebAppContext();
//        webapp.addServlet(HelloServlet.class, "/api/*");
        var server = new Server(8080);
        server.setHandler(webapp);

        server.start();
        server.join();
    }
}

package org.Myweb.config;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

// using the Application class we cut off the dependency on web.xml which has the configuration
@ApplicationPath("JAXRS")
public class ApplicationConfig extends Application{

}

package com.springmvc.cms.util;

import org.eclipse.jetty.security.HashLoginService;
import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.bio.SocketConnector;
import org.eclipse.jetty.server.nio.SelectChannelConnector;
import org.eclipse.jetty.webapp.WebAppContext;

/**
 * @Author Michael Liu
 * @Date 2015-05-26 14:51
 */
public class ServerTest {

    public static void main(String[] args) throws Exception {
        Server server = new Server();
        final int port = 8000 ;
        Connector connector = new SelectChannelConnector();
        connector.setPort(port);

        server.setConnectors(new Connector[] { connector });

        WebAppContext webAppContext = new WebAppContext("WebContent","./CMSystem");

        webAppContext.setContextPath("/");
        webAppContext.setDescriptor("webapp/WEB-INF/web.xml");
        webAppContext.setResourceBase("./CMSystem/src/main/webapp");
        webAppContext.setDisplayName("myProject");
        webAppContext.setClassLoader(Thread.currentThread().getContextClassLoader());
        webAppContext.setConfigurationDiscovered(true);
        webAppContext.setParentLoaderPriority(true);
        server.setHandler(webAppContext);
        System.out.println(webAppContext.getContextPath());
        System.out.println(webAppContext.getDescriptor());
        System.out.println(webAppContext.getResourceBase());
        System.out.println(webAppContext.getBaseResource());

        try {
            server.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("server is  start on:"+port);
    }
}

package com.springmvc.cms;

import org.apache.log4j.Logger;
import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.nio.SelectChannelConnector;
import org.eclipse.jetty.util.thread.QueuedThreadPool;
import org.eclipse.jetty.webapp.WebAppContext;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author Michael Liu
 * @Date 2015-04-21 09:36
 */
public class CMSServer {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(CMSServer.class);

    final static int port = 50000;
    public static void main(String[] args){

        try {

            logger.info("CMSServer is running as "+port);

            Server server = new Server();

            QueuedThreadPool threadPool = new QueuedThreadPool();
            threadPool.setMaxThreads(200);
            server.setThreadPool(threadPool);

            Connector connector = new SelectChannelConnector();
            connector.setPort(port);
            server.addConnector(connector);

            WebAppContext context = new WebAppContext();

            context.setContextPath("/");
            context.setDescriptor("/src/main/webapp/WEB-INF/web.xml");

            context.setResourceBase("./webapp");
            context.setParentLoaderPriority(true);
            server.setHandler(context);

            server.start();
            server.join();
            logger.info("CMSServer is running as "+port);
            System.out.print("CMSServer is running as "+port);

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (SAXException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
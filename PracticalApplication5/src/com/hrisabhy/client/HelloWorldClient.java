/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hrisabhy.client;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import com.hrisabhy.ws.HelloWorld;
/**
 *
 * @author hrisabhy
 */
public class HelloWorldClient {
    public static void main(String[] args) throws Exception{
        URL url = new URL("http://localhost:7779/ws/hello?wsdl");
        QName qname = new QName("http://ws.hrisabhy.com/", "HelloWorldImplService");
 
        Service service = Service.create(url, qname);
 
        HelloWorld hello = service.getPort(HelloWorld.class);
 
        System.out.println(hello.getHelloWorldAsString("hrisabhy"));
    }
}

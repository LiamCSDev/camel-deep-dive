package com.in28minutes.microservices.camelmicroserviceb.routes;

import com.in28minutes.microservices.camelmicroserviceb.CurrencyExchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class ActiveMqXMLReceiverRouter extends RouteBuilder {

  Logger logger = LoggerFactory.getLogger(ActiveMqXMLReceiverRouter.class);

  @Override
  public void configure() throws Exception {

    // XML
    from("activemq:my-activemq-xml-queue")
        .unmarshal()
        .jacksonxml(CurrencyExchange.class)
        .to("log:received-message-from-active-mq");
  }
}
package com.in28minutes.microservices.camelmicroserviceb.routes;

import com.in28minutes.microservices.camelmicroserviceb.CurrencyExchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class KafkaReceiverRouter extends RouteBuilder {

  Logger logger = LoggerFactory.getLogger(KafkaReceiverRouter.class);

  @Override
  public void configure() throws Exception {

    // JSON
    from("kafka:myKafkaTopic")
        .unmarshal()
        .json(JsonLibrary.Jackson, CurrencyExchange.class)
        .to("log:received-message-from-kafka");
  }
}
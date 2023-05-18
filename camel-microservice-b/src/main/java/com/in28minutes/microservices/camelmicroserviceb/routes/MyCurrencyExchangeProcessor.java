package com.in28minutes.microservices.camelmicroserviceb.routes;

import com.in28minutes.microservices.camelmicroserviceb.CurrencyExchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MyCurrencyExchangeProcessor {

  Logger logger = LoggerFactory.getLogger(MyCurrencyExchangeProcessor.class);

  public void processMessage(CurrencyExchange currencyExchange) {

    logger.info("Do some processing with currencyExchange.getConversionMultiple() with value: {}",
        currencyExchange.getConversionMultiple());
  }

}

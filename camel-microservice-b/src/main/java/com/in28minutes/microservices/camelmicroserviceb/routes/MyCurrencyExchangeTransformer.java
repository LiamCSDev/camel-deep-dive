package com.in28minutes.microservices.camelmicroserviceb.routes;

import com.in28minutes.microservices.camelmicroserviceb.CurrencyExchange;
import java.math.BigDecimal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MyCurrencyExchangeTransformer {

  Logger logger = LoggerFactory.getLogger(MyCurrencyExchangeTransformer.class);

  public CurrencyExchange processMessage(CurrencyExchange currencyExchange) {

    currencyExchange.setConversionMultiple(currencyExchange.getConversionMultiple().multiply(BigDecimal.TEN));

    return currencyExchange;
  }

}

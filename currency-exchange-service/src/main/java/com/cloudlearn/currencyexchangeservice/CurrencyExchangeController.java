package com.cloudlearn.currencyexchangeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import static java.lang.Integer.parseInt;
import static java.util.Objects.requireNonNull;

@RestController
public class CurrencyExchangeController {

    @Autowired
    private Environment env;

    @Autowired
    private ExchangeValueRepository repository;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
        ExchangeValue exchangeValue = repository.findByFromAndTo(from, to);
        exchangeValue.setPort(parseInt(requireNonNull(env.getProperty("local.server.port"))));
        return exchangeValue;

    }
}

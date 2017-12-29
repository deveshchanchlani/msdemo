package com.steerlean.searchservice.controller;

import com.steerlean.searchservice.component.SearchComponent;
import com.steerlean.searchservice.entity.Flight;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RefreshScope
@CrossOrigin
@RestController
@RequestMapping("/search")
class SearchRestController {
    private static final Logger logger = LoggerFactory.getLogger(SearchRestController.class);

    private SearchComponent searchComponent;

    // @Autowired
    // private RestTemplate restTemplate;

//    @Value("${originairports.shutdown}")
    private String originAirportShutdownList;

    @Autowired
    public SearchRestController(SearchComponent searchComponent) {
        this.searchComponent = searchComponent;
    }

    @RequestMapping(value = "/get", method = RequestMethod.POST)
    List<Flight> search(@RequestBody SearchQuery query) {
        logger.info("Input : " + query);

        if (Arrays.asList(originAirportShutdownList.split(",")).contains(query.getOrigin())) {
            logger.info("The origin airport is in Shutdown state.");
            return new ArrayList<Flight>();
        }

        return searchComponent.search(query);
    }

    @RequestMapping(value = "/hub", method = RequestMethod.GET)
    String getHub() {
        logger.info(" Searching for Hub, received from search-apigateway ");
        return "SFO";
    }

}

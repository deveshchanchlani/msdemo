package com.steerlean.searchservice.component;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(SearchSink.class)
public class Receiver {

	@Autowired
	SearchComponent searchComponent;

	public Receiver() {
		super();
	}

	@ServiceActivator(inputChannel = SearchSink.InventoryQ)
	public void accept(Map<String, Object> fare) {
		searchComponent.updateInventory((String) fare.get("FLIGHT_NUMBER"), (String) fare.get("FLIGHT_DATE"),
				(int) fare.get("NEW_INVENTORY"));
	}
}

interface SearchSink {
	public static String InventoryQ = "inventoryQ";

	@Input("inventoryQ")
	public MessageChannel inventoryQ();
}

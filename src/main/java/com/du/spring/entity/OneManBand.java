package com.du.spring.entity;

import java.util.Map;
import java.util.Properties;

public class OneManBand implements Performer {

//	private Collection<Instrument> instruments;
	
	private Map<String, Instrument> instruments;
	
	@Override
	public void perform() {
		for (String key : instruments.keySet()) {
			System.out.println(key + " : ");
			Instrument instrument = instruments.get(key);
			instrument.play();
		}
	}

	public Map<String, Instrument> getInstruments() {
		return instruments;
	}

	public void setInstruments(Map<String, Instrument> instruments) {
		this.instruments = instruments;
	}

	private Properties is;
	
}

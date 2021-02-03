package com.codespark.springbootbasics.restconsumer;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherData {

	private Object coord;
	private Object[] weather;
	private String base;
	private Object main;
	private long visibility;
	private Object wind;
	private Object rain;
	private Object clouds;
	private long dt;
	private Object sys;
	private long id;

	/**
	 * Use @JsonProperty annotation to specify the exact key of the JSON document.
	 * Here JSON response field is 'name' but domain class uses 'location'.
	 */
	@JsonProperty(value = "name")
	private String location;

	private int cod;

	public Object getCoord() {
		return coord;
	}

	public void setCoord(Object coord) {
		this.coord = coord;
	}

	public Object[] getWeather() {
		return weather;
	}

	public void setWeather(Object[] weather) {
		this.weather = weather;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public Object getMain() {
		return main;
	}

	public void setMain(Object main) {
		this.main = main;
	}

	public long getVisibility() {
		return visibility;
	}

	public void setVisibility(long visibility) {
		this.visibility = visibility;
	}

	public Object getWind() {
		return wind;
	}

	public void setWind(Object wind) {
		this.wind = wind;
	}

	public Object getRain() {
		return rain;
	}

	public void setRain(Object rain) {
		this.rain = rain;
	}

	public Object getClouds() {
		return clouds;
	}

	public void setClouds(Object clouds) {
		this.clouds = clouds;
	}

	public long getDt() {
		return dt;
	}

	public void setDt(long dt) {
		this.dt = dt;
	}

	public Object getSys() {
		return sys;
	}

	public void setSys(Object sys) {
		this.sys = sys;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String name) {
		this.location = name;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	@Override
	public String toString() {
		return "WeatherData [coord=" + coord + ", weather=" + Arrays.toString(weather) + ", base=" + base + ", main="
				+ main + ", visibility=" + visibility + ", wind=" + wind + ", rain=" + rain + ", clouds=" + clouds
				+ ", dt=" + dt + ", sys=" + sys + ", id=" + id + ", name=" + location + ", cod=" + cod + "]";
	}

}
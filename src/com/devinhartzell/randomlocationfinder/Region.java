package com.devinhartzell.randomlocationfinder;

public class Region {
	
	public Location min;
	public Location max;
	
	public Region(Location min, Location max) {
		this.min = min;
		this.max = max;
	}
	
	public boolean contains(Location l) {
		return (l.x < max.x && l.x > min.x) && (l.y < max.y && l.y > min.y);
	}

}

package com.devinhartzell.randomlocationfinder;

import java.awt.geom.Ellipse2D;

public class Dot extends Ellipse2D.Float {

	private static final long serialVersionUID = -8711574189763034318L;
	
	public Dot(Location l, ImagePanel panel) {
		super(l.x, l.y, 10, 10);
		panel.repaint();
	}	
}

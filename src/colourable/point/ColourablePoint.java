package colourable.point;

import java.awt.Color;

import Colourable;

public class ColourablePoint {

	private Color color;
	
	public ColourablePoint(int x, int y, Color color) {
		
		super(x, y);
		
		this.color = color;
	}

	@Override
	public String toString() {
		return "ColourablePoint [color=" + color + "]";
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	
	
}

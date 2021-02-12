package deplacement.balise;

import java.awt.Point;


import model.Balise;

public class DeplRedescendre extends DeplBalise {
	int profondeur;

	public DeplRedescendre(int profondeur) {
		this.profondeur = profondeur;
	}

	@Override
	public void bouge(Balise target) {
		Point p = target.getPosition();
		int y = p.y;
		if (y < this.profondeur) {
			y += 3;
			if (y > this.profondeur)
				y = this.profondeur;
			target.setPosition(new Point(p.x, y));
		}
	}

}

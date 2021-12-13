package geometrie;

public class Cercle implements ObjetGeometrique {
	double rayon;
	
	
	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	@Override
	public double perimetre() {
		return rayon*2*Math.PI;
	}

	@Override
	public double surface() {
		return rayon*rayon*Math.PI;
	}
	
}

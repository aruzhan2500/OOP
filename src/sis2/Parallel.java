package sis2;

public class Parallel extends Circuit {
	private Circuit c1;
	private Circuit c2;
	
	public Parallel() {}
	
	public Parallel(Circuit c1, Circuit c2) {
		this.c1 = c1;
		this.c2 = c2;
	}
	
	@Override
	public double getResistance() {
		return (c1.getResistance() * c2.getResistance()) / (c1.getResistance() + c2.getResistance());
	}
	
	@Override
	public double getPotentialDiff() {
		return c1.getPotentialDiff();
	}
	
	@Override
	public void applyPotentialDiff(double V) {
		this.c1.applyPotentialDiff(V);
		this.c2.applyPotentialDiff(V);
	}
}

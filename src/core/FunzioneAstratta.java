package core;

public abstract class FunzioneAstratta implements Funzione {

	protected int numVariabiliEntrata;
	protected int numVariabiliUscita;
	protected String[] mapping;
	
	public FunzioneAstratta(int numVariabiliEntrata, int numVariabiliUscita) {
		this.numVariabiliEntrata = numVariabiliEntrata;
		this.numVariabiliUscita = numVariabiliUscita;
	}

//	@Override
//	public boolean equals(Object o) {
//		// TODO
//		return false;
//	}
//	
//	@Override
//	public int hashCode() {
//		// TODO
//		return numVariabiliEntrata;
//	}
//	
//	@Override
//	public String toString() {
//		// TODO
//		return null;
//	}
	
}

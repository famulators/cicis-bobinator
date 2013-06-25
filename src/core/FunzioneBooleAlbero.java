package core;

public class FunzioneBooleAlbero extends FunzioneAstratta {

	private final static String PATTERN_VARIABILE = "[A-Za-z]+[A-Za-z0-9]*";
	private final static String PATTERN_COSTANTE = "[01]";
	private final static String PATTERN_OPERATORE = "[\\^\\|\\&\\!\\+\\*]";
	private final static String PATTERN_ESPRESSIONE = "[!\\(]*[("
			+ PATTERN_VARIABILE + "|" + PATTERN_COSTANTE
			+ ")[\\)]*[\\^\\|\\&\\+\\*][!\\(]*]*" + PATTERN_VARIABILE
			+ "[\\)]*";

	private String espressione;

	public FunzioneBooleAlbero(String espressione, int numVariabiliEntrata,
			int numVariabiliUscita) {
		super(numVariabiliEntrata, numVariabiliUscita);
		this.espressione = espressione;
	}

	@Override
	public BitConfig valuta(int variabili) {
		// TODO Auto-generated method stub
		return null;
	}

}

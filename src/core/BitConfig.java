package core;

public class BitConfig implements Comparable<BitConfig> {

	private int config;
	private int mask;

	public BitConfig(int config, int mask) {
		this.config = config;
		this.mask = mask;
	}

	public int getConfig() {
		return config;
	}

	public void setConfig(int config) {
		this.config = config;
	}

	public int getMask() {
		return mask;
	}

	public void setMask(int mask) {
		this.mask = mask;
	}

	@Override
	public int compareTo(BitConfig bc) {
		return config - bc.config;
	}
	
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof BitConfig)) {
			return false;
		}
		if (o == this) {
			return true;
		}
		BitConfig bc = (BitConfig) o;
		return (mask == bc.mask)
				&& (((config & mask) ^ (bc.config & bc.mask)) == 0);
	}

	@Override
	public int hashCode() {
		final int MOLT = 17;
		return (config & mask) * MOLT + mask;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(32);
		for (int i = 31; i >= 0; i--) {
			int i_esimo = 1 << i;
			if ((mask & i_esimo) == 0) {
				sb.append('-');
			} else {
				sb.append((config & i_esimo) >> i_esimo);
			}
		}
		return sb.toString();
	}

}

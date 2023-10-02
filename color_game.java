
public class color_game {
	public boolean winnerOfGame(String col) {
		int ac = 0, bc = 0, c = 0;
		for (int i = 1; i < col.length(); i++) {
			if (col.charAt(i) == col.charAt(i - 1)) {
				c++;
			} else {
				if (col.charAt(i - 1) == 'A') {
					ac += Math.max(0, c - 1);
				} else {
					bc += Math.max(0, c - 1);
				}
				c = 0;
			}

		}
		if (col.charAt(col.length() - 1) == 'A') {
			ac += Math.max(0, c - 1);
		} else {
			bc += Math.max(0, c - 1);
		}
		return ac > bc;
	}
}

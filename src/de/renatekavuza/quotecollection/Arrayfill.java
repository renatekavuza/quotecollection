package de.renatekavuza.quotecollection;

public class Arrayfill {

	public static void main(String[] args) {
		String[] fullness = new String[5]; // The 5 skandhas

		fullness[0] = "matter, or body (rūpa)";
		fullness[1] = "sensations, or feelings (vedan�?)"; // positive, negative, neutral
		fullness[2] = "perceptions of sense objects (Sanskrit: saṃjñ�?; P�?li: saññ�?)";
		fullness[3] = "mental formations (saṃsk�?ras/sankh�?ras)";
		fullness[4] = "awareness, or consciousness, of the other three mental aggregates (vijñ�?na/viññ�?ṇa)";

		System.out.println("The 5 Skanthas are: ");
		for (int i = 0; i < fullness.length; i++) {
			System.out.println(fullness[i]);
		}
	}
}

package de.renatekavuza.quotecollection;

public class Arrayfill {

	public static void main(String[] args) {
		String[] fullness = new String[5]; // The 5 skandhas

		fullness[0] = "matter, or body (rÅ«pa)";
		fullness[1] = "sensations, or feelings (vedanÄ?)"; // positive, negative, neutral
		fullness[2] = "perceptions of sense objects (Sanskrit: saá¹ƒjÃ±Ä?; PÄ?li: saÃ±Ã±Ä?)";
		fullness[3] = "mental formations (saá¹ƒskÄ?ras/sankhÄ?ras)";
		fullness[4] = "awareness, or consciousness, of the other three mental aggregates (vijÃ±Ä?na/viÃ±Ã±Ä?á¹‡a)";

		System.out.println("The 5 Skanthas are: ");
		for (int i = 0; i < fullness.length; i++) {
			System.out.println(fullness[i]);
		}
	}
}

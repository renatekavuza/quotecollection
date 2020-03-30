
public class arrayfill {


	public static void main(String[] args) {
	String[] fullness = new String[5]; //The 5 skandhas
	
	fullness[0] = "matter, or body (rūpa)"; 
	fullness[1] = "sensations, or feelings (vedanā)"; // positive, negative, neutral
	fullness[2] = "perceptions of sense objects (Sanskrit: saṃjñā; Pāli: saññā)";
	fullness[3] = "mental formations (saṃskāras/sankhāras)"; 
	fullness[4] = "awareness, or consciousness, of the other three mental aggregates (vijñāna/viññāṇa)";
	
	System.out.println("The 5 Skanthas are: ");
	for(int i = 0; i < fullness.length; i++) {;
		System.out.println(fullness[i]);
		}
	}

}

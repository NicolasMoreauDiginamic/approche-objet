package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ManipulationFichier {

	public static void main(String[] args) throws IOException {
		String repertoire = "/Users/pc/Documents/workspace-spring-tool-suite-4-4.13.0.RELEASE/approche-objet/fichier";
		Path path = Paths.get(repertoire + "/recensement.csv");
		
		List<RecensementVille> villeRecense = new ArrayList<>();
		List<String> lines = Files.readAllLines(path,StandardCharsets.UTF_8);
		for (int numLigne = 0; numLigne<lines.size();numLigne++) {
			String uneLigne = lines.get(numLigne);
			if(numLigne >= 8 && !"".equals(uneLigne.trim())) {
				String[] uneLigneVille = uneLigne.split(";");
				RecensementVille ville = new RecensementVille();
				ville.setNomVille(uneLigneVille[6]);
				ville.setCodeDepartement(uneLigneVille[2]);
				ville.setPopuTotal(uneLigneVille[7]);
				villeRecense.add(ville);
				
				
			}
			
		}
		List<String> ligneExport = new ArrayList<>();
		
		for(RecensementVille uneVille : villeRecense) {
			ligneExport.add(uneVille.getNomVille() + ";" + uneVille.getCodeDepartement() + ";" + uneVille.popuTotal);
		}
		Files.write(Paths.get(repertoire + "/villeRecense.csv"),ligneExport,StandardCharsets.UTF_8);
		
		
	}

}

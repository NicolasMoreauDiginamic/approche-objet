package geometrie;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		
		ObjetGeometrique [] tabObjGeo = new ObjetGeometrique [2];
		tabObjGeo[0]  = new Cercle(3);
		tabObjGeo[1] = new Rectangle(3,7);
		
		for(int i=0; i<tabObjGeo.length;i++) {
			System.out.println(tabObjGeo[i].perimetre());
			System.out.println(tabObjGeo[i].surface());
		}

	}

}

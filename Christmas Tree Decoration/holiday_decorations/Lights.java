package holiday_decorations;

public class Lights extends Decorator {
	Tree treeType;

	public Lights(Tree treeType) {
		this.treeType = treeType;
	}

	public String getTreeType() {
		return treeType.getTreeType() + " Lights,";
	}

	public double getCost() {
		return treeType.getCost() + 5;
	}
}
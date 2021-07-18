package holiday_decorations;

public class Ruffles extends Decorator {
	Tree treeType;

	public Ruffles(Tree treeType) {
		this.treeType = treeType;
	}

	public String getTreeType() {
		return treeType.getTreeType() + " Ruffles,";
	}

	public double getCost() {
		return treeType.getCost() + 1;
	}
}
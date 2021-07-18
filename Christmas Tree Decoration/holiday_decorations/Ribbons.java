package holiday_decorations;

public class Ribbons extends Decorator {
	Tree treeType;

	public Ribbons(Tree treeType) {
		this.treeType = treeType;
	}

	public String getTreeType() {
		return treeType.getTreeType() + " Ribbons,";
	}

	public double getCost() {
		return treeType.getCost() + 2;
	}
}
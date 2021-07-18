package holiday_decorations;

public class LEDs extends Decorator {
	Tree treeType;

	public LEDs(Tree treeType) {
		this.treeType = treeType;
	}

	public String getTreeType() {
		return treeType.getTreeType() + " LEDs,";
	}

	public double getCost() {
		return treeType.getCost() + 10;
	}
}
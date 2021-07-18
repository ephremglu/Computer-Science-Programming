package holiday_decorations;

public class BallsRed extends Decorator {
	Tree treeType;

	public BallsRed(Tree treeType) {
		this.treeType = treeType;
	}

	public String getTreeType() {
		return treeType.getTreeType() + " a red ball,";
	}

	public double getCost() {
		return treeType.getCost() + 1;
	}
}
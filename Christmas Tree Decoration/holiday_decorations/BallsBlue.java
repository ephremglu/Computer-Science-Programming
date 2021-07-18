package holiday_decorations;

public class BallsBlue extends Decorator {
	Tree treeType;

	public BallsBlue(Tree treeType) {
		this.treeType = treeType;
	}

	public String getTreeType() {
		return treeType.getTreeType() + "a blue ball,";
	}

	public double getCost() {
		return treeType.getCost() + 2;
	}
}
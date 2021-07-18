package holiday_decorations;

public class BallsSilver extends Decorator {
	Tree treeType;

	public BallsSilver(Tree treeType) {
		this.treeType = treeType;
	}

	public String getTreeType() {
		return treeType.getTreeType() + " a silver ball,";
	}

	public double getCost() {
		return treeType.getCost() + 3;
	}
}
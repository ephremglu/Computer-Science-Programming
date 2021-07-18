package holiday_decorations;

public class Star extends Decorator {
	Tree treeType;

	public Star(Tree treeType) {
		this.treeType = treeType;
	}

	public String getTreeType() {
		if (treeType.getTreeType().contains("Star")) {
			System.out.println("Tree already has a Star!");
		} else if (!(treeType.getTreeType().contains("Star"))) {
			return treeType.getTreeType() + " a Star,";
		}
		return treeType.getTreeType() + "";
	}

	public double getCost() {
		if (!(treeType.getTreeType().contains("Star"))) {
			return treeType.getCost() + 4;
		} else
			return treeType.getCost() + 0;
	}
}
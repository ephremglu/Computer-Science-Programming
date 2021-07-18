package holiday_decorations;

public abstract class Tree {
	String treeType = "";

	public String getTreeType() {
		return this.treeType + " is decorated with";
	}
	
	public abstract double getCost();
}
import holiday_decorations.*;

public class TreeTester {
	public static void main(String[] args) {
		Tree treeType = new coloradoBlueSpruce();
		treeType = new Star(treeType);
		treeType = new Ruffles(treeType);
		treeType = new Star(treeType);
		treeType = new Ribbons(treeType);
		System.out.print(treeType.getTreeType());
		System.out.printf(" and costs $" + "%.2f" + "!", treeType.getCost());
	}
}

public class JntTree {

	/**
	 * complete, not tested yet.
	 * 
	 * @param node
	 * @return
	 */
	public int size(JntNode node) {
		if (node == null) return 0;
		else return sizeOf(node);
	}
	
	/**
	 * complete, not tested yet.
	 * 
	 * @param node
	 * @return
	 */
	public int sizeOf(JntNode node) {
		int result = 1;
		
		for(JntNode q : node.getChildren()) {
			result = result + sizeOf(q);
		}
		return result;
	}
	
	public int externalNodes(JntNode node) {
		return size(node) - internalNodes(node);
	}
	
	/**
	 * complete, not tested yet.
	 * 
	 * @param node
	 * @return
	 */
	public int internalNodes(JntNode node) {
		if (node == null) return 0;
		else return internalNodesOf(node);
	}
	
	/**
	 * complete, not tested yet.
	 * 
	 * @param node
	 * @return
	 */
	public int internalNodesOf(JntNode node) {
		if (node.isExternal()) return 0;
		else {
			int result = 1;
			for(JntNode q : node.getChildren()) {
				result = result + internalNodesOf(q);
			}
			return result;
		}
	}
}

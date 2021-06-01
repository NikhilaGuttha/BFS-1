class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null)
        {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            int length = queue.size();
            List<Integer> levels = new ArrayList<>();
            for(int i = 0; i < length; i++)
            {
                TreeNode temp = queue.remove();
                if(i <= length-1)
                {
                    levels.add(temp.val);
                }
                if(temp.left != null)
                {
                    queue.add(temp.left);
                }
                if(temp.right != null)
                {
                    queue.add(temp.right);
                }
            }
            result.add(levels);
        }
        return result;
    }
}

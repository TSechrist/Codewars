def maxDepth(self, root):
    """
    :type root: TreeNode
    :rtype: int
    """
    if root is None:
        return 0
    queue = [root]
    depth = 0
    while queue:
        depth += 1
        for i in range(len(queue)):
            cur_root = queue.pop(0)
            if cur_root.left:
                queue.append(cur_root.left)
            if cur_root.right:
                queue.append(cur_root.right)
    return depth

print(maxDepth([3,9,20,None, None,15,7]))
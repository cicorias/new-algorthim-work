

def print_bst_level(root):
    """Prints the tree in level order."""
    if root is None:
        return
    print_bst_level(root.left)
    print(root.data, end=' ')
    print_bst_level(root.right)


def print_levels_bst(root):
    """Prints the tree in level order."""
    if root is None:
        return
    q = []
    q.append(root)
    while len(q) > 0:
        node = q.pop(0)
        print(node.data, end=' ')
        if node.left is not None:
            q.append(node.left)
        if node.right is not None:
            q.append(node.right)

            
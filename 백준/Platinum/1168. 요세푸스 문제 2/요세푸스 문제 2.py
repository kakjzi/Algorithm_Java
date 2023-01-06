def main():
    def delete_kth(k: int):
        i = 1
        while i < tree_size:
            i += i
            t = tree[i]
            if t < k:
                k -= t
                i += 1
            tree[i] -= 1
        tree[1] -= 1
        return i - tree_size

    N, K = [int(x) for x in input().split()]

    tree_size = 1 << (N - 1).bit_length()
    tree = [0] * (tree_size + tree_size)
    tree[tree_size:tree_size + N] = [1] * N
    for i in range(tree_size - 1, 0, -1):
        tree[i] = tree[i + i] + tree[i + i + 1]
        
    order = 0
    answer = []
    for i in range(N, 0, -1):
        order = (order + K - 1) % i
        num = delete_kth(order + 1)
        answer.append(num + 1)

    print('<', end='')
    print(', '.join(str(x) for x in answer), end='>')


if __name__ == '__main__':
    main()
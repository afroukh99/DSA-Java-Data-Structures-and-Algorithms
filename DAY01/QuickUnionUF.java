public class QuickUnionUF {
    public int[] id;

    public QuickUnionUF(int N) {
        id = new int[N];
        for (int i = 0 ; i < N ; i++) {
            id[i] = i;
        }
    }

    public int root (int i) {
        while (i != id[i]) i = id[i];
        return  i;
    }

    // Find with path compression
    public int find (int i) {
        while (i != id[i]) {
            id[i] = id[id[i]]; //path compression : point to grandparent
            i = id[i];
        }
        return i;
    }

    public boolean connected (int p , int q) {
        return root(p) == root(q);
    }


    public void union (int p , int q) {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }



}

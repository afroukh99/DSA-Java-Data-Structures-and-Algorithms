package Assignments;

public class WeightedQUnionUF {
    int id[];
    int size[];
    int count;

    public WeightedQUnionUF(int N) {
        id = new int[N];
        size = new int[1];
        count = N;
        for (int i  = 0 ; i < N ; i++) {
            id[i] = i;
        }
    }

    int count () {return count;}

    void validate (int p) {
        int n = id.length;
        if (p < 0 || p >= n) {
            throw new IllegalArgumentException("index " + p + " is not between 0 and " + (n - 1));
        }
    }

     int root (int i) {
        validate(i);
        while (i!=id[i]) return id[i];
        return i;
    }


    void union (int p , int q) {
        int rootP = root(p);
        int rootQ = root(q);

        if (rootP == rootQ) return;

        if (size[rootP] > size[rootQ]) {
            id[rootQ] = rootP;
            size[rootP] += size[rootQ];
        }else {
            id[rootP] = rootQ;
            size[rootQ] += size[rootP];
        }
        count--;
    }


    boolean connected (int p , int q) {
        int rootP = root(p);
        int rootQ = root(q);
        return  rootP == rootQ;
    }



}

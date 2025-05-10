public class QuickFindUF {

    public int[] id;

    public QuickFindUF(int N) {
        id = new int[N];
        for (int i = 0 ; i < N ; i++) {
            id[i] = i;
        }
    }

    public boolean connected (int p , int q) {
        if (id[p] == id[q]) {
            return true;
        }
        return  false;
    }


    public void union (int p , int q) {
        if (!(connected(p , q))) {
            for (int i = 0; i < id.length ; i++) {
                if (id[i] == id[p] ) {
                    id[i] = id[q];
                }
            }
        }
    }

}

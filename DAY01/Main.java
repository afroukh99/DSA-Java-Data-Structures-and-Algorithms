public class Main {
    public  static  void main (String args[]) {
        QuickFindUF quickFindUF = new QuickFindUF(6);
        boolean connected = quickFindUF.connected(0, 4);
        System.out.println("***** Before Union ******");
        System.out.println("p and q Connected :"+connected);
        System.out.println("**** Array before Union *****");
        for (int i = 0; i < quickFindUF.id.length ; i++ ) {
            System.out.printf("%d " , quickFindUF.id[i]);
        }
        System.out.println();
        System.out.println("***** After Union ******");
        quickFindUF.union(0,4);
        connected = quickFindUF.connected(0,4);
        System.out.println("p and q connected :"+connected);
        System.out.println("**** Array after Union *****");
        for (int i = 0; i < quickFindUF.id.length ; i++ ) {
            System.out.printf("%d " , quickFindUF.id[i]);
        }
    }
}

public class OperadorTernario {
    public static void main(String[] args) {
        int n1, n2, n3, n4;
        n1 = 10;
        n2 = 20;
        n3 = (n1 > n2) ? n1 : n2;
        n4 = Math.max(n1, n2);
        System.out.println(n3);
        System.out.println(n4);

        //Outro exemplo
        int v1, v2, v3;
        v1 = 10;
        v2 = 20;
        v3 = (v1 > v2) ? 0 : 1;
        System.out.println(v3);

        // Outro exemplo
        int x, y, z;
        x = 10;
        y = 20;
        z = (x > y) ? x+y : x-y;
        System.out.println(z);


    }
}

// Write a java program to swap the content of two objects.

class abc{
    int n;
    abc(int x){
        n = x;
    }
}

class q1{
    public static void main(String[] args) {
        abc a = new abc(5);
        abc b = new abc(10);

        int tmp = a.n;
        a.n = b.n;
        b.n = tmp;

        System.out.println(a.n);
        System.out.println(b.n);
    }
}
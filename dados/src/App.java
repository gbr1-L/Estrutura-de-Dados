public class App {
    public static void main(String[] args) throws Exception {
        Fila f = new Fila(4);

        System.out.println(f.isEmpty());

        System.out.println(f.isFull());
        f.add(21);
        f.add(4);
        System.out.println(f.peek());
        System.out.println(f.isFull());
        f.add(6);
        f.add(11);
        System.out.println(f.peek());
        System.out.println(f.isFull());
        f.remove();
        System.out.println(f.peek());
    }
}

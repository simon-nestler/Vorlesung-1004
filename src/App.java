public class App {
    public static void main(String[] args) throws Exception {
        NumberList list = new NumberList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);
        list.remove(2);
        System.out.println(list);

    }
}

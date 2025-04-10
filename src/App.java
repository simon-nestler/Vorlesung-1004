public class App {
    public static void main(String[] args) throws Exception {
        NumberList list = new NumberList();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(1);
        list.add(3);

        System.out.println(list);
        System.out.println(list.getFrequency(2));
        System.out.println(list.getFrequency(1));
        System.out.println(list.getFrequency(3));
    }
}

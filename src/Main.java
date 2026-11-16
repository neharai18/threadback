public class Main {
    public static void main(String[] args) {
        Entry e = new Entry("Write tests", "Cover validation", EntryType.TASK);
        System.out.println(e.isResolved());
        e.markResolved();
        System.out.println(e.isResolved());
    }
}
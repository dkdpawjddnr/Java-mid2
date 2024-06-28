package collection.list;

public class BatchProcessorMain {

    public static void main(String[] args) {
        //MyArrayList<Integer> list = new MyArrayList<>();
        MyLinkedList<Integer> list = new MyLinkedList<>(); //훨씬 빨라진 것을 확인 할 수 있음.

        BatchProcessor processor = new BatchProcessor(list);
        processor.logic(50_000);
    }
}

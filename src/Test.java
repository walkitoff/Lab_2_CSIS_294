import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        // BEGIN Merkle root test
        ArrayList<String> lstTransactions = new ArrayList<>();
        lstTransactions.add("t1");
        lstTransactions.add("t2");
        lstTransactions.add("t3");
        lstTransactions.add("t4");

        Util oUtil = new Util();
        String sMerkleRoot = oUtil.getMerkleRoot(lstTransactions);
        System.out.println(sMerkleRoot);

        // @@ BEGIN Multithreading
        MinorThread oMiner1 = new MinorThread();
        oMiner1.threadName = "Thread 1";
        Thread oThread1 = new Thread(oMiner1);
        oThread1.start();  //start()  method of Thread class

        System.out.println("This is the main thread after other threads spawned.");

        //2nd thread
        MinorThread oMiner2 = new MinorThread();
        oMiner2.threadName = "Thread 2";
        Thread oThread2 = new Thread(oMiner2);
        oThread2.start();  //start()  method of Thread class
    }

}

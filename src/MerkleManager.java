// Merkle Manager
// Authors: Tyler Dollick, Reese Norris

public class MerkleManager {

    public static volatile String inputWord;
    public static String expectedMerkleRoot;
    public static String actualMerkleRoot = null;
    public static int strikeCount = 0;

    public void manage() {
        Util util = new Util();
        MerkleManager.expectedMerkleRoot = util.promptUser("Enter expected merkle root:");

        Thread merkleThread = new Thread(new MerkleThread());
        Thread rogueThread = new Thread(new RogueThread());
        Thread monitorThread = new Thread(new MonitorThread());
       // merkleThread.start();
        rogueThread.start();
        monitorThread.start();

        while (true) {
            MerkleManager.inputWord = util.promptUser("Enter word:");
        }
    }

    public static synchronized String grabWord() {
        String temp = inputWord;
        inputWord = null;
        return temp;
    }
}

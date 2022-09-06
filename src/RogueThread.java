// Rogue Thread

public class RogueThread implements Runnable {

    public void run() {
        Util oUtil = new Util();

        while(true)
        {
            oUtil.sleepRandomTime("Rogue");
            String sNewWord = MerkleManager.grabWord();
            if (sNewWord != null) {
                MerkleManager.strikeCount += 1;
                System.out.println("Rogue grabbed a word! STRIKE " + MerkleManager.strikeCount);
            }
        }
    }
}

// Rogue Thread
// Authors: Evan Lindemann

public class RogueThread implements Runnable {

    @Override
    public void run() {
        Util oUtil = new Util();

        while(true)
        {
            oUtil.sleepRandomTime("Rogue");
            String sNewWord = MerkleManager.grabWord();
            if (sNewWord != null) {
                // **** when strike reaches 3 nothing happens right now ****
                //Fixed.... not sure what fixed it tho.
                MerkleManager.strikeCount++;
                System.out.println("Rogue grabbed a word! STRIKE " + MerkleManager.strikeCount);
            }
        }
    }
}

import java.util.ArrayList;

public class MerkleThread implements Runnable {
    public static volatile ArrayList<String> lstWords;  //hold grabbed words
    private int iMerkleTreeInputs = 4; // required # of words to get before creating merkle tree


    public void run() {
        Util oUtil = new Util();
        lstWords = new ArrayList<String>();

        while(true) {
            oUtil.sleepRandomTime("Merkle");
            String sNewWord = MerkleManager.grabWord();

            if (sNewWord != null) {
                System.out.println("Merkle grabbed a word!");
                lstWords.add(sNewWord);
                if(lstWords.size() == iMerkleTreeInputs) {
                    MerkleManager.actualMerkleRoot = oUtil.getMerkleRoot(lstWords);
                }
            }
        }
    }
}

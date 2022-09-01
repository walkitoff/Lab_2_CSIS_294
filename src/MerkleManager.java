public class MerkleManager {

    //DONE: Instance Variables
    public static volatile String userWord; //user's inputted word
    public static String expected_Merkle_Root;
    public static String merkleRoot = null;
    public static int strikes = 0;

    //TODO: create public method: manage()  to be called in main() of MerkleManager_Test
        //see READEME.md ii. 2. for full instructions
    public void manage() {
        //TODO: prompt user for Expected Merkle Root  ...aka the hash of the merkle root
        //TODO: put user input into expected_Merkle_Root variable
        //TODO: Start 3 separate threads: instantiate and start() new threads for ...
        // MerkleThread, RogueThread and MonitorThread
        //TODO: Begin UI question Loop:
             //while(true)...ask user for a word and put it into  String userWord;
    }

    //TODO: create method: public static synchronized String grabWord()
    public static synchronized String grabWord() {
        //TODO: Puts instance variable of user's word into a temp String variable then
        // sets instance variable userWord to null;
        //TODO: return temp String variable
    }
}

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;

import static java.lang.Thread.sleep;

public class Util {

    public String getMerkleRoot(ArrayList<String> lstItems){
        //hard code tree intput to 4 items
        //4 leafs
        MerkleNode oNode1 = new MerkleNode();
        MerkleNode oNode2 = new MerkleNode();
        MerkleNode oNode3 = new MerkleNode();
        MerkleNode oNode4 = new MerkleNode();
        //parent trees
        MerkleNode oNode5 = new MerkleNode(); // 1 + 2
        MerkleNode oNode6 = new MerkleNode(); // 3 + 4
        //root
        MerkleNode oNode7 = new MerkleNode(); // 5 + 6


        //build leafs
        oNode1.sHash = generateHash(lstItems.get(0));
        oNode1.sHash = generateHash(lstItems.get(1));
        oNode1.sHash = generateHash(lstItems.get(2));
        oNode1.sHash = generateHash(lstItems.get(3));

        populateMerkleNode(oNode7, oNode5, oNode6);

        return oNode7.sHash;
    }

    public void populateMerkleNode(MerkleNode oNode, MerkleNode oLeftNode, MerkleNode oRightNode){
        oNode.oLeft = oLeftNode;
        oNode.oRight = oRightNode;
        oNode.sHash = generateHash(oNode.oLeft.sHash + oNode.oRight.sHash);

    }

    public synchronized String generateHash(String sOriginal) {

        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] btEncodedhash = digest.digest(
                    sOriginal.getBytes(StandardCharsets.UTF_8));

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < btEncodedhash.length; i++) {
                sb.append(Integer.toString((btEncodedhash[i] & 0xff) + 0x100, 16).substring(1));
            }
            return sb.toString();
        } catch (Exception ex) {

            System.out.println("Error generating hash: " + ex.getMessage());
            return null;
        }
    }

    public void sleepRandomTime(String sThreadName){

        // Gets random number between 0 and 5 and then adds 3, meaning between 3 and 8 now.
        int iSleepTime = new SecureRandom().nextInt(5) + 3;

        System.out.println(sThreadName + " sleeping for " + iSleepTime + " seconds.");
        sleep(iSleepTime);
    }

    private void sleep(int iSeconds){

        try{
            Thread.sleep(iSeconds * 1000);
        }
        catch(Exception ex){
            //do nothing
        }
    }


}
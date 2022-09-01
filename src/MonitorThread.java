//DONE: implements Runnable
public class MonitorThread implements Runnable {

    //TODO: create method:  public run() method that is triggered when "start()  method" is called
    public void run() {
        //DONE: create enless loop:
        while(true) {
            //TODO:   i.	If MerkleManager.sMerkleRoot is not null then…
            //          1.	If the above merkle root equals the initial user-entered merkle root
            //              (which you can access the same way as above since they’re both static on MerkleManager):
            //               a.	Then print out “You win: “ followed by the merkle root
            //               (which is the above static variable on MerkleManager)
            //               and exit the app.
            //          2.	Else if they’re not equal, then tell the user and that the user lost –
            //              and exit the app.
            // 	To exit:  System.exit(0);

            //TODO:  ii.	Else if MerkleManager.iStrikes equals 3 then print out “3 strikes: you lost!”
            //              or something like that and exit the app as shown in line of code above.

            //TODO: iii.	After the if-else statement, then call sleep on util object and sleep for 1 second.
            //        1.	(if you don’t do this, the endless loop never allows updates on that thread to see
            //              MerkleManager’s changing values.)
        }
    }
}

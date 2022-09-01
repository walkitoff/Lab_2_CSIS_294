
//TODO: remove, keeping for reference until later.
public class MinorThread implements Runnable {

    public String threadName;

    public void run() {
        System.out.println(this.threadName + " started...");

        while(true){
            System.out.println(this.threadName + " has woken up!");
            Util oUtil = new Util();
            oUtil.sleepRandomTime(this.threadName);
        }

    }

}

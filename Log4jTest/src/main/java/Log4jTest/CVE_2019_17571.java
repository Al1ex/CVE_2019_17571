package Log4jTest;

import org.apache.log4j.Logger;
import org.apache.log4j.net.SimpleSocketServer;

public class CVE_2019_17571 {

    private static final Logger log = Logger.getLogger(SimpleSocketServer.class);
    public static void main(String[] args) {
        System.out.println("start:");
        String[] argss = {"4444", "src/log4j.properties"};
        SimpleSocketServer.main(argss);
        log.info("succ");
    }
}
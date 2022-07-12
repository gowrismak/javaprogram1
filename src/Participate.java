

import java.util.*;
import java.util.Map.*;
public class Participate {
    public static void main(String args[]) {
        HashMap participant = new HashMap();
        participant.put(1 + 1, "Samantha");
        participant.put(0 + 1, "Kiran");
        participant.put(2 + 1, "Anushka");
        Set set = participant.entrySet();
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            Map.Entry m = (Entry) itr.next();
            System.out.print(m.getKey() + " " + m.getValue() + ", ");
        }
        System.out.println();
        itr = set.iterator();
        while (itr.hasNext()) {
            Map.Entry m = (Map.Entry) itr.next();
            System.out.print(m.getKey() + " " + m.getValue() + ", ");
        }
    }
}

/*public class Participate {

}*/

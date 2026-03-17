/**
 * Write a description of class StreamBase here.
 *
 * @author Aaron Gomes
 * @version 13/03/26
 */
public class StreamBase
{
    // Static seat counts for all instances (shared across allocations)
    static int EXTCseats;
    static int CEseats;
    static int CSEseats;

    //Hence i can bypass if canditate object is created as seats arent changed
    StreamBase() {
    }

    StreamBase(String streamName, int seats){
        switch(streamName){
            case "EXTC":
                EXTCseats = seats;
                break;
            case "CE":
                CEseats = seats;
                break;
            case "CSE":
                CSEseats = seats;
                break;
        }
    }

    // Allocate a seat for the given stream if available.
    boolean allocateSeat(String streamName) {
        switch(streamName){
            case "EXTC":
                if (EXTCseats > 0) {
                    EXTCseats--; // Seat alocated
                    return true;
                }
                break;
            case "CE":
                if (CEseats > 0) {
                    CEseats--; // Seat alocated
                    return true;
                }
                break;
            case "CSE":
                if (CSEseats > 0) {
                    CSEseats--;    // Seat alocated
                    return true;
                }
                break;
        }
        return false;
    }
}

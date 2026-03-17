/**
 * Write a description of class AllocationDerived here.
 *
 * @author Aaron Gomes
 * @version 13/03/26
 */
public class AllocationDerived extends StreamBase
{
    int rollNo;
    double score;
    int numberOfPreferences;
    String[] preferences;

    // The allocated stream for this candidate (null if none)
    String allocatedStream;

    // Default constructor used for utility method calls.
    AllocationDerived(){
        super();
        this.allocatedStream = null;
    }

    // Constructor overloaded for the candidtate details.
    AllocationDerived(int rollNo, double score, int numberOfPreferences, String[] preferences){
        super();
        this.rollNo = rollNo;
        this.score = score;
        this.numberOfPreferences = numberOfPreferences;
        this.preferences = preferences;
        this.allocatedStream = null;
    }

    //Sort candidates by score in descending
    void sortCandidates(AllocationDerived[] candidates){
        for(int i = 0; i < candidates.length - 1; i++){
            for(int j = 0; j < candidates.length - i - 1; j++){
                boolean swap = candidates[j].score < candidates[j+1].score;
                if(swap){
                    AllocationDerived temp = candidates[j];
                    candidates[j] = candidates[j+1];
                    candidates[j+1] = temp;
                }
            }
        }
    }

    // Allocate seats to candidates in order acc to score and prefrence
    void allocateSeats(AllocationDerived[] candidates){
        sortCandidates(candidates);
        for(AllocationDerived candidate : candidates){
            candidate.allocatedStream = null;
            for(String pref : candidate.preferences){
                if (new StreamBase().allocateSeat(pref)){
                    candidate.allocatedStream = pref;
                    break;
                }
            }
        }
    }

    void displayAllocation(AllocationDerived[] candidates){
        System.out.println("Seat Allocation");
        for(AllocationDerived candidate : candidates){
            // Print roll number and allocated stream
            System.out.println(candidate.rollNo + " " + (candidate.allocatedStream == null ? "null" : candidate.allocatedStream));
        }
    }
}

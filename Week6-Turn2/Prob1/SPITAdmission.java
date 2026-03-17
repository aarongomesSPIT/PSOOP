/**
 * Write a description of class SPITAdmission here.
 *
 * @author Aaron Gomes
 * @version 13/03/26
 */

import java.io.*;
public class SPITAdmission
{
    public static void main() throws IOException{
        System.out.println("Aaron Gomes 2025300073");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter no. Of streams : ");
        int n = Integer.parseInt(br.readLine().trim());

        StreamBase[] streams = new StreamBase[n];

        System.out.println("\nEnter streamwise seats :");
        for(int i=0; i<n; i++){
            String streamInfo = br.readLine();
            String[] streamDetails = streamInfo.split(" "); // Split by space
            String streamName = streamDetails[0];
            int seats = Integer.parseInt(streamDetails[1]);
            StreamBase stream = new StreamBase(streamName, seats);
            streams[i] = stream;
        }

        System.out.print("\nEnter total candidates: ");
        int totalCandidates = Integer.parseInt(br.readLine().trim());

        AllocationDerived[] candidates = new AllocationDerived[totalCandidates];
        System.out.println("\nEnter Candidate Preferences(RollNo Score NumberOfPreferences Preferences):");
        for(int i = 0; i < totalCandidates; i++){
            String candidateInfo = br.readLine();
            String[] candidateDetails = candidateInfo.split(" "); // Split by space
            
            int rollNo = Integer.parseInt(candidateDetails[0]);
            double score = Double.parseDouble(candidateDetails[1]);
            int numberOfPreferences = Integer.parseInt(candidateDetails[2]);
            String[] preferences = new String[numberOfPreferences]; 
            
            for(int j = 0; j < numberOfPreferences; j++){
                preferences[j] = candidateDetails[3+j]; 
            }
            AllocationDerived candidate = new AllocationDerived(rollNo, score, numberOfPreferences, preferences);
            candidates[i] = candidate; //Store the candidate in array
        }

        new AllocationDerived().allocateSeats(candidates); //Allocate seats
        System.out.println();
        new AllocationDerived().displayAllocation(candidates);
    }
}

  /**
 * Write a description of class RomanDecimalConverter here.
 *
 * @brief The Class that converts the roman to decimal and vice versa
 * @author Aaron Gomes
 * @version 27/02/26
 */
public class RomanDecimalConverter
{
    int I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000;
    // All the variables for the values in roman numerals
    RomanDecimalConverter(){
    };
    
    void toDecimal(String roman){
        int decimal = 0;
        for(int i = roman.length() - 1; i >= 0; i--){
            char prev = 'g'; //Just random value to initialize
            if(i != 0){ // Skip if its 0
                prev = roman.charAt(i - 1); //Previous char
            }
            switch(roman.charAt(i)){
                case 'M':
                    decimal += M;
                    break;
                case 'D':
                    decimal += D;
                    break;
                case 'C': // Only C is subtracted from M or D
                    if(prev == 'M' || prev == 'D') decimal -= C;
                    else decimal += C;
                    break;
                case 'L':
                    decimal += L;
                    break;
                case 'X': // X is subtracted from L or C
                    if(prev == 'L' || prev == 'C') decimal -= X;
                    else decimal += X;
                    break;
                case 'V':
                    decimal += V;
                    break;
                case 'I': // I is subtracted from V or X
                    if(prev == 'V' || prev == 'X') decimal -= I;
                    else decimal += I;
                    break;
                default:
                    break;
            }
        }
        System.out.println(decimal);
    }
    
    void toRoman(int decimal){
        String roman = ""; //Initialize an empty string
        while(decimal !=0){
            if(decimal >= M){
                decimal -= M; // Subtract the decimal number
                roman += "M"; // Append to the roman string
            }
            else if(decimal >= D){
                decimal -= D; // Subtract the decimal number
                roman += "D"; // Append to the roman string
            }
            else if(decimal >= C){
                decimal -= C; // Subtract the decimal number
                roman += "C"; // Append to the roman string
            }
            else if(decimal >= L){
                decimal -= L; // Subtract the decimal number
                roman += "L"; // Append to the roman string
            }
            else if(decimal >= X){
                decimal -= X; // Subtract the decimal number
                roman += "X"; // Append to the roman string
            }
            else if(decimal >= V){
                decimal -= V; // Subtract the decimal number
                roman += "V"; // Append to the roman string
            }
            else{
                decimal -= I; // Subtract the decimal number
                roman += "I"; // Append to the roman string
            }
        }
        System.out.println(roman); // Print the output
    }
}
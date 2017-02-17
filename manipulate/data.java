

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ahmedkhaled
 */

public class data {
    
    private ArrayList <String> X,Y;

    /**
     * @return the X
     */
    public ArrayList <String> getX() {
        return X;
    }

    /**
     * @param X the X to set
     */
    public void setX(ArrayList <String> X) {
        this.X = X;
    }

    /**
     * @return the Y
     */
    public ArrayList <String> getY() {
        return Y;
    }

    /**
     * @param Y the Y to set
     */
    public void setY(ArrayList <String> Y) {
        this.Y = Y;
    }
    
    public ArrayList <String> crossXY(ArrayList <String> X,ArrayList <String> Y){
        if(X.size() == Y.size()) {
        try {
        
        ArrayList <String> C = new ArrayList<String>();
        for (int i = 0; i < X.size(); i++)
            C.add(X.get(i) + "," + Y.get(i));
	return C;
        } catch (Exception e) {
            System.err.println(e);
            }
        }
       return null;
    }
    
    public double calculateAverage(List <Integer> numbers) {
        Integer sum = 0;
        if(!numbers.isEmpty()) {
          for (Integer number : numbers) {
              sum += number;
          }
          return sum.doubleValue() / numbers.size();
        }
        return sum;
    }
    
    public int calculateMode(List <Integer> numbers) { 
        int mode = numbers.indexOf(0);
        int maxCount = 0;
         for (Integer number : numbers) {
              int count = 0;
              for (Integer number2 : numbers) {
                 if (number2 == number) count++;
                 if (count > maxCount) {
                    mode = number;
                    maxCount = count;
                    }
              }
          }
          if (maxCount > 1) {
            return mode;
        }
        return 0;
    }
 
    public int calculateMedian(List <Integer> numbers) { 
        int middle = numbers.size() / 2;
         if (numbers.size()%2 == 1) {
            return numbers.indexOf(middle);
        }else{
            return (int) ((int) (numbers.indexOf(middle-1) + numbers.indexOf(middle)) / 2.0);
        }
    }
    
    
    
}

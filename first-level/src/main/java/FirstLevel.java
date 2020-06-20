import java.util.HashSet;
import java.util.Set;

public class FirstLevel implements GeneralsMethod {


    @Override
    public int returnNumberOfUniqueSymbols(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int value : arr) {
            set.add(value);
        }
        return set.size();
    }

    @Override
    public boolean moveOfHorse(int firstX, int firstY, int stepX, int stepY) {
        if(Math.abs(firstX-stepX)==1 && Math.abs(firstY-stepY)==2){
            return true;
        } else return (Math.abs(firstX-stepX)==2 && Math.abs(firstY-stepY)==1);
    }

    @Override
    public double areaOfTriangle(int aX, int aY, int bX, int bY, int cX, int cY) {
        return (double) Math.abs((((aX-cX)*(bY-cY))-((bX-cX)*(aY-cY))))/2;
    }
}

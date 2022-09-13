import java.util.ArrayList;

public class BusPassangerCount {
    public static void main(String[] args) {

            ArrayList<int[]> list = new ArrayList<int[]>();
            list.add(new int[] {10,0});
            list.add(new int[] {3,5});
            list.add(new int[] {2,5});

        System.out.println(countPassengers(list));
        System.out.println(countPassengersTwo(list));
    }
    public static int countPassengers(ArrayList<int[]> stops) {
       int in=0, out=0;
        for (int[] eachStop : stops) {
                in+=eachStop[0];
                out+=eachStop[1];
            }
        int passLeft=in-out;
        return passLeft;
    }
    public static int countPassengersTwo(ArrayList<int[]> stops) {
        int numOfPeople=0;
        for (int i = 0; i <stops.size() ; i++) {
            numOfPeople=numOfPeople+stops.get(i)[0]-stops.get(i)[1];
        }
    return numOfPeople;
    }

}

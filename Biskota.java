import java.util.ArrayList;

public class Biskota {
    public static void main(String[] args) {
        ArrayList <int []> StopGo = new ArrayList<int[]>();
        //array pertama orang naik bus, array kedua orang turun bus

        StopGo.add(new int[] {10,0});
        StopGo.add(new int[] {3,5});
        StopGo.add(new int[] {2,5});
        System.out.println(getPassenger(StopGo));
    }

    public static int getPassenger(ArrayList<int[]> Biskota) {
        int a = Biskota.get(0)[0];
        int b = Biskota.get(0)[1];
        int c = Biskota.get(1)[0];
        int d = Biskota.get(1)[1];
        int e = Biskota.get(2)[0];
        int f = Biskota.get(2)[1];
        int jumlah = a - b +c - d + e - f;
        return jumlah;
    }
}
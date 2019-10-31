import cloud.DataMaker;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DataMaker dm = new DataMaker();
        String a = null;
        while((a = dm.readLine())!=null){
            System.out.println(a);
        }

    }
}

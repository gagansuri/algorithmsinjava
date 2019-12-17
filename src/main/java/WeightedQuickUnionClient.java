import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class WeightedQuickUnionClient {

    public static void main(String[] args) throws Exception {
        //read from file
        File file = new File(
                WeightedQuickUnionClient.class.getClassLoader().getResource("UFInput.txt").getFile()
        );
        BufferedReader br=new BufferedReader(new FileReader(file));
        int n = Integer.parseInt(br.readLine().trim());
        WeightedQuickUnion wQU=new WeightedQuickUnion(n);
        String line=null;
        while((line=br.readLine())!=null) {
            int p = Integer.parseInt(line.split(" ")[0]);
            int q = Integer.parseInt(line.split(" ")[1]);
            if(!wQU.connected(p,q)) {
                wQU.union(p, q);
                System.out.println("p->"+p+" q->"+q);
            }
        }
        br.close();
        wQU.printNodes();
    }
}

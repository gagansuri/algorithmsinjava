package com.mixedcode;

import com.passion.study.coursera.algorithms.part1.unionfind.UnionFind;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class UnionFindClient {

    public static void main(String[] args) throws Exception {
        //read from file
        File file = new File(
                UnionFindClient.class.getClassLoader().getResource("UFInput.txt").getFile()
        );
        BufferedReader br=new BufferedReader(new FileReader(file));
        int n = Integer.parseInt(br.readLine().trim());
        //UnionFind uf=new UnionFind(n);
        UnionFind uf=new UnionFind(n);
        String line=null;
        while((line=br.readLine())!=null) {
            int p = Integer.parseInt(line.split(" ")[0]);
            int q = Integer.parseInt(line.split(" ")[1]);
            if(!uf.connected(p,q)) {
                uf.union(p, q);
                System.out.println("p->"+p+" q->"+q);
            }
        }
        br.close();
        uf.printNodes();
    }
}

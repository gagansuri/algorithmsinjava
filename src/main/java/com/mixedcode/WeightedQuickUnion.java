package com.mixedcode;

public class WeightedQuickUnion {

    private int id[];
    private int N;
    private int sz[];
    public WeightedQuickUnion(int n) {
        this.N=n;
        sz=new int[this.N];
        id=new int[this.N];
        for(int i=0;i<N;i++) {
            id[i]=i;
            sz[i]=1;
        }
    }



    public void union(int p,int q) {
        // at the beginning the array looks like this 0 1 2 3 4 5 6 7 8 9
        // each element is its own root. i.e at each index the value is same as the index id
        // but when some element becomes the root of some other element that some other element ceases to exist
        // which in essence means that at that index location the value is now replaced by the value of its root
        // lets say we have union (2,3) which means 2 is now connected to 3 or 2 ceases to exist and is now a part of group containing 3
        // i.e at the index 2 we will have a vaue 3

        // the new array(forest) after union(2,3) operation looks something like this

        // 0 1 3 3 4 5 6 7 8 9  which means 2 is joined to 3 or element 2 has a root 3
        //in union(p,q) the node q becomes the root of p and the value p in the array does not exist anymore

        // for weighted union we have to check the size of each tree and connect the smaller tree's root to the larger trees root.
        // also add the sizes accordingly

        // keep the size of all the trees
        // union(p,q) first find the root of p and also root of q and then
        // check the size of tree with root p and also size of tree with root q
        // then attach the smaller tree root to the larger tree root to keep the tree balanced and prevent is from growing too long
        // increase the size of the new tree accordingly

        int i= root(p);
        int j = root(q);
        if(sz[i]<=sz[j]) {
            id[i]=j;
            sz[j]+=sz[i];
        } else {
            id[j]=i;
            sz[i]+=sz[j];
        }

        id[p]=q;

    }

    private int root(int i) {
        while(i!=id[i]) {
            i=id[i];
        }
        return i;

    }

    public boolean connected(int p,int q) {
        //check if the root of p and q are same i.e check if id[p]= id[q]

        return root(p)==root(q);

    }

    public void printNodes(){
        for(int i=0;i<this.N;i++) {
            System.out.print(id[i] + " ");
        }
    }


}

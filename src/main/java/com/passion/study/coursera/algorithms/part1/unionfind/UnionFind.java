package com.passion.study.coursera.algorithms.part1.unionfind;

public class UnionFind
{
  private int id[];
  private int N;
  public UnionFind(int _N)
  {
    this.N = _N;
    this.id = new int[this.N];
    for (int i = 0; i < this.N; i++)
    {
      id[i] = i;
    }
  }
    public void union(int p,int q) {
      //read as join p to q i.e change the value of p to value of q
      // union (2,3) set id[2] = id[3]
      // if a node is already joined to someother node then join that as well
      int pid=id[p];
      int qid=id[q];
      /*if(id[i]==pid ) {
        id[i]=qid;
      }*/

      for(int i=0;i<this.N;i++) {
        if(this.id[i]==pid) {
          this.id[i]=qid;
        }
      }

    }

    public boolean connected(int p,int q) {
      return this.id[p]==this.id[q];
    }

  public void printNodes(){
    for(int i=0;i<this.N;i++) {
      System.out.print(id[i] + " ");
    }
  }

  }



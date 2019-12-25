import java.util.*;
public class t {


    // IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED

    // CLASS BEGINS, THIS CLASS IS REQUIRED

        // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
        int numberAmazonGoStores(int rows, int column, List<List<Integer> > grid)
        {
            // WRITE YOUR CODE HERE

            Map<String,String> map=new HashMap<>();

            for(int i=0;i<rows;i++) {
                for(int j=0;j<column;j++) {
                    if(grid.get(i).get(j)==1 ) {
                        //check its left right top and bottom
                        //check left
                        map.put(i+""+j,i+""+j);
                        if(j>0) {
                            if(grid.get(i).get(j-1)==1) {
                                map.put(i+""+(j-1),i+""+(j-1));
                            }
                            //check right
                            if(j<column-1) {
                                if(grid.get(i).get(j+1)==1) {
                                    map.put(i+""+(j+1),i+""+(j+1));
                                }
                            }

                            //check top

                            if(i>0) {
                                if(grid.get(i-1).get(j)==1) {
                                    map.put((i-1)+""+j,(i-1)+""+j);
                                }
                            }

                            //check bottom
                            if(i<rows-1) {
                                if(grid.get(i+1).get(j)==1) {
                                    map.put((i+1)+""+j,(i+1)+""+j);
                                }
                            }

                        }


                    }

                }
            }



            System.out.println("map :"+map);

            return map.size();

            // METHOD SIGNATURE ENDS
        }
    }


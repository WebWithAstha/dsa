package graph;

import practice_2Jan.optimized.Array;

import java.util.Arrays;

public class Implementation {

    void graphByMatrix(int mat[][], int u, int v, boolean isDirected){
        if(isDirected){
            mat[u][v] = 1;
        }else{
            mat[u][v] = 1;
            mat[v][u] = 1;
        }
    }
    public static void main(String[] args) {
        Implementation obj = new Implementation();
        int v= 4;
        int[][] mat = new int[v][v];

        obj.graphByMatrix(mat,0,2,false);
        obj.graphByMatrix(mat,0,3,false);
        obj.graphByMatrix(mat,1,2,false);
        obj.graphByMatrix(mat,1,4,false);
        obj.graphByMatrix(mat,2,3,false);
        obj.graphByMatrix(mat,3,4,false);


        for(int[] u : mat){
            System.out.println(Arrays.toString(u));
        }

    }
}

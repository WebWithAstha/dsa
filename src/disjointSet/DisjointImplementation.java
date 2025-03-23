package disjointSet;


class Disjoint{
    int[] rank, parent;

    Disjoint(int n){
        rank = new int[n+1]; // 1 indexed
        parent =  new int[n+1];
        for (int i = 0 ; i< n+1; i++) parent[i] = i;

    }
    void union(int u, int v){
        int ul_u = parent[u];
        int ul_v = parent[v];
        int rank_ul_u = rank[ul_u];
        int rank_ul_v = rank[ul_v];
        if(rank_ul_u > rank_ul_v){
            parent[ul_v] = ul_u;
        }else if( rank_ul_v > rank_ul_u){
            parent[ul_u] = ul_v;
        }else {
            parent[ul_v] = ul_u;
            rank[ul_u]++;
        }

    }

    int findParent(int u){
        if(parent[u]==u) return u;
        return parent[u]= findParent(parent[u]);
    }
}

public class DisjointImplementation {
    public static void main(String[] args) {
        Disjoint dj = new Disjoint(6);
        dj.union(1,2);
        dj.union(2,3);
        dj.union(4,5);
        System.out.println(dj.findParent(1) == dj.findParent(4) ? "1 and 4 belongs to same component.":"1 & 4 are from different component.");
        dj.union(5,6);
        dj.union(6,1);
        System.out.println(dj.findParent(1) == dj.findParent(4) ? "1 and 4 belongs to same component.":"1 & 4 are from different component.");
    }
}

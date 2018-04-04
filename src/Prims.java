import java.util.*;
public class Prims {
    static void prim(int a[][],int n){
    	int i,j = 0,ne,min,mincost=0,u=0,v=0;
    	int visit[]=new int[n];
    	for(i=0;i<n;i++){
    		visit[i]=0;
    		ne=1;
    		while(ne<n){
    			min =999;
    			for(i=0;i<n;i++){
    				if(visit[i]==1){
    	    			for(j=0;j<n;j++){
    	    			if(a[i][j]<min&&a[i][j]<min){
    	    				min=a[i][j];
    	    				u=i;
    	    				v=j;
    	    				
    	    			}
    					
    				}
    			}
    		}

        		if(visit[u]==1&&visit[u]==0){
        			visit[v]=1;
        			mincost=mincost+1;
        			ne++;
        			System.out.println("Edge is"+u+"Vertex is"+v);
        		}
    	}
    		a[u][v]=a[v][u]=999;
     }
    	
 }
	public static void main(String[] args) {
     
	}

}

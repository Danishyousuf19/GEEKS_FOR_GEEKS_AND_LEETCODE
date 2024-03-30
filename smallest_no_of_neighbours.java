import java.util.Arrays;

public class smallest_no_of_neighbours {
	int findCity(int n, int m, int[][] edges,int distanceThreshold)
    {
        //code here
        
        
        int adj[][] = new int[n][n] ;
        
        for( int i = 0 ; i < n ; i++ )
        {
            Arrays.fill( adj[i] , (int)10e9 ) ;
        }
        
      
      for( int i = 0 ; i < m ; i++ )
      {
          adj[edges[i][0]][edges[i][1]] = edges[i][2] ;
          adj[edges[i][1]][edges[i][0]] = edges[i][2] ;
      }
      
      for( int i = 0 ; i < n ; i++ )
      {
          adj[i][i] = 0 ;
      }
      
      
      
      for( int k = 0 ; k < n ; k++ )
      {
          for( int i = 0 ; i < n ; i++ )
          {
              for( int j = 0 ; j < n ; j++ )
              {
                  if( adj[i][k] == (int)10e9 || adj[k][j] == (int)10e9 ) continue ;
                  
                  adj[i][j] = Math.min( adj[i][j] , adj[i][k] + adj[k][j] ) ;
              }
          }
      }
      
      int ans = 0 ;
      
      int mincnt =  (int)10e9 ;
      
      for( int i = 0 ; i < n ; i++ )
      {
          int cnt = 0 ;
          
          for( int j = 0 ; j < n ; j++ )
          {
              if( adj[i][j] <= distanceThreshold)
              {
                  cnt++ ;
              }
          }
          
          if( cnt <= mincnt )
          {
              ans = i ;
              mincnt = cnt ;
          }
      }
      
      return ans ;
    }
}

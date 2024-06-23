class Solution
{
   long floorSqrt(long x)
	 {
		long start=1;
		long mid=0;
		long end=x;
		long floorValue=0;
		while(start<=end){
		    mid=start+(end-start)/2;
		    if(mid*mid==x){
		        return mid;
		    }
		    else if(mid*mid<x){
		      floorValue=mid;
		      start=mid+1;  
		    }
		    else{
		      end=mid-1;  
		    }
		    
		}
		return floorValue;
	 }
}

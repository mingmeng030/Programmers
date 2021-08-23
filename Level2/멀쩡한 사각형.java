class Solution {
    public long gcd(long w, long h){
        long small,big ;

		big = w >= h ? w : h ;
		small = w < h ? w : h ;

		while ( small != 0 ) {
			long nmg = big % small ;
			big = small;
			small = nmg;
		}
		return big;
    }
	public long solution(int w,int h) {
		long answer;
        
        long wl = Long.parseLong(String.valueOf(w));
		long hl = Long.parseLong(String.valueOf(h));
        long gcd=gcd(wl,hl);
        answer=(wl*hl)-(wl+hl-gcd);
		return answer;
	}
}
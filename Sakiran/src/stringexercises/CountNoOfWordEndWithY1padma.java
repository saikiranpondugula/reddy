package stringexercises;

public class CountNoOfWordEndWithY1padma {
static int countXZ(String res) {
	
	res = res.toLowerCase();
	int count = 0;

	for (int i = 0; i < res.length(); i++) {
		if(res.charAt(i) == 'y' || res.charAt(i) == 'z') {
			if(i < res.length() - 1 && ! Character.isLetter(res.charAt(i + 1))) {
				count ++;
			}
			else if(i == res.length() - 1) {
				count ++;
			}
		}
	}
	return count;
}

public static void main(String[] args) {
	//System.out.println(countXZ("fez day"));
	//System.out.println(countXZ("day fez"));
System.out.println(countXZ("day fyyyz"));
}
}

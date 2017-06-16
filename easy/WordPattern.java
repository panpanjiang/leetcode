package easy;

import java.util.HashMap;

public class WordPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new WordPattern().wordPattern("aaaa", "dog cat cat dog"));
	}

	public boolean wordPattern(String pattern, String str) {
		String[] strArray=str.split(" ");
		if(pattern.length()!=strArray.length)
			return false;
		HashMap<String,String> pMap=new HashMap<String,String>();
		HashMap<String,String> sMap=new HashMap<String,String>();
		for(int i=0;i<strArray.length;i++){
			String ptemp=pattern.charAt(i)+"";
			String stemp=strArray[i];
			if(!pMap.containsKey(ptemp)&&!sMap.containsKey(stemp)){
				pMap.put(ptemp, stemp);
				sMap.put(stemp, ptemp);
			}else if(pMap.containsKey(ptemp)&&sMap.containsKey(stemp)){
				if(!pMap.get(ptemp).equals(stemp)||!sMap.get(stemp).equals(ptemp))
					return false;
			}else
				return false;
		}
		return true;
    }
}

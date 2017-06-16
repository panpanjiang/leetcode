package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IsomorphicStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new IsomorphicStrings().isIsomorphic("paper",
				"title"));
	}
	
	public boolean isIsomorphic(String s, String t) {		
		if(s.equals(t))
			return true;
		HashMap sMap=new HashMap();
		HashMap tMap=new HashMap();
		for(int i=0;i<s.length();i++){
			char stemp=s.charAt(i);
			char Ttemp=t.charAt(i);
			if(!sMap.containsKey(stemp)&&!tMap.containsKey(Ttemp)){
				sMap.put(stemp, Ttemp);
				tMap.put(Ttemp, stemp);
			}else if(sMap.containsKey(stemp)&&tMap.containsKey(Ttemp)){				
				if((char)sMap.get(stemp)!=Ttemp||(char)tMap.get(Ttemp)!=stemp)
					return false;
			}else
				return false;
		}
		return true;
    }

}

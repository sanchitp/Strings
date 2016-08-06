import java.util.*;

class FirstRepeatingChar{

	public static void main(String args[]){

		//input string in str

		String str = "abcdefghba";     

		// output should be 'a' as it is the first repeating and not b

		firstRepeatingMethod(str);
	}

	// this function prints the first repeating character and its index
	public static void firstRepeatingMethod(String str){

		int minindex = -1;
		char firstrepeatingchar='\0';

		HashMap<Character,Integer> hashmap = new HashMap<Character,Integer>();
		int length = str.length();

		for(int i=0;i<length;i++){

			char ch = str.charAt(i);

			if(hashmap.containsKey(ch)){

				int val = hashmap.get(ch);

				if(minindex==-1){
					minindex = val;
					firstrepeatingchar = ch;
				}

				else if(val<minindex){
					minindex = val;
					firstrepeatingchar = ch;
				}

			}

			else{
				hashmap.put(ch,i);
			}
		}

		System.out.println("Minindex : "+ minindex);
		System.out.println("Character : " + firstrepeatingchar);

	}
}


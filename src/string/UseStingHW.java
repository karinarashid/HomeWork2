package string;


public class UseStingHW {

	public static void main(String[] args) {
		
		String st = "I like to my new computer";
		String st1 = "I dont like my old computer";
		
		System.out.println(st.toUpperCase());
		System.out.println(st.toLowerCase());
		System.out.println(st.length());
		System.out.println(st.codePointAt(1));
		System.out.println(st.replace("I", "i"));
		
		System.out.println(st.subSequence(1, 5));
		System.out.println(st.concat(" " + st1));
		System.out.println(st.compareToIgnoreCase(st1));
		System.out.println(st.toString());
		System.out.println(st.isEmpty());
		
		System.out.println(st1.isEmpty());
		System.out.println(st1.hashCode());
		System.out.println(st1.indexOf(st));
		System.out.println(st1.replace(st, st1));
		System.out.println(st1.contentEquals(st1));
		
		System.out.println(st.contains(st));
		System.out.println(st.contentEquals(st1));
		System.out.println(st.contentEquals(st1));
		System.out.println(st.length());
		System.out.println(st.charAt(0));
		
		System.out.println(st.contentEquals(st1));
		System.out.println(st.equalsIgnoreCase(st1));
		System.out.println(st.replace(st, st1));
		System.out.println(st.trim());
		System.out.println(st.startsWith(st1));
		
		System.out.println(st.codePointBefore(1));
		System.out.println(st.intern());
		System.out.println(st.matches(st1));
		System.out.println(st.getBytes());
		System.out.println(st1.getBytes());
		
	
	}
}

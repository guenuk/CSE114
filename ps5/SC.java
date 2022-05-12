//Geunuk Na, Geunuk@stonybrook.edu
public class SC{
    public static void main(String[]args){
	String doc = DictDoc.doc;
	String lowerdoc = doc.toLowerCase();
	String [] dict = DictDoc.dict;
	spellcheck(lowerdoc, dict);
    }
    public static void spellcheck(String lowerdoc, String[] dict){
	String [] splitDoc  = lowerdoc.split("[ .,!;:]+");
	System.out.println("Mis-spelled words:");
	for (int i=0;i<splitDoc.length; i++){
	    boolean bad = true;
	    for (int j=0;j<dict.length; j++){ 
		if (splitDoc[i].equals(dict[j])){
		    bad = false;
		    break;
		}
	    }
	    if (bad)
		System.out.println("\t" + splitDoc[i]);
	}
    }
}

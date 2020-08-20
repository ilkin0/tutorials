package s;

public class Kitab {

    private String ad;
    private String muellif;
    private String metn;

    //constructors, getters and setters

    public String replaceWordInText(String word) {
        return metn.replaceAll(word, metn);
    }

    public boolean isWordInText(String word) {
        return metn.contains(word);
    }

}

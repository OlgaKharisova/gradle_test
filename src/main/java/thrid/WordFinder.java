package thrid;

import java.net.URL;
import java.util.HashSet;
import java.util.Set;

public interface WordFinder {

    Set<String> getSentences(URL resource);
    boolean checkIfWordInSentance (String sentence, String word);

    void writeSentenceToResult (String sentence);
}

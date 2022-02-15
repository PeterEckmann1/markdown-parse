// File reading code from https://howtodoinjava.com/java/io/java-read-file-to-string-examples/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParse {
    public static ArrayList<String> getLinks(String markdown) {
        ArrayList<String> toReturn = new ArrayList<>();
        int currentIndex = 0;
        while(currentIndex < markdown.length()) {
            int nextOpenBracket = markdown.indexOf("[", currentIndex);
            int nextCloseBracket = markdown.indexOf("]", nextOpenBracket);

            if (nextOpenBracket == -1 || nextCloseBracket == -1) {
                break;
            }

            if (nextOpenBracket > 0 && markdown.charAt(nextOpenBracket - 1) == '!') {
                currentIndex = nextOpenBracket + 1;
                continue;
            }

            int markdownCheck = nextCloseBracket + 1;

            if (markdownCheck < markdown.length() && markdown.charAt(markdownCheck) == '(') {
                int openParen = markdown.indexOf("(", markdownCheck);
                int closeParen = markdown.indexOf(")", openParen);
                if (openParen == -1 || closeParen == -1) {
                    break;
                }
                String toAdd = markdown.substring(openParen + 1, closeParen);
                if (!toAdd.contains(" ")) {
                    toReturn.add(toAdd);
                    currentIndex = closeParen + 1;
                } else {
                    currentIndex = openParen + 1;
                }
            }
            else {
                currentIndex = markdownCheck;
            }
        }
        return toReturn;
    }
    public static void main(String[] args) throws IOException {
		Path fileName = Path.of(args[0]);
	    String contents = Files.readString(fileName);
        ArrayList<String> links = getLinks(contents);
        System.out.println(links);
    }
}

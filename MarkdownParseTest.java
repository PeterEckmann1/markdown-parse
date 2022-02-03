import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MarkdownParseTest{
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testGetLinks() throws IOException{
        Path fileName = Path.of("test-file.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
    
        List<String> expectedOutput = List.of("https://something.com", "some-page.html");

        assertEquals(expectedOutput, links);
    }

    @Test
    public void testGetLinksTwo() throws IOException{
        Path fileName = Path.of("test-file-two.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
    
        List<String> expectedOutput = List.of("https://something.com", "some-page.html");

        assertEquals(expectedOutput, links);
    }

    @Test
    public void testGetLinksThree() throws IOException{
        Path fileName = Path.of("test-file-three.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
    
        List<String> expectedOutput = List.of("https://something.com");

        assertEquals(expectedOutput, links);
    }

    @Test
    public void testGetLinksFour() throws IOException{
        Path fileName = Path.of("test-file-four.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
    
        List<String> expectedOutput = List.of("https://something.com", "some-page.html");

        assertEquals(expectedOutput, links);
    }
    @Test
    public void testGetLinksseven() throws IOException{
        Path fileName = Path.of("test-file7.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
    
        List<String> expectedOutput = List.of();

        assertEquals(expectedOutput, links);
    }
    @Test
    public void testGetLinkseight() throws IOException{
        Path fileName = Path.of("test-file8.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
    
        List<String> expectedOutput = List.of("a link on the first line");

        assertEquals(expectedOutput, links);
    }
    @Test
    public void testGetLinkssix() throws IOException{
        Path fileName = Path.of("test-file6.md");
        String contents = Files.readString(fileName);
       
        ArrayList<String> links = MarkdownParse.getLinks(contents);
    
        List<String> expectedOutput = List.of();

        assertEquals(expectedOutput, links);
    }
    @Test
    public void testGetLinksfive() throws IOException{
        Path fileName = Path.of("test-file5.md");
        String contents = Files.readString(fileName);
       
        ArrayList<String> links = MarkdownParse.getLinks(contents);
    
        List<String> expectedOutput = List.of();

        assertEquals(expectedOutput, links);
    }
    @Test
    public void testGetLinksfour() throws IOException{
        Path fileName = Path.of("test-file4.md");
        String contents = Files.readString(fileName);
       
        ArrayList<String> links = MarkdownParse.getLinks(contents);
    
        List<String> expectedOutput = List.of();

        assertEquals(expectedOutput, links);
    }
    @Test
    public void testGetLinksthree() throws IOException{
        Path fileName = Path.of("test-file3.md");
        String contents = Files.readString(fileName);
       
        ArrayList<String> links = MarkdownParse.getLinks(contents);
    
        List<String> expectedOutput = List.of();

        assertEquals(expectedOutput, links);
    }
    @Test
    public void testGetLinkstwo() throws IOException{
        Path fileName = Path.of("test-file2.md");
        String contents = Files.readString(fileName);
       
        ArrayList<String> links = MarkdownParse.getLinks(contents);
    
        List<String> expectedOutput = List.of("https://something.com","some-page.html");

        assertEquals(expectedOutput, links);
    }
    @Test
    public void testGetLinksa() throws IOException{
        Path fileName = Path.of("test-file1.md");
        String contents = Files.readString(fileName);
       
        ArrayList<String> links = MarkdownParse.getLinks(contents);
    
        List<String> expectedOutput = List.of();

        assertEquals(expectedOutput, links);
    }
    @Test
    public void failTest() {
        assertEquals(true, false);
    }
}
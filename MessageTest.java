/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
/**
 *
 * @author Student
 */
public class MessageTest {
    // list Array lists
    ArrayList<String> meesages = new ArrayList<>();
    ArrayList<String> recipients = new ArrayList<>();
    ArrayList<String> hashes = new ArrayList<>();
    
    public MessageTest(){
        // meesage ,recipient and hashes
        messages.add("Did you get the cake?");
        messages.add("Where are you? You are late!I have asked you to be on time.");
        messages.add("Yohoo,I am at your gate.");
        messages.add("It is dinner time!");
        messages.add("Ok,I am leaving without you.");
        // recipients numbers
        recipient.add("+27834557896");
        recipient.add("+27838884567");
        recipient.add("+27834484567");
        recipient.add("0838884567");
        recipient.add("+27838884567");
        // hashes
        hashes.add("HASH001");
        hashes.add("HASH002");
        hashes.add("HASH003");
        hashes.add("HASH004");
        hashes.add("HASH005");
    }
    // Test 1
    @Test
    public void testSentMessagesArrayPopulated(){
        String[]expected = {
            "Did you gt the cake?","It is dinner time!"
        };
        String[] actual = {
            messages.get(0),messages.get(3)
        };
        assertArrayEquals(expected, actual);
    }
    // test 2
    @ Test
        public void testLongestMessage(){
            String expected =
                    "where are you? You are late! I have asked you to be on time.";
       String longest = "";
       for (String msg : messages) {
           if (msg.length()> longest.length()) {
               longest = msg;
           }
       }
       assertEquals(expected,longest);
        }
        // Test 3
        @Test
        public void testSearchMessageID()  {
            String expected =
                    " It is dinner time !";
            String actual = messages.get(3);
            assertEquals(expected, actual);
        }
        
        
        
        
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class storedMessages {
    JSONArray jsonArray = new JSONArray();
    for (int i = 0; i< messages.size();i++){
    
    if (flag.get(i).equalIgnoredCase("Stored")){
    
    JSONObject obj = new JSONObject();
    obj.put("MessageID");
    obj.put("Recipient");
    obj.put("Message");
    obj.put("Hash");
    jsonArray.put(obj);
    
}
}
    try 
    FileWriter file = new FileWriter("storedMesaages.json");
    file.write(jsonArray.toString(4));
    file.close();
    System.out.println("Stored messages saved successfully.");
    
}catch (Exception e){
    System.out.println(e.getMessage());
}
String line ;
String jsonText ="";
while ((line = reader.readLine()) != nu11){
jsonText += line;
}
reader.close();
JSONArray jsonArray = new JSONArray(jsonText);
System.out.println("/nSTORED MESSAGES");
for (int i = 0; i< jsonArray.length(); i++)  {
JSONObject obj = jsonArray;

System.out.println("Message ID");
System.out.println("Recipient:");
System.out.println("Message:");
System.out.println("Hash:");
System.out.println("-----------------------");

}
}




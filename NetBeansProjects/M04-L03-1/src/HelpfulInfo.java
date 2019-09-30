/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xyq
 */
public class HelpfulInfo {
    public String User;
    public String Message;
    
    public HelpfulInfo(String newUser, String newMessage)
    {
        User = newUser;
        Message = newMessage;
    }
    
    public String sendHelpfulInfo (String probability)
    {
        String info = "";
       String mildMessage = "There is a 30% chance of getting a fire in the area";
       String intermediateMessage = "There is a 50% chance of getting a fire in the area";
       String seriousMessage = "There is a 80% chance of getting a fire in thea area";
       
        
     if(probability == "MildProbility")
    {
       info = mildMessage;
    }
     else if (probability == "IntermediateProbability ")
     {
         info = intermediateMessage;
     }
    else
     {
         info = seriousMessage;
     }
    
    return info;
 }
    
//    public int rankHelpfulInfo (int percentage)
//    {
//       int rank = 0;
//       
//       if (percentage > 0  30)
//       {
//           
//       }
//           
//    }

    /**
     * @return the User
     */
    public String getUser() {
        return User;
    }

    /**
     * @param User the User to set
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * @return the Message
     */
    public String getMessage() {
        return Message;
    }

    /**
     * @param Message the Message to set
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }
    
    
}

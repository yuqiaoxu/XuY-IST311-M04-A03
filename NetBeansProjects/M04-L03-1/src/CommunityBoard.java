/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xyq
 */
public class CommunityBoard {
   public  String author;
   public String message;
   public double timestamps;
   public String status;
   
   public CommunityBoard (String newAuthor, String newMessage, double newTimestamps, String newStatus)
   {
       author =newAuthor;
       message =newMessage;
       timestamps = newTimestamps;
       status =newStatus;  
   }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return the timestamps
     */
    public double getTimestamps() {
        return timestamps;
    }

    /**
     * @param timestamps the timestamps to set
     */
    public void setTimestamps(double timestamps) {
        this.timestamps = timestamps;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
   
   
}

package DiffieHellman;

import java.io.IOException;

public abstract class host 
{
  /**
    *Sends a message from one host to the other. 
    */
  void sendMessage(String message) throws IOException;
  
  /**
    *Reads a message from the other host. 
    */
  String readMessage() throws IOException;
  
  /**
    *Run the client or server.
    */
  void run() throws IOException;
}

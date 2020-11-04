package client;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client 
{
	private String userName;
    private String serverHost;
    private int serverPort;
	
	private Client(String userName, String host, int portNumber){
        this.userName = userName;
        this.serverHost = host;
        this.serverPort = portNumber;
    }
	
	private void startClient(Scanner scan)
	{
        try
        {
            Socket socket = new Socket(serverHost, serverPort);
            //to be written
        }
        catch(IOException ex)
        {
            System.err.println("Fatal Connection error!");
            ex.printStackTrace();
        }
    }
}
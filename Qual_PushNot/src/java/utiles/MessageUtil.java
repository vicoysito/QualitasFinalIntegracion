package utiles;

import com.google.android.gcm.server.Message;
import com.google.android.gcm.server.MulticastResult;
import com.google.android.gcm.server.Result;
import com.google.android.gcm.server.Sender;
import java.util.ArrayList;
import java.io.IOException;
import java.util.List;

    
    
    
    
 
public class MessageUtil {
    
    // private final static StringBuilder GOOGLEKEY = new StringBuilder("AIzaSyDXGcULzW0I5TNF1VzgicT7tlng6N0T7Vw");
   // SAMBORNS
    private final static String GOOGLEKEY = "AIzaSyBwlGsBNgcL8ffjoYWTsAuBAvqFp8-lyV8";
    
    
    
    public static String sendMsj(List<String> registrationIDs, String mensaje) throws IOException
    	{
            
            Message msj = new Message.Builder().build();
           //public Result send(Message message, String registrationId, int retries)

            
            //String regId = "APA91bFbFV8V9sU7nCNyDvI2fKRFD4xa2eoPk8-gOs5m7BzCgnQ7nFxOTagAclf5R_ExNsE9uegmdIDzoDnsZqTy5dnIrn2RgT_dTBy6v5uqntWMLvclFwbTQ07qdTJPqZtrKEEPNK6swsNfLPmCtvkXPmZCeVnniQ";
            
            
            Sender s = new Sender(GOOGLEKEY);
            
            
            MulticastResult r = s.send(msj,registrationIDs,1);
            
            System.out.println("Resultado::"+ r.toString());
            
            return null;
            
            
    	
      }
    }

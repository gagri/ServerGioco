import java.io.File;
import java.io.FileOutputStream;

import static javax.swing.text.html.CSS.getAttribute;

import org.restlet.representation.Representation;
import org.restlet.resource.Post;
import org.restlet.resource.ResourceException;
import org.restlet.resource.ServerResource;

public class AudioResource extends ServerResource {
	
	 @Post
	    public String upload(Representation entity) throws ResourceException {
	        try {
	            entity.write(new FileOutputStream(new File(System.getProperty("user.dir")+"/audio/"+getAttribute("fname"))));
	        } catch (Exception e) {
	            throw new ResourceException(e);
	        }
	        return "ok";
	    }

}

package rls4eclipse.ui.handlers;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;

public class runJar extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// TODO Auto-generated method stub
		String userDirectory = Paths.get("").toAbsolutePath().toString();
		System.out.println(userDirectory);
		 try {
			Process proc = Runtime.getRuntime().exec("java -jar /rls4eclipse.ui/icons/rulewerk.jar");
			proc.waitFor();
		    // Then retreive the process output
		    InputStream in = proc.getInputStream();
		    InputStream err = proc.getErrorStream();

		    byte b[]=new byte[in.available()];
		    in.read(b,0,b.length);
		    System.out.println(new String(b));

		    byte c[]=new byte[err.available()];
		    err.read(c,0,c.length);
		    System.out.println(new String(c));
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}




}

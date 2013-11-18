package uk.rob_bolton.rob.gifhack.viewer;
import javax.swing.*;

import uk.rob_bolton.rob.gifhack.controller.*;
import uk.rob_bolton.rob.gifhack.model.*;

/**
 * This class extends the {@link JFrame} class and is used to create
 * the graphical window for Gifhack. This must be given a {@link GifhackModel}
 * and a {@link GifhackController} as arguments.
 * 
 * A frame will be created and UI elements added allowing the user to click
 * buttons to set the image, payload, and loader used. It also allows the
 * user to export the image.
 * 
 * @author rob bolton
 *
 */
public class GifhackFrame extends JFrame
{

	/**
	 * This is the class's version number used for if it is serialized.
	 * This is required as we extend the serializable JFrame.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This creates an instance of GifhackFrame.
	 * @param model The model to view
	 * @param controller The controller to interact with
	 */
	public GifhackFrame(GifhackModel model, GifhackController controller)
	{
		
	}

}

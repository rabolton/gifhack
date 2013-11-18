package uk.rob_bolton.rob.gifhack.controller;

import uk.rob_bolton.rob.gifhack.model.*;

/**
 * This class is used to control the {@link GifhackModel} class.
 * This is done to ensure the program follows a strict viewer/model/controller
 * development model.
 * This class allows you to load an image, payload, and loader into its model.
 * It requires a {@link GifhackModel} as an argument.
 * 
 * @author rob bolton
 *
 */
public class GifhackController {
	
	/**
	 * This is the model we will interact with.
	 */
	private GifhackModel model;
	
	/**
	 * This creates a GifhackController using the supplied model argument
	 * as the model to interact with.
	 * 
	 * @param model The model to operate on
	 */
	public GifhackController(GifhackModel model)
	{
		this.model = model;
	}
	
	/**
	 * This will attempt to load the .gif image "file" from disk and
	 * set the current model's image to the raw data of it.
	 * 
	 * @param file The path to a file containing a valid .gif image
	 */
	public void loadImage(String file)
	{
		
	}
	
	/**
	 * This attempts to load a payload from a file on disk to be used by the
	 * loader script. It's up to the user to ensure their payload and loader play nicely.
	 * 
	 * @param file The path to a file containing a payload to be used by the loader.
	 */
	public void loadPayload(String file)
	{
		
	}
	
	/**
	 * This attempts to load a loader from a file on disk to be inserted into
	 * a colour table in the .gif.
	 * 
	 * @param file The path to a file containing a loader to be inserted into a colour table in the .gif.
	 */
	public void loadLoader(String file)
	{
	
	}
	
	/**
	 * This attempts to call the model's compileGif() method and writes
	 * the returned data to the file at the path specified by the argument given.
	 * @param file The path to the file we will write the final .gif to.
	 */
	public void compileAndExportGif(String file)
	{
		
	}
}

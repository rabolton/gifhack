package uk.rob_bolton.rob.gifhack.model;

/**
 * This class is used to combine the image, payload, and loaders into a
 * single .gif image.
 * 
 * @author rob bolton
 *
 */
public class GifhackModel
{
	/**
	 * This is an array of bytes containing the .gif image's raw contents.
	 */
	private byte[] image;
	
	/**
	 * This String is used to store the payload script. 
	 */
	private String payload;
	
	/**
	 * This String is used to store the loader script. 
	 */
	private String loader;
	
	/**
	 * This method creats an instance of the GifhackModel 
	 */
	public GifhackModel()
	{
		
	}
	
	/**
	 * This sets the image data for use in creating the .gif. This should be
	 * an array of bytes representing the raw data of a .gif image.
	 * 
	 * @param image An array of bytes representing the image's raw data
	 */
	public void setImage(byte[] image)
	{
		this.image = image;
	}
	
	/**
	 * This sets the payload script data. Make sure that your loader and payload work together.
	 * It's no use deploying a javascript payload with a loader designed to
	 * create the payload as a perl script.
	 * 
	 * @param payload A string containing a script which is to be used by the loader.
	 */
	public void setPayload(String payload)
	{
		this.payload = payload;
	}
	
	/**
	 * This sets the loader script data. This will sit in a colour table. This means
	 * it must be at or under 765 bytes.
	 * 
	 * @param loader A string containing a script which will retrieve the payload from the file and create/run it.
	 */
	public void setLoader(String loader)
	{
		this.loader = loader;
	}
	
	/**
	 * This is used to retrieve the image's raw data as an array of bytes.
	 * 
	 * @return This returns an array of the image's raw data as an array of bytes.
	 */
	public byte[] getImage()
	{
		return image.clone();
	}
	
	/**
	 * This is used to retrieve the current payload as a string.
	 * 
	 * @return This returns a string containing the current payload.
	 */
	public String getPayload()
	{
		return payload;
	}
	
	/**
	 * This is used to retrieve the current loader as a string.
	 * 
	 * @return This returns a string containing the current loader.
	 */
	public String getLoader()
	{
		return loader;
	}
	
	/**
	 * This is used to retrieve the final image with the loader/ payload in it.
	 * 
	 * @return This returns an array of bytes representing the complete gif image ready to be written to disk.
	 */
	public byte[] compileGif()
	{
		byte[] moddedImage = image.clone();
		//TODO: Insert code here to compile the modified image.
		
		return moddedImage;
	}
}

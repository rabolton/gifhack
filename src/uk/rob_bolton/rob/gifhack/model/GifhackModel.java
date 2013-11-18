package uk.rob_bolton.rob.gifhack.model;

public class GifhackModel
{
	private byte[] image;
	private String payload;
	private String loader;
	
	public GifhackModel()
	{
		
	}
	
	public void setImage(byte[] image)
	{
		this.image = image;
	}
	
	public void setPayload(String payload)
	{
		this.payload = payload;
	}
	
	public void setLoader(String loader)
	{
		this.loader = loader;
	}
	
	public byte[] getImage()
	{
		return image.clone();
	}
	
	public String getPayload()
	{
		return payload;
	}
	
	public String getLoader()
	{
		return loader;
	}
	
	public byte[] compileGif()
	{
		byte[] moddedImage = image.clone();
		return moddedImage;
	}
}

package uk.rob_bolton.rob.gifhack;

import uk.rob_bolton.rob.gifhack.viewer.*;
import uk.rob_bolton.rob.gifhack.model.*;
import uk.rob_bolton.rob.gifhack.controller.*;

public class main {

	public static void main(String[] args) {
		GifhackModel model = new GifhackModel();
		GifhackController controller = new GifhackController(model);
		
		boolean hasGui = true;
		String imagePath = "", payloadPath = "", loaderPath = "", outputPath = "";
		int setMode=0;
		/*
		 * setMode is used to determine the flag for the next argument
		 * 0 - we have no flag
		 * 1 - we are setting the image path
		 * 2 - we are setting the payload path
		 * 3 - we are setting the loader path
		 * 4 - we are setting the output path (default for 0)
		 */
		
		for(String arg : args)
		{
			if(arg == "-c" || arg == "--cli")
			{
				hasGui = false;
			}
			if(arg == "-i" || arg == "--input")
			{
				setMode = 1;
			}
			else if(arg == "-p" || arg == "--payload")
			{
				setMode = 2;
			}
			else if(arg == "-l" || arg == "--loader")
			{
				setMode = 3;
			}
			else if(arg == "-o" || arg == "--output")
			{
				setMode = 4;
			}
			else
			{
				switch(setMode)
				{
					case 1:		imagePath = arg;
					break;
					case 2:		payloadPath = arg;
					break;
					case 3:		loaderPath = arg;
					break;
					case 4:		outputPath = arg;
					break;
					default:
						if(outputPath!="")
						{
							System.err.println("Output path already set, extra argument detected.");
						}
						else if(arg.charAt(0) == '-')
						{
							System.err.println("Unknown flag \"" + arg + "\"");
						}
						else
						{
							outputPath = arg;
						}
						break;
				}
			}
		}
		if(hasGui)
		{
			//TODO - add code to create frame and set values from files
		}
		else
		{
			//TODO - add code to check files are correct and write to output
		}
		
	}

}

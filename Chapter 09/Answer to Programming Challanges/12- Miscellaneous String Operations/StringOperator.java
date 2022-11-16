public class StringOperator
{
	public static void main(String[] args)
	{
		System.out.println(REPLACESUBSTRING("the dog the cat the rat the", "the","is"));
	}
	public static int WORDCOUNT(String theLine)
	{
		String[] wordList = theLine.split(" ");
		int counter = 0;
		for (String val:wordList)
		counter++;
		return counter;
	}

	public static String ARRAYTOSTRING(char[] theArray)
	{
		String theString = theArray.toString();
		return theString;
	}

	public static char MOSTFREQUENT(String theWord)
	{
		char[] charsArray = theWord.toCharArray();
		int[] repArray = new int[charsArray.length];
		for (int i = 0; i < charsArray.length; i++)
		{
			int repcounter=0 ;
			for (int j = 0; j<charsArray.length;j++)
			{
				if (charsArray[j] == charsArray[i])
				repcounter++;
			}	
			repArray[i] = repcounter;
		}
		int maximum = repArray[0];
		int maxIndex = 0;
		int m ;
		for(m = 0; m < repArray.length;m++)
		{
			if (repArray[m] > maximum)
			maxIndex = m;
		}
		return charsArray[maxIndex];
	}

	public static String REPLACESUBSTRING(String String1,String String2,String String3)
	{
		
		String checkedString = String1;
		StringBuilder  builderString = new StringBuilder(String1);
		int position = checkedString.indexOf(String2,0);
		
		while(position != -1)
		{
			builderString.replace(position, position+String2.length(), String3);
			checkedString = builderString.toString();
			position = checkedString.indexOf(String2, position + 1);
		}
		return builderString.toString();
	}

}
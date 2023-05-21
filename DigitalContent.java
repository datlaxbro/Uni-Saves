package p2_assessment_2;

public class DigitalContent
{
	//-------------------------------------------------\\
	
	//creating a Abstract
	public abstract class digitalContent implements Comparable<digitalContent>
	{
		public String title;
		public String publisher;
		public String releaseDate;
		
		public String getTitle()
		{
			return title;
		}
		
		public void setTitle(String title)
		{
			this.title = title;
		}
		
		public String getPublisher()
		{
			return publisher;
		}
		
		public void setPublisher(String publisher)
		{
			this.publisher = publisher;
		}
		
		public String getReleaseDate()
		{
			return releaseDate;
		}
		
		public void setReleaseDate(String releaseDate)
		{
			this.releaseDate = releaseDate;
		}

		@Override
		public String toString()
		{
			return "digitalContent [title=" + title + ", publisher=" + publisher + ", releaseDate=" + releaseDate + "]";
		}
		
		
	}
	
	//-------------------------------------------------\\
	
	public static void main(String[] args)
	{
		
	}

}

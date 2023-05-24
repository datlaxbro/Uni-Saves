package p2_assessment_2;

abstract class digitalContent implements Comparable<digitalContent>
{
	//-------------------------------------------------\\
	
	//creating a Abstract
	
		private String title;
		private String publisher;
		private String releaseDate;
		
		
		public digitalContent(String title, String publisher, String releaseDate)
		{
			setTitle(title);
			setPublisher(publisher);
			setReleaseDate(releaseDate);
		}

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
		public int compareTo(digitalContent g)
		{
			return this.title.compareTo(g.title);
		}
		
		@Override
		public String toString()
		{
			return "digitalContent [title=" + title + ", publisher=" + publisher + ", releaseDate=" + releaseDate + "]";
		}
		
		
	
	
	//-------------------------------------------------\\
	
	public static void main(String[] args)
	{
		
	}

}

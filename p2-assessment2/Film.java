package p2_assessment_2;

public class Film extends digitalContent
{
	private String castMembers;
	
	//-------------------------------------------------\\
	
	public String getCastMembers()
	{
		return castMembers;
	}

	public void setCastMembers(String castMembers)
	{
		this.castMembers = castMembers;
	}
	
	public Film(String title, String publisher, String releaseDate, String castMembers)
	{
		super(title, publisher, releaseDate);
		setCastMembers(castMembers);
	}

	@Override
	public String toString() 
	{
		return "Film [" + (castMembers != null ? "castMembers=" + castMembers : "") + "]";
	}
	
	
	//-------------------------------------------------\\
	
	public static void main(String[] args)
	{
		
	}

}

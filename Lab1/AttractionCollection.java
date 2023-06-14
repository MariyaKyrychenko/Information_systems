public interface AttractionCollection {

	public void addAttraction(Attraction attraction);
	
	public void removeAttraction(Attraction attraction);
	
	public AttractionIterator iterator(TravelTypeEnum type);
	
}
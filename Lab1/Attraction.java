public class Attraction {

	private double latitude;
	private double longitude;
	private TravelTypeEnum TYPE;
	
	public Attraction(double lat, double longit, TravelTypeEnum type){
		this.latitude = lat;
		this.longitude = longit;
		this.TYPE = type;
	}

	public double getLatitude() {
		return latitude;
	}
	
  public double getLongitude() {
		return longitude;
	}

	public TravelTypeEnum getTYPE() {
		return TYPE;
	}
	
	@Override
	public String toString(){
		return "Latitude =" + this.latitude +", Longitude =" + this.longitude +", Type =" + this.TYPE;
	}
	
}
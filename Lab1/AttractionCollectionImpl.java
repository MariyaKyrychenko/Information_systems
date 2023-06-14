import java.util.ArrayList;
import java.util.List;

public class AttractionCollectionImpl implements AttractionCollection {

	private List<Attraction> attractionsList;

	public AttractionCollectionImpl() {
		attractionsList = new ArrayList<>();
	}

	public void addAttraction(Attraction attraction) {
		this.attractionsList.add(attraction);
	}

	public void removeAttraction(Attraction attraction) {
		this.attractionsList.remove(attraction);
	}

	@Override
	public AttractionIterator iterator(TravelTypeEnum type) {
		return new AttractionIteratorImpl(type, this.attractionsList);
	}

	private class AttractionIteratorImpl implements AttractionIterator {

		private TravelTypeEnum type;
		private List<Attraction> attractions;
		private int position;

		public AttractionIteratorImpl(TravelTypeEnum ty, List<Attraction> attractionsList) {
			this.type = ty;
			this.attractions = attractionsList;
		}

		@Override
		public boolean hasNext() {
			while (position < attractions.size()) {
				Attraction attraction = attractions.get(position);
				if (attraction.getTYPE().equals(type) || type.equals(TravelTypeEnum.ALL)) {
					return true;
				} else
					position++;
			}
			return false;
		}

		@Override
		public Attraction next() {
			Attraction attraction = attractions.get(position);
			position++;
			return attraction;
		}

	}
}
public class IteratorPatternTest {

	public static void main(String[] args) {
		AttractionCollection attractions = populateAttractions();
		AttractionIterator baseIterator = attractions.iterator(TravelTypeEnum.ALL);
		while (baseIterator.hasNext()) {
			Attraction attraction = baseIterator.next();
			System.out.println(attraction.toString());
		}
		System.out.println("******");

		// Вывод достопримечательностей для итератора по "Свой Выбор"
		AttractionIterator yourChoiceIterator = attractions.iterator(TravelTypeEnum.YOUR_CHOICE);
		while (yourChoiceIterator.hasNext()) {
			Attraction attraction = yourChoiceIterator.next();
			System.out.println(attraction.toString());
		}
	}

	private static AttractionCollection populateAttractions() {
		AttractionCollection attractions = new AttractionCollectionImpl();
		attractions.addAttraction(new Attraction(48.6845, 26.5856, TravelTypeEnum.YOUR_CHOICE));
		attractions.addAttraction(new Attraction(48.6845, 26.5856, TravelTypeEnum.NAVIGATOR_RECOMENDATION));
		attractions.addAttraction(new Attraction(48.6845, 26.5856, TravelTypeEnum.GIUDE_ASSISTANCE));
		attractions.addAttraction(new Attraction(49.83826, 24.02324, TravelTypeEnum.YOUR_CHOICE));
		attractions.addAttraction(new Attraction(49.83826, 24.02324, TravelTypeEnum.NAVIGATOR_RECOMENDATION));
		attractions.addAttraction(new Attraction(49.83826, 24.02324, TravelTypeEnum.GIUDE_ASSISTANCE));
		attractions.addAttraction(new Attraction(45.08985, 33.99887, TravelTypeEnum.YOUR_CHOICE));
		attractions.addAttraction(new Attraction(45.08985, 33.99887, TravelTypeEnum.NAVIGATOR_RECOMENDATION));
		attractions.addAttraction(new Attraction(45.08985, 33.99887, TravelTypeEnum.GIUDE_ASSISTANCE));
		return attractions;
	}

}
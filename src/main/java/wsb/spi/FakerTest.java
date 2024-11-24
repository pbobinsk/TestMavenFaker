package wsb.spi;
import net.datafaker.Faker;

public class FakerTest {


    public String getFakeData() {
        Faker faker = new Faker();

        String name = faker.name().fullName(); // Miss Samanta Schmidt
        String firstName = faker.name().firstName(); // Emory
        String lastName = faker.name().lastName(); // Barton

        String streetAddress = faker.address().streetAddress(); // 60018 Sawayn Brooks Suite 449

        return "Początek\n" +
                name + "\n" +
                firstName + "\n" +
                lastName + "\n" +
                streetAddress + "\n";
    }
}

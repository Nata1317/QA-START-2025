package stepdefinitions;
import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.prog.session9.PersonDto;
import org.prog.session9.ResultsDto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;


public class DatabaseSteps {
    private ResultsDto resultsDto;
    private ResultSet resultSet;

    @Given("database connection is established")

    public void
databaseConnectionIsEstablished(){
        System.out.println("Database connection established");
    }
    @When("I get {int} users from API")
    public void iGetUsersFromAPI(int amount){
        resultsDto = getUsers(amount);}

        private ResultsDto getUsers(int amount) {
            Response respones = RestAssured.given()
                    .baseUri("https://randomuser.me/")
                    .basePath("api/")
                    .queryParam("inc", "gender,name,nat,location")
                    .queryParam("results", amount)
                    .queryParam("noinfo")
                    .get();
            respones.prettyPrint();
            return respones.as(ResultsDto.class);
        }
        @When("I save users to database")
    public void isSaveUsersToDatabase()throws Exception {
            List<PersonDto> personDtos = resultsDto.getResults();
            PreparedStatement preparedStatement = Hooks.connection.prepareStatement(
                    "INSERT INTO Persons(FirstName, LastName, Gender, Title, Nat, City, Street, HouseNumber)" +
                            "VALUES (?,?,?,?,?,?,?,?)");
            personDtos.forEach(dto -> executeStatement(dto, preparedStatement));}

            private void executeStatement (PersonDto dto, PreparedStatement preparedStatement) {
                try {
                    preparedStatement.setString(1, dto.getName().getFirst());
                    preparedStatement.setString(2, dto.getName().getLast());
                    preparedStatement.setString(3, dto.getGender());
                    preparedStatement.setString(4, dto.getName().getTitle());
                    preparedStatement.setString(5, dto.getNat());
                    preparedStatement.setString(6, dto.getLocation().getCity());
                    preparedStatement.setString(7, dto.getLocation().getStreet().
                            getName());
                    preparedStatement.setString(8, String.valueOf(dto.getLocation().getStreet().getNumber()));

                    preparedStatement.execute();
                } catch (Exception e) {
                    System.out.println("Error inserting person: " + dto);
                }
            }
                @When("I read users from database")
                        public void iReadUsersFromDatabase() throws Exception{
                    Statement statement = Hooks.connection.createStatement();
                    resultSet = statement.executeQuery("SELECT * FROM Persons");
                }
                @Then("all users are printed")
                        public void allUsersArePrinted() throws Exception {
                    while (resultSet.next()) {
                        System.out.print(resultSet.getString("FirstName") + " " +
                                resultSet.getString("LastName") + " " +
                                resultSet.getString("City") + ", " +
                                resultSet.getString("Street") + " " +
                                resultSet.getString("HouseNumber"));
                    }
                }
                    @Then("users should be stored in database")
                            public void usersShouldBeStoredInDatabase(){
                        System.out.println("Users successfully stored in database");
                    }
            }


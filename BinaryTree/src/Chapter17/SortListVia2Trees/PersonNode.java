package Chapter17.SortListVia2Trees;

public class PersonNode
{
    private String lastName;
    private String firstName;
    private String middleName;
    private String idNum;

    public PersonNode(){
        this("","","","");
    }
    public PersonNode(String lastName, String firstName, String middleName, String idNum){
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.idNum = idNum;
    }

    // Accessor Method
    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getIdNum() {
        return idNum;
    }

    public String getFullName(){ return lastName +"," + firstName +","+middleName;}

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    @Override
    public String toString() {
        return "PersonNode{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", idNum='" + idNum + '\'' +
                '}';
    }
}

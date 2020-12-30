package election;

public enum Gender {
    MALE("male"),
    FEMALE("female");
    String gender;
    Gender(String gender){
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }
}

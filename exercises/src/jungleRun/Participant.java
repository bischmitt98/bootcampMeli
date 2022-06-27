package jungleRun;

public class Participant {
    Long id;
    String name, lastName, phoneNum, emergencyNum, bloodType, category;
    int age, idCard;
    double registrationFee;

    public Participant(Long id, String name, String lastName, String phoneNum, String emergencyNum,
                       String bloodType, String category, int age, int idCard, double registrationFee) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.phoneNum = phoneNum;
        this.emergencyNum = emergencyNum;
        this.bloodType = bloodType;
        this.category = category;
        this.age = age;
        this.idCard = idCard;
        this.registrationFee = registrationFee;
    }

    public double calculatePrice(Participant participant){
        if(participant.getAge() < 18){
            if (participant.getCategory() == "small"){
                return 1300;
            }else {
                return 2000;
            }
        }else{
            if (participant.getCategory() == "small"){
                return 1500;
            }else if (participant.getCategory() == "medium"){
                return 2300;
            }else {
                return 2800;
            }
        }
    }

    @Override
    public String toString() {
        return "Participant = " +
                "id=" + id +
                ", name= " + name +
                ", lastName= " + lastName +
                ", phoneNum= " + phoneNum +
                ", emergencyNum= " + emergencyNum +
                ", bloodType= " + bloodType +
                ", category= " + category+
                ", age=" + age +
                ", idCard=" + idCard +
                ", registrationFee=" + registrationFee;
    }

    public Long getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public int getAge() {
        return age;
    }
}

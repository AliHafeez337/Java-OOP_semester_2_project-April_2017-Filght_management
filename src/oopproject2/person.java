package oopproject2;


import java.io.Serializable;


class person implements Serializable{
    
    private String FirstN, LastN, age, address, nationality, idCard, passport, cell, email;
    
    person(){
        
    }
    person(String fn, String ln, String ag, String ad, String na,
            String id, String pa, String em, String ce){
        FirstN =fn;
            LastN =ln;
            age =ag;
            address =ad;
            nationality =na;
            idCard =id;
            passport =pa;
            email =em;
            cell =ce;
    }

    public void setFirstN(String FirstN) {
        this.FirstN = FirstN;
    }

    public String getFirstN() {
        return FirstN;
    }

    public void setLastN(String LastN) {
        this.LastN = LastN;
    }

    public String getLastN() {
        return LastN;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getPassport() {
        return passport;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public String getCell() {
        return cell;
    }
     
}

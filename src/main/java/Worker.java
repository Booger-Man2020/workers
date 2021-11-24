public class Worker {

    public String name;
    public String position;
    public String email;
    public int salary;
    public int phone;
    public int age;

//        private String name;
//    private String position;
//    private String email;
//    private Integer phone;
//    private Integer salary;
//    private Integer age;

    public Worker() {

    }


    public String toString() {
        return "Сотрудник " +
                "ФИО '" + name + '\'' +
                ", '" + position + '\'' +
                ", email'" + email + '\'' +
                ", телефон +" + phone +
                ", ЗП " + salary +
                ", Возраст " + age +
                ' ';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}











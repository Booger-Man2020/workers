public class Main {

    public static void main(String[] args) {

        Worker worker = new Worker();
        worker.setName("Петров Петр Петрович");
        worker.setPosition("Директор");
        worker.setEmail("petrovich@mail.ru");
        worker.setSalary(100_000);
        worker.setPhone(+795456221);
        worker.setAge(41);
        Object s = worker.toString();


        Worker worker1 = new Worker();
        worker1.setName("Петрович Ирина Михайловна");
        worker1.setPosition("Бухгалтер");
        worker1.setEmail("petrovna@mail.ru");
        worker1.setSalary(90_000);
        worker1.setPhone(+795423421);
        worker1.setAge(27);
        Object string = worker1.toString();

        Worker worker2 = new Worker();
        worker2.setName("Иванова Татьяна Ивановна");
        worker2.setPosition("Уборщица");
        worker2.setEmail("ivanova@mail.ru");
        worker2.setSalary(19_000);
        worker2.setPhone(+799809421);
        worker2.setAge(54);
        Object w = worker2.toString();

        Worker worker3 = new Worker();
        worker3.setName("Инженеров Егор Егорович");
        worker3.setPosition("Инженер");
        worker3.setEmail("engeneer@mail.ru");
        worker3.setSalary(33_000);
        worker3.setPhone(+712344421);
        worker3.setAge(37);
        Object wo = worker3.toString();

        Worker worker4 = new Worker();
        worker4.setName("Столяров Степан Антонович");
        worker4.setPosition("Столяр");
        worker4.setEmail("stolyarov@mail.ru");
        worker4.setSalary(21_000);
        worker4.setPhone(+79897421);
        worker4.setAge(35);
        Object wor = worker4.toString();


        Worker[] workers = new Worker[5];
        workers[0] = worker;
        workers[1] = worker1;
        workers[2] = worker2;
        workers[3] = worker3;
        workers[4] = worker4;


        System.out.println(s);
        System.out.println(string);
        System.out.println(w);
        System.out.println(wo);
        System.out.println(wor);

        System.out.println("Сотрудники старше 40 лет");
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getAge() > 40) {

                System.out.println(workers[i].getPosition() + " " + workers[i].getName() + " " + workers[i].getAge() + " " + workers[i].getEmail() + " " + workers[i].getAge() + "лет " + workers[i].getPhone());

            }
        }
    }


}





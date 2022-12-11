import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Human {
    String firstName;
    String lastName;
    final Integer yearOfBirth;
    private Car car;
    Animal pet;
    private Double salary;
    private LocalDateTime prevSalaryGetDate;
    Human(Integer yearOfBirth, Car myCar){
        this.yearOfBirth = yearOfBirth;
    }

    public void setSalary(double newSalary){
        if (newSalary < 0 ){
            System.out.println("Can't set negative salary");
            return;
        }
        System.out.println("Nowe dane zostały wysłane do systemu księgowego");
        System.out.println("Prosimy o odebranie aneksu do umowy od pani Hani z kadr");
        System.out.println("ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu");
        this.salary = newSalary;
    }

    public double getSalary(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        if(prevSalaryGetDate != null){
            System.out.println("Poprzednia data pobrania wyplaty to: " + this.prevSalaryGetDate);
            this.prevSalaryGetDate = LocalDateTime.now();
            return this.salary;
        }
        this.prevSalaryGetDate = LocalDateTime.now();
        System.out.println("Brak daty poprzedniego pobrania wyplaty");
        return this.salary;
    }

    public Car getCar(){
        return car;
    }

    public void setCar(Car car){
        double carValue = car.getValue();
        if(this.salary >= carValue){
            System.out.println("Udalo sie kupic samochod");
            this.car = car;
            return;
        } else if (this.salary >= (carValue / 12)){
            System.out.println("Udalo sie kupic samochod na kredyt");
            this.car = car;
            return;
        } else {
            System.out.println("zapisz się na studia i znajdź nową robotę albo idź po\n" +
                    "podwyżkę");
            return;
        }
    }
}

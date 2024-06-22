public class Main {
    public static void main(String[] args) {

        Employee[] worker = new Employee[10];
        worker[0] = new Employee("Бабушкин", "Илья", "Андреевич",10_000,1);
        worker[1] = new Employee("Мусинькин", "Игорь", "Петрович",20_000,2);
        worker[2] = new Employee("Хазбулатов", "Виталий", "Насреддинов",30_000,3);
        worker[3] = new Employee("Познер", "Иван", "Иванович",40_000,4);
        worker[4] = new Employee("Волондемортов", "Исаакий", "Лепреконович",50_000,5);
        worker[5] = new Employee("Дудина", "Ирина", "Игорьевна",60_000,2);
        worker[6] = new Employee("Смактуновский", "Иннокентий", "Павлович",70_000,3);
        worker[7] = new Employee("Бузинова", "Наталья", "Натальевна",80_000,2);
        worker[8] = new Employee("Навеяло", "Навелий", "Навельевич",90_000,5);
        worker[9] = new Employee("Прошкина", "Прасковья", "Пелевьевна",100_000,4);

        System.out.println("First Record ID:"+worker[0].getId());
        System.out.println("First Record Department:"+worker[0].getDepartment());
        System.out.println("Вывод всех полей");
        for (Employee employee : worker) {
            printEmployee(employee);
        }

        System.out.println("Вывод ФИО");
        for (Employee employee : worker) {
            printEmployeeFullName(employee);
        }
        System.out.println("Average = " + salaryAverage(worker));
        System.out.println("Min = " + salaryMin(worker));
        System.out.println("Max = " + salaryMax(worker));
        System.out.println("Sum = " + salarySum(worker));
    }

    public static void printEmployee(Employee employee) {
        System.out.println(employee);
    }

    public static void printEmployeeFullName(Employee employee) {
        System.out.println(employee.getLastName() + " " + employee.getFirstName() + " " + employee.getAdditiveName());
    }

    public static double salaryAverage(Employee[] worker) {
        double salaryAverage = 0;
        int count = 0;
        for (Employee employee : worker) {
            salaryAverage += employee.getMonthSalary();
            count++;
        }
        return salaryAverage / count;
    }

    public static double salaryMax(Employee[] worker) {
        double salaryMax = 0;
        for (Employee employee : worker) {
            if (employee.getMonthSalary() > salaryMax) {
                salaryMax = employee.getMonthSalary();
            }
        }
        return salaryMax;
    }

    public static double salaryMin(Employee[] worker) {
        double salaryMin = worker[0].getMonthSalary();
        for (Employee employee : worker) {
            if (employee.getMonthSalary() < salaryMin) {
                salaryMin = employee.getMonthSalary();
            }
        }
        return salaryMin;
    }

    public static double salarySum(Employee[] worker) {
        double salarySum = 0;
        for (Employee employee : worker) {
            salarySum += employee.getMonthSalary();
        }
        return salarySum;

    }

}

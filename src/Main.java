public class Main {
    public static void main(String[] args) {

        String[][] workerName = {
                {"Бабушкин", "Илья", "Андреевич"},
                {"Мусинькин", "Игорь", "Петрович"},
                {"Хазбулатов", "Виталий", "Насреддинов"},
                {"Познер", "Иван", "Иванович"},
                {"Волондемортов", "Исаакий", "Лепреконович"},
                {"Дудина", "Ирина", "Игорьевна"},
                {"Смактуновский", "Иннокентий", "Павлович"},
                {"Бузинова", "Наталья", "Натальевна"},
                {"Навеяло", "Навелий", "Навельевич"},
                {"Прошкина", "Прасковья", "Пелевьевна"}
        };
        int[] workerDepartment = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        double[] workerSalary = {10000, 20000, 30000, 40000, 50000, 60000, 70000, 80000, 90000, 100000};
        Employee[] worker = new Employee[10];
        for (int i = 0; i < 10; i++) {
            worker[i] = new Employee();
            worker[i].setId(i + 1);
            worker[i].setFirstName(workerName[i][1]);
            worker[i].setLastName(workerName[i][0]);
            worker[i].setAdditiveName(workerName[i][2]);
            worker[i].setDepartment(workerDepartment[i]);
            worker[i].setMonthSalary(workerSalary[i]);
        }

        System.out.println("First Record ID:"+worker[0].getId());
        System.out.println("First Record Department:"+worker[0].getDepartment());
        System.out.println("Вывод всех полей");
        for (Employee employee : worker) {
            printEmployeeRow(employee);
        }

        System.out.println("Вывод ФИО");
        for (Employee employee : worker) {
            printEmployeeFullNameRow(employee);
        }
        System.out.println("Average = " + salaryAverage(worker));
        System.out.println("Min = " + salaryMin(worker));
        System.out.println("Max = " + salaryMax(worker));
        System.out.println("Sum = " + salarySum(worker));
    }

    public static void printEmployeeRow(Employee employee) {
        System.out.println(employee.toString());
    }

    public static void printEmployeeFullNameRow(Employee employee) {
        System.out.println(employee.getLastName() + " " + employee.getFirstName() + " " + employee.getAdditiveName());
    }

    public static double salaryAverage(Employee[] worker) {
        double salaryAverage = 0;
        int i = 0;
        for (; i < worker.length; i++) {
            salaryAverage += worker[i].getMonthSalary();
        }
        return salaryAverage / i;
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

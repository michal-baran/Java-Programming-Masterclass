package com.michalbaran;

public class Main {
    public static void main(String[] args) {

//        Employee john = new Employee("John Doe", 30);
//        Employee michal = new Employee("Michał Baran", 34);
//        Employee tim = new Employee("Jack Hill", 40);
//        Employee snow = new Employee("Snow White", 21);
//
//        List<Employee> employees = new ArrayList<>();
//        employees.add(john);
//        employees.add(michal);
//        employees.add(tim);
//        employees.add(snow);
//
//        Collections.sort(employees, Comparator.comparing(Employee::getName));
//
//        for (Employee employee : employees) {
//            System.out.println(employee.getName());
//        }

//        UpperConcat uc = (s1, s2) -> s1.toUpperCase() + s2.toUpperCase();
//
//        String sillyString = doStringStuff(uc, employees.get(0).getName(), employees.get(1).getName());
//        System.out.println(sillyString);

        AnotherClass anotherClass = new AnotherClass();
        String s = anotherClass.doSomething();
        System.out.println(s);
    }

    public final static String doStringStuff(UpperConcat uc, String s1, String s2) {
        return uc.upperAndConcat(s1, s2);
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

interface UpperConcat {
    String upperAndConcat(String s1, String s2);
}

class AnotherClass {
    public String doSomething() {
//        UpperConcat uc = (s1, s2) -> {
//            System.out.println("The lambda expression's class is " + getClass().getSimpleName());
//            return s1.toUpperCase() + s2.toUpperCase();
//        };
        final int i = 0;
        {
            UpperConcat uc = new UpperConcat() {
                @Override
                public String upperAndConcat(String s1, String s2) {
                    System.out.println("i (within anonymous class) = " + i);
                    return s1.toUpperCase() + s1.toUpperCase();
                }
            };
            System.out.println("The AnotherClass class's name is " + getClass().getSimpleName());
//            i++;
            System.out.println("i=" + i);
            return Main.doStringStuff(uc, "String1", "String2");
        }


        //        System.out.println("The AnotherClass class's name is " + getClass().getSimpleName());
//        return Main.doStringStuff(new UpperConcat() {
//            @Override
//            public String upperAndConcat(String s1, String s2) {
//                System.out.println("The anonymous class's name is " + getClass().getSimpleName());
//                return s1.toUpperCase() + s2.toUpperCase();
//            }
//        }, "String1", "String2");
    }
}
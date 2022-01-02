package com.certification;

public class BooBlocks {

    public static void main(String[] args) {

        //Person person = new Person("Mario", "123");
        //System.out.println(person);
        Employee employee = new Employee("José", "555", "Gardener");
        System.out.println(employee);

    }

    static class Person {

        protected String name;
        protected String cpf;

        static {
            System.out.println("Inside the Person static block.");
        }

        {
            System.out.println("Inside the Person block 1");
        }

        {
            System.out.println("Inside the Person block 2");
        }

        public Person(){}

        public Person(String name, String cpf) {
            System.out.println("Inside the Person constructor.");
            this.name = name;
            this.cpf = cpf;
        }

        public void test(String something ) {
            System.out.println("Calling the function by super. " + something);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", cpf='" + cpf + '\'' +
                    '}';
        }
    }

    static class Employee extends Person {

        public String function;

        static {
            System.out.println("Inside the Employee static block.");
        }

        {
            System.out.println("Inside the Employee block 1");
        }

        {
            System.out.println("Inside the Employee block 2");
        }

        public Employee() {}

        public Employee(String name, String cpf, String function) {
            super(name, cpf);
            this.function = function;
            System.out.println("Inside the Employee constructor.");
        }

        @Override
        public String toString() {

            super.test("Hi");

            return "Employee{" +
                    "name='" + name + '\'' +
                    ", cpf='" + cpf + '\'' +
                    ", function='" + function + '\'' +
                    '}';
        }
    }
}

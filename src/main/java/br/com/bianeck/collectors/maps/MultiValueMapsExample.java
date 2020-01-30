package br.com.bianeck.collectors.maps;

import java.util.*;

public class MultiValueMapsExample {
    static Map<Integer, List<Employee>> employeeDOJMap = new HashMap<>();

    public static void main(String args[]) {

        List<Employee> list2014 = Arrays.asList(
                new Employee("Deborah Sprightly", 29, 9000.00));
        employeeDOJMap.put(2014, list2014);

        List<Employee> list2015 = Arrays.asList(
                new Employee("Tom Jones", 45, 7000.00),
                new Employee("Harry Major", 25, 10000.00));
        employeeDOJMap.put(2015, list2015);

        List<Employee> list2016 = Arrays.asList(
                new Employee("Ethan Hardy", 65, 8000.00),
                new Employee("Nancy Smith", 22, 12000.00));
        employeeDOJMap.put(2016, list2016);

        System.out.println("Using Map.forEach to print the Employee in employeeDOJMap multi-value map\n");
        employeeDOJMap.forEach((year,empList)->System.out.println(year+"-->" +empList));

        System.out.println("\nCAPITALIZED Employee Names using Map.replaceAll()");
        employeeDOJMap.replaceAll((year, empList) -> {
            empList.replaceAll(emp -> {
                emp.setName(emp.getName().toUpperCase());
                return emp;
            });
            return empList;
        });
        employeeDOJMap.forEach((year, empList)-> System.out.println(year+"-->"+empList));

        System.out.println("\nJava 7 way of adding a new key(2017) in a multi-value map\n");
        List empList2017 = employeeDOJMap.get(2017);
        if (empList2017 == null) {
            empList2017 = new ArrayList<>();
        }
        empList2017.add(new Employee("Tom Newman", 45, 12000.00));
        employeeDOJMap.put(2017, empList2017);
        employeeDOJMap.forEach((year,empList)-> System.out.println(year+"-->"+empList));

        System.out.println("\nUsing Map.computeIfAbsent() to add a new key(2018) in a multi-value map\n");
        employeeDOJMap.computeIfAbsent(2018,empList -> new ArrayList<>())
                .add(new Employee("Dick Newman", 35, 10000.00));
        employeeDOJMap.forEach((year,empList)-> System.out.println(year+"-->"+empList));


        System.out.println("\nJava 7 way of removing a key(2017) in a multi-value map for which no entry exists\n");

//        List empListDel = employeeDOJMap.get(2017);
//
//        empListDel.removeIf(employee ->  employee.getName().equals("Tom Newman"));
//        if (empListDel.size() == 0) {
//            employeeDOJMap.remove(2017);
//        }

        employeeDOJMap.forEach((year, empList)-> System.out.println(year+"-->"+empList));

        System.out.println("\nUsing Map.computeIfPresent() to remove a key(2018) for which no entry exists\n");

        employeeDOJMap.computeIfPresent(2018, (year, empList) ->
                empList.removeIf(employee ->
                        employee.getName()
                                .equals("Dick Newman")) && empList.size() == 0 ? null : empList);

        employeeDOJMap.forEach((year, empList)-> System.out.println(year+"-->"+empList));

        System.out.println("\nAvoiding a null return when fetching a non-existent key's entry using Map.getOrDefault() method\n");
        List<Employee> empList2019 = employeeDOJMap.getOrDefault(2019, new ArrayList<>());
        System.out.println("Size of empList 2019 = " + empList2019.size());

    }
}

package CaseStudy_FuramaResort.Model;

import java.util.Stack;

public class FilingCabinets {

    public FilingCabinets() {
    }

    public static Stack<Employee> addToFilingCabinets() {
        // nhap thong tin nhan vien
        Employee employee1 = new Employee("Doan Ngoc Linh", 23, "Da Nang", 1);
        Employee employee2 = new Employee("Do Van B", 25, "Da Nang", 2);
        Employee employee3 = new Employee("Nguyen Thi A", 25, "Gia Lai", 3);
        Employee employee4 = new Employee("Tran Van D", 26, "Nam Dinh", 4);
        Employee employee5 = new Employee("Bui Thi C", 28, "Quang Tri", 5);
        Employee employee6 = new Employee("Dang Ngoc L", 29, "Hue", 6);
        Employee employee7 = new Employee("Nguyen Van A", 21, "Sai Gon", 7);
        Employee employee8 = new Employee("Tran Thi T", 30, "Quang Binh", 8);
        Employee employee9 = new Employee("Le Van C", 24, "Quang Nam", 9);
        Employee employee10 = new Employee("Tran Q", 27, "Ha Noi", 10);

        Stack<Employee> filingCabinets = new Stack<Employee>();
        filingCabinets.push(employee1);
        filingCabinets.push(employee9);
        filingCabinets.push(employee3);
        filingCabinets.push(employee4);
        filingCabinets.push(employee5);
        filingCabinets.push(employee7);
        filingCabinets.push(employee8);
        filingCabinets.push(employee2);
        filingCabinets.push(employee10);
        filingCabinets.push(employee6);
        return filingCabinets;
    }
}

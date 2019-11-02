package CaseStudy_FuramaResort.Controllers;

import CaseStudy_FuramaResort.Commons.DataInput;
import CaseStudy_FuramaResort.Model.*;
import CaseStudy_FuramaResort.Commons.FuncWriteFileCSV;

import java.util.*;

public class MainController {
    public static Scanner input = new Scanner(System.in);
    private static Queue<Customer> customerQueueBookingTicket = new LinkedList<Customer>();

    /**
     * hien thi menu lua chon
     */
    public static void displayMainMenu() {
        System.out.println("==============");
        System.out.println(
                "1. Add New Service " + "\n" +
                        "2. Show Service" + "\n" +
                        "3.Add New Customer" + "\n" +
                        "4.Show Information Customer" + "\n" +
                        "5.Add New Booking Resort" + "\n" +
                        "6.Show Information Employee" + "\n" +
                        "7.Booking MovieTicket 4D " + "\n" +
                        "8.Find Employee" + "\n" +
                        "9.Exit" + "\n" +
                        "========Please chose=======");
        switch (input.nextLine()) {
            case "1":
                addNewServices();
                break;
            case "2":
                showService();
                break;
            case "3":
                addNewCustomer();
                backMainMenu();
                break;
            case "4":
                showAllCustomer();
                backMainMenu();
                break;
            case "5":
                addNewBookingResort();
                backMainMenu();
                break;
            case "6":
                showInformationEmployee();
                backMainMenu();
                break;
            case "7":
                bookingMovieTicket4D();
                break;
            case "8":
                findInforEmployee();
                input.nextLine();
                displayMainMenu();
                break;
            case "9":
                System.exit(0);
            default:
                System.out.println("Error!!! is backing");
                displayMainMenu();
        }
    }

    private static void addBookingMovieTicket4D() {
        // lua chon customer booking ticket
        ArrayList<Customer> listCustomer = FuncWriteFileCSV.parseCustomerCSVtoBean();
        Collections.sort(listCustomer);
        int i = 1;
        for (Customer customer : listCustomer) {
            System.out.println("============");
            System.out.println("No " + i);
            customer.showInformation();
            System.out.println("============");
            i++;
        }
        System.out.println("Chose customer want booking: ");
        Customer customer = listCustomer.get((input.nextInt() - 1));
        customerQueueBookingTicket.add(customer);
        System.out.println("====Booking successfully====");
    }

    private static void showBookingMovieTicket() {
        int i = 1;
        for (Customer customer : customerQueueBookingTicket) {
            System.out.println("==================");
            System.out.print("Position No. " + i);
            customer.showInformation();
            i++;
        }
    }

    private static void bookingMovieTicket4D() {
        System.out.println("\n1.Booking movie ticket" +
                "\n2.Show customer booking movie ticket" +
                "\n3.Exit");
        switch (input.nextLine()) {
            case "1":
                addBookingMovieTicket4D();
                input.nextLine();
                displayMainMenu();
                break;
            case "2":
                showBookingMovieTicket();
                displayMainMenu();
                break;
            case "3":
                System.exit(0);
            default:
                System.out.println("Error!!!Backing to menu");
                displayMainMenu();
        }
    }

    private static void addNewBookingResort() {
        ArrayList<Customer> listCustomer = FuncWriteFileCSV.parseCustomerCSVtoBean();
        Collections.sort(listCustomer);
        int i = 1;
        for (Customer customer : listCustomer) {
            System.out.println("============");
            System.out.println("No " + i);
            customer.showInformation();
            System.out.println("============");
            i++;
        }
        System.out.println("Chose customer want booking: ");
        Customer customer = listCustomer.get((input.nextInt() - 1));
        input.nextLine();
        System.out.print("Chose service want booking");
        System.out.println("\n1.Booking villa" +
                "\n2.Booking house" +
                "\n3.Booking room" +
                "\n4.Back" +
                "\n5Back to main menu");
        String chose = input.nextLine();
        switch (chose) {
            case "1":
                i = 1;
                ArrayList<Villa> listVilla = FuncWriteFileCSV.parseVillaCSVtoBean();
                for (Villa villa : listVilla) {
                    System.out.println("\n===============");
                    System.out.println("No. " + i);
                    villa.showInformation();
                    System.out.println("===============");
                    i++;
                }
                System.out.println("Please chose villa want booking: ");
                Villa villa = listVilla.get((input.nextInt() - 1));
                customer.setServices(villa);
                System.out.println("==========Successfully========");
                input.nextLine();
                break;
            case "2":
                i = 1;
                ArrayList<House> listHouse = FuncWriteFileCSV.parseHouseCSVtoBean();
                for (House house : listHouse) {
                    System.out.println("\n===============");
                    System.out.println("No. " + i);
                    house.showInformation();
                    System.out.println("===============");
                    i++;
                }
                System.out.println("Please chose house want booking: ");
                House house = listHouse.get((input.nextInt() - 1));
                customer.setServices(house);
                System.out.println("==========Successfully========");
                input.nextLine();
                break;
            case "3":
                i = 1;
                ArrayList<Room> listRoom = FuncWriteFileCSV.parseRoomCSVtoBean();
                for (Room room : listRoom) {
                    System.out.println("\n===============");
                    System.out.println("No. " + i);
                    room.showInformation();
                    System.out.println("===============");
                    i++;
                }
                System.out.println("Please chose room want booking: ");
                Room room = listRoom.get((input.nextInt() - 1));
                customer.setServices(room);
                System.out.println("==========Successfully========");
                input.nextLine();
                break;
            case "4":
                addNewBookingResort();
                break;
            case "5":
                backMainMenu();
                break;
            default:
                System.out.println("Error!!! Backing");
                displayMainMenu();
        }
        ArrayList<Customer> listBooking = FuncWriteFileCSV.ReaderBookingCSV();
        listBooking.add(customer);
        FuncWriteFileCSV.writeBookingService(listBooking);
    }

    private static void showAllCustomer() {
        ArrayList<Customer> listCustomer = FuncWriteFileCSV.parseCustomerCSVtoBean();
        Collections.sort(listCustomer);
        for (Customer customer : listCustomer) {
            customer.showInformation();
            System.out.println("==========");
        }
    }

    /**
     * lua chon hien thi service nao
     */
    private static void showService() {
        System.out.println("Show service...." +
                "\n1.Show All Villa" +
                "\n2.Show All House" +
                "\n3.Show All Room" +
                "\n4.Show All Villa Not Duplicate" +
                "\n5.Show All House Not Duplicate" +
                "\n6.Show All Room Not Duplicate" +
                "\n7.Back To Menu" +
                "\n8.Exit");
        switch (input.nextLine()) {
            case "1":
                showAllVilla();
                backMainMenu();
                break;
            case "2":
                showAllHouse();
                backMainMenu();
                break;
            case "3":
                showAllRoom();
                backMainMenu();
                break;
            case "4":
                showAllVillaNotDuplicate();
                backMainMenu();
                break;
            case "5":
                showAllHouseNotDuplicate();
                backMainMenu();
                break;
            case "6":
                showAllRoomNotDuplicate();
                backMainMenu();
                break;
            case "7":
                backMainMenu();
                break;
            case "8":
                System.exit(0);
            default:
                System.out.println("Error!!! is back");
                showService();
        }
    }

    private static void showAllVillaNotDuplicate() {
        Set<String> set = FuncWriteFileCSV.getTreeSetService(FuncWriteFileCSV.pathVilla);
        for (String nameService : set) {
            System.out.println(nameService);
        }
    }

    private static void showAllHouseNotDuplicate() {
        Set<String> set = FuncWriteFileCSV.getTreeSetService(FuncWriteFileCSV.pathHouse);
        for (String nameService : set) {
            System.out.println(nameService);
        }
    }

    private static void showAllRoomNotDuplicate() {
        Set<String> set = FuncWriteFileCSV.getTreeSetService(FuncWriteFileCSV.pathRoom);
        for (String nameService : set) {
            System.out.println(nameService);
        }
    }

    private static void showAllVilla() {
        ArrayList<Villa>
                listVilla = FuncWriteFileCSV.parseVillaCSVtoBean();
        System.out.println("=============");
        for (Villa villa : listVilla) {
            villa.showInformation();
            System.out.println("===============");
        }
    }

    private static void showAllHouse() {
        ArrayList<House> listHouse = FuncWriteFileCSV.parseHouseCSVtoBean();
        System.out.println("=============");
        for (House house : listHouse) {
            house.showInformation();
            System.out.println("===============");
        }
    }

    private static void showAllRoom() {
        ArrayList<Room> listRoom = FuncWriteFileCSV.parseRoomCSVtoBean();
        System.out.println("=============");
        for (Room room : listRoom) {
            room.showInformation();
            System.out.println("===============");
        }
    }


    /**
     * phuong thuc tro ve menu chinh
     */
    private static void backMainMenu() {
        System.out.println("=========");
        System.out.print("Enter to back\n");
        input.nextLine();
        displayMainMenu();
    }

    /**
     * phuong thuc lua chon them loai Service nao
     */
    private static void addNewServices() {
        System.out.println("=================");
        System.out.println("1. Add New Villa" + "\n" +
                "2. Add New House" + "\n" +
                "3. Add New Room" + "\n" +
                "4. Back to Menu" + "\n" +
                "5.Exit");
        switch (input.nextLine()) {
            case "1":
                addNewVilla();
                addNewServices();
                break;
            case "2":
                addNewHouse();
                addNewServices();
                break;
            case "3":
                addNewRoom();
                addNewServices();
                break;
            case "4":
                backMainMenu();
                break;
            case "5":
                System.exit(0);
            default:
                System.out.println("Error!!! is Back");
                addNewServices();
        }
    }

    /**
     * add thong tin service chung
     *
     * @param services
     */
    private static void addServices(Services services) {
        String content = "";
        String error = "";
        System.out.print("Enter Service Name: ");
        services.setServiceName(input.nextLine());
        while (!DataInput.checkName(services.getServiceName())) {
            System.out.print("Service Name is invalid, please try again! ");
            System.out.print("Enter Service Name: ");
            services.setServiceName(input.nextLine());
        }
        // add dien tich su dung
        content = "Enter Area Used: ";
        error = "Area Used is float and >= 30m2, please try again ";
        services.setAreaUsed(DataInput.checkFloat(content, error));
        while (services.getAreaUsed() < 30 || services.getAreaUsed() <= 0) {
            System.out.print(error);
            services.setAreaUsed(DataInput.checkFloat(content, error));
        }
        // add gia thue
        content = "Enter Rent Cost: ";
        error = " Rent cost is invalid, please try again";
        services.setRentCost(DataInput.checkFloat(content, error));
        while (services.getRentCost() <= 0) {
            System.out.print(error);
            services.setRentCost(DataInput.checkFloat(content, error));
        }
        // them so nguoi toi da
        content = "Enter max Number of person: ";
        error = "Max Number Of Person is invalid , please try again ";
        services.setMaxNumberOfPerson(DataInput.checkInteger(content, error));
        while (services.getMaxNumberOfPerson() > 20 || services.getMaxNumberOfPerson() < 0) {
            System.out.print(error);
            services.setMaxNumberOfPerson(DataInput.checkInteger(content, error));
        }
        System.out.print("Enter rent type(Month, Day, Hours): ");
        services.setRentType(DataInput.validString(input.nextLine()));
        services.setIdService(java.util.UUID.randomUUID().toString().replace("-", ""));
    }

    /**
     * them nhung thong tin House giong voi Villa
     */
    private static void addServiceHigh(ServicesHigh servicesHigh) {
        String content = "";
        String error = "";
        System.out.print("Enter room standard: ");
        servicesHigh.setRoomStandard(input.nextLine());
        while (!DataInput.checkName(servicesHigh.getRoomStandard())) {
            System.out.print("Room standard is invalid , please try again ");
            System.out.print("Enter room standard: ");
            servicesHigh.setRoomStandard(input.nextLine());
        }
        System.out.print("Enter other convenient: ");
        servicesHigh.setOtherConvenient(input.nextLine());
        while (!DataInput.checkName(servicesHigh.getOtherConvenient())) {
            System.out.print("Other Convenient is invalid , please try again ");
            System.out.print("Enter other convenient: ");
            servicesHigh.setOtherConvenient(input.nextLine());
        }
        // them thong tin so tang
        content = "Enter number of floor: ";
        error = "Number of float is invalid just < 20, please try again ";
        servicesHigh.setNumberOfFloor(DataInput.checkInteger(content, error));
        while (servicesHigh.getNumberOfFloor() > 20 || servicesHigh.getNumberOfFloor() < 0) {
            System.out.print(error);
            servicesHigh.setNumberOfFloor(DataInput.checkInteger(content, error));
        }

    }

    /**
     * them thong tin House
     */
    private static void addNewHouse() {
        ServicesHigh house = new House();
        addServices(house);
        addServiceHigh(house);
        ArrayList<House> listHouse = FuncWriteFileCSV.parseHouseCSVtoBean();// truyen thong tin cu vao list
        listHouse.add((House) house);
        FuncWriteFileCSV.writeHouseFileCsv(listHouse);
        System.out.print("Add new house Successfully....Back to menu Add new service");
    }

    /**
     * them thong tin Villa
     */
    public static void addNewVilla() {
        String content = "";
        String error = "";
        ArrayList<Villa> listVilla = FuncWriteFileCSV.parseVillaCSVtoBean();// truyen thong tin cu vao list
        ServicesHigh villa = new Villa();
        addServices(villa);
        addServiceHigh(villa);
        // them dien tich ho boi
        content = "Enter area of pool: ";
        error = "Area of pool just >= 30 , please try again ";
        ((Villa) villa).setAreaOfPool(DataInput.checkFloat(content, error));
        while ((((Villa) villa).getAreaOfPool()) < 30) {
            System.out.print(error);
            ((Villa) villa).setAreaOfPool(DataInput.checkFloat(content, error));
        }
        listVilla.add((Villa) villa);
        FuncWriteFileCSV.writeVillaFileCsv(listVilla);
        System.out.print("Add new villa Successfully....Back to menu Add new service");
    }

    /**
     * them thong tin Room
     */
    private static void addNewRoom() {
        Services room = new Room();
        addServices(room);
        System.out.print("enter Free Services Included: (Massage, Karaoke, Drink, Food, Car)");
        ((Room) room).setFreeServiceIncluded(input.nextLine());
        while (!DataInput.checkServiceIncluded(((Room) room).getFreeServiceIncluded())) {
            System.out.print("Invalid , Please try again");
            System.out.print("enter Free Services Included: (Massage, Karaoke, Drink, Food, Car)");
            ((Room) room).setFreeServiceIncluded(input.nextLine());
        }
        ArrayList<Room> listRoom = FuncWriteFileCSV.parseRoomCSVtoBean(); // truyen data cu vao list
        listRoom.add((Room) room);
        FuncWriteFileCSV.writeRoomFileCsv(listRoom);
        System.out.print("Add new room Successfully....Back to menu Add new service");
    }

    // them thong tin khach hang co chuan hoa du lieu dau vao
    private static void addNewCustomer() {
        String content = "";
        String error = "";
        Customer customer = new Customer();
        System.out.print("Enter Name Customer:");
        customer.setCustomerName(input.nextLine());
        while (!DataInput.checkName(customer.getCustomerName())) {
            System.out.print("Customer Name is invalid, please try again!");
            System.out.print("Enter Name Customer:");
            customer.setCustomerName(input.nextLine());
        }
        System.out.print("Enter Birthday: ");
        customer.setBirthday(input.nextLine());
        while (!DataInput.checkBirthday(customer.getBirthday())) {
            System.out.print("Birthday is invalid, please try again ");
            System.out.print("Enter Birthday: ");
            customer.setBirthday(input.nextLine());
        }
        System.out.print("Enter Gender (Male/ Female/ Unknown): ");
        customer.setGender(DataInput.validString(input.nextLine()));
        content = "Enter id card: ";
        error = "ID card is invalid ";
        customer.setIdCard(DataInput.checkInteger(content, error));
        while (customer.getIdCard() > 999999999 || customer.getIdCard() < 100000000) {
            System.out.print(error);
            customer.setIdCard(DataInput.checkInteger(content, error));
        }
        System.out.println("Enter email: ");
        customer.setEmail(input.nextLine());
        while (!DataInput.checkEmail(customer.getEmail())) {
            System.out.print("Email is invalid , please try again ");
            System.out.print("Enter email: ");
            customer.setEmail(input.nextLine());
        }
        content = "Enter number phone: ";
        error = "Number phone is invalid ";
        DataInput.checkInteger(content, error);

        System.out.print("Enter Customer Type: ");
        customer.setCustomerType(input.nextLine());
        while (!DataInput.checkName(customer.getCustomerName())) {
            System.out.print("Customer Type is invalid, please try again!");
            System.out.print("Enter Customer Type: ");
            customer.setCustomerType(input.nextLine());
        }
        System.out.println("Enter Address: ");
        customer.setAddress(input.nextLine());
        while (!DataInput.checkName(customer.getAddress())) {
            System.out.print("Address is invalid, please try again!");
            System.out.println("Enter Address: ");
            customer.setAddress(input.nextLine());
        }
        customer.setId(java.util.UUID.randomUUID().toString().replace("-", ""));
        ArrayList<Customer> listCustomer = FuncWriteFileCSV.parseCustomerCSVtoBean();
        listCustomer.add(customer);
        FuncWriteFileCSV.writeCustomerToCSV(listCustomer);
        System.out.print("Add new customer Successfully....Back to menu");
    }

    //hien thi thong tin nhan vien tu Map
    private static void showInformationEmployee() {
        Map<Integer, Employee> map = addEmployeeToMap();
        Set<Integer> set = map.keySet();
        for (Integer key : set) {
            System.out.println(map.get(key));
        }
    }

    // nhap du lieu tinh vao map
    private static Map<Integer, Employee> addEmployeeToMap() {
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
        Map<Integer, Employee> map = new HashMap<Integer, Employee>();
        map.put(employee1.getKeyEmployee(), employee1);
        map.put(employee2.getKeyEmployee(), employee2);
        map.put(employee3.getKeyEmployee(), employee3);
        map.put(employee4.getKeyEmployee(), employee4);
        map.put(employee5.getKeyEmployee(), employee5);
        map.put(employee6.getKeyEmployee(), employee6);
        map.put(employee7.getKeyEmployee(), employee7);
        map.put(employee8.getKeyEmployee(), employee8);
        map.put(employee9.getKeyEmployee(), employee9);
        map.put(employee10.getKeyEmployee(), employee10);
        return map;
    }

    // ham tim kiem employee trong stack
    private static void findInforEmployee() {
        Stack<Employee> employeeStack = FilingCabinets.addToFilingCabinets();
        System.out.print("Enter key of employee: ");
        int key = input.nextInt();
        try {
            while (true) {
                if (employeeStack.peek().getKeyEmployee() != key) {
                    employeeStack.pop();
                } else {
                    System.out.println(employeeStack.peek().toString());
                    break;
                }
            }
        } catch (EmptyStackException ex) {
            System.out.print("key invalid, please try again");
            findInforEmployee();
        }
    }
}
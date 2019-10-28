package CaseStudy_FuramaResort.Controllers;

import CaseStudy_FuramaResort.Commons.DataInput;
import CaseStudy_FuramaResort.Model.*;
import CaseStudy_FuramaResort.Commons.FuncWriteFileCSV;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class MainController {
    public static Scanner input = new Scanner(System.in);
    private static String content;
    private static String error;

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
                        "5.Exit");
        switch (input.nextByte()) {
            case 1:
                addNewServices();
                break;
            case 2:
                showService();
                break;
            case 3:
                addNewCustomer();
                displayMainMenu();
                break;
            case 4:
                showAllCustomer();
                displayMainMenu();
                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("Error");
                displayMainMenu();
        }
    }

    private static void showAllCustomer() {
        ArrayList<Customer> listCustomer = FuncWriteFileCSV.parseCustomerCSVtoBean();
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
                "\n4.Back To Menu" +
                "\n5.Exit");
        switch (input.nextByte()) {
            case 1:
                showAllVilla();
                displayMainMenu();
                break;
            case 2:
                showAllHouse();
                displayMainMenu();
                break;
            case 3:
                showAllRoom();
                displayMainMenu();
                break;
            case 4:
                backMainMenu();
                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("Error!!! is back");
                showService();
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
        ArrayList<House>
                listHouse = FuncWriteFileCSV.parseHouseCSVtoBean();
        System.out.println("=============");
        for (House house : listHouse) {
            house.showInformation();
            System.out.println("===============");
        }
    }

    private static void showAllRoom() {
        ArrayList<Room>
                listRoom = FuncWriteFileCSV.parseRoomCSVtoBean();
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
        System.out.println("Enter to back");
        input.nextLine();
        System.out.println("=========");
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
        switch (input.nextByte()) {
            case 1:
                addNewVilla();
                displayMainMenu();
                break;
            case 2:
                addNewHouse();
                displayMainMenu();
                break;
            case 3:
                addNewRoom();
                displayMainMenu();
                break;
            case 4:
                backMainMenu();
                break;
            case 5:
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
        input.nextLine();
        System.out.print("Enter Service Name: ");
        services.setServiceName(input.nextLine());
        while (!DataInput.checkName(services.getServiceName())) {
            System.out.print("Service Name is invalid, please try again!");
            System.out.print("Enter Service Name: ");
            services.setServiceName(input.nextLine());
        }
        // add dien tich su dung
        content = "Enter Area Used";
        error = "Area Used is float and >= 30m2, please try again";
        services.setAreaUsed(DataInput.checkFloat(content, error));
        while (services.getAreaUsed() < 30) {
            System.out.println(error);
            services.setAreaUsed(DataInput.checkFloat(content, error));
        }
        // add gia thue
        content = "Enter Rent Cost: ";
        error = " Rent cost is invalid, please try again";
        services.setRentCost(DataInput.checkFloat(content, error));
        // them so nguoi toi da
        content = "Enter max Number of person: ";
        error = "Max Number Of Person is invalid , please try again";
        services.setMaxNumberOfPerson(DataInput.checkInteger(content, error));
        while (services.getMaxNumberOfPerson() > 20 || services.getMaxNumberOfPerson() < 0) {
            System.out.println(error);
            services.setMaxNumberOfPerson(DataInput.checkInteger(content, error));
        }
        input.nextLine();
        System.out.print("Enter rent type: ");
        services.setRentType(input.nextLine());
        while (!DataInput.checkName(services.getRentType())) {
            System.out.println("Rent type is in valid , please try again");
            System.out.print("Enter rent type: ");
            services.setRentType(input.nextLine());
        }
        services.setId(java.util.UUID.randomUUID().toString().replace("-", ""));
    }

    /**
     * them nhung thong tin House giong voi Villa
     */
    private static void addServiceHigh(ServicesHigh servicesHigh) {
        System.out.print("Enter room standard: ");
        servicesHigh.setRoomStandard(input.nextLine());
        while (!DataInput.checkName(servicesHigh.getRoomStandard())) {
            System.out.println("Room standard is invalid , please try again");
            System.out.print("Enter room standard: ");
            servicesHigh.setRoomStandard(input.nextLine());
        }
        System.out.print("Enter other convenient: ");
        servicesHigh.setOtherConvenient(input.nextLine());
        while (!DataInput.checkName(servicesHigh.getOtherConvenient())) {
            System.out.println("Other Convenient is invalid , please try again");
            System.out.print("Enter other convenient: ");
            servicesHigh.setOtherConvenient(input.nextLine());
        }
        // them thong tin so tang
        content = "Enter number of floor: ";
        error = "Number of float is invalid , please try again";
        servicesHigh.setNumberOfFloor(DataInput.checkInteger(content, error));
        while (servicesHigh.getNumberOfFloor() > 20 || servicesHigh.getNumberOfFloor() < 0) {
            System.out.println(error);
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
        ArrayList<Villa> listVilla = FuncWriteFileCSV.parseVillaCSVtoBean();// truyen thong tin cu vao list
        ServicesHigh villa = new Villa();
        addServices(villa);
        addServiceHigh(villa);
        // them dien tich ho boi
        content = "Enter area of pool: ";
        error = "Area of pool just >= 30 , please try again";
        ((Villa) villa).setAreaOfPool(DataInput.checkFloat(content, error));
        while ((((Villa) villa).getAreaOfPool()) < 30) {
            System.out.println(error);
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
            System.out.println("Invalid , Please try again");
            System.out.print("enter Free Services Included: (Massage, Karaoke, Drink, Food, Car)");
            ((Room) room).setFreeServiceIncluded(input.nextLine());
        }
        ArrayList<Room> listRoom = FuncWriteFileCSV.parseRoomCSVtoBean(); // truyen thong tin cu vao list
        listRoom.add((Room) room);
        FuncWriteFileCSV.writeRoomFileCsv(listRoom);
        System.out.print("Add new room Successfully....Back to menu Add new service");
    }

    private static void addNewCustomer() {
        Customer customer = new Customer();
        input.nextLine();
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
            System.out.println("Birthday is invalid, please try again");
            System.out.print("Enter Birthday: ");
            customer.setBirthday(input.nextLine());
        }
        System.out.print("Enter Gender (Male/ Female/ Unknown): ");
        customer.setGender(DataInput.validString(input.nextLine()));
        content = "Enter id card: ";
        error = "ID card is invalid";
        customer.setIdCard(DataInput.checkInteger(content, error));
        while (customer.getIdCard() > 999999999 || customer.getIdCard() < 100000000) {
            System.out.println(error);
            customer.setIdCard(DataInput.checkInteger(content, error));
        }
        input.nextLine();
        System.out.println("Enter email: ");
        customer.setEmail(input.nextLine());
        while (DataInput.checkEmail(customer.getEmail())) {
            System.out.println("Email is invalid , please try again");
            System.out.println("Enter email: ");
            customer.setEmail(input.nextLine());
        }
        System.out.print("Enter number phone: ");
        customer.setNumberPhone(input.nextInt());
        input.nextLine();
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
}
